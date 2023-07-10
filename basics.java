public class basics {
    public static void main(String[] args) {
        Linked list = new Linked();

       list.addLast(30);
       list.addLast(40);
       list.addLast(50);
      
        System.out.println(list.removeLast());
       list.display();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linked {
    Node head;
    Node tail;
    int size;

    Linked() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int val) {

        Node temp = new Node(val);

        if (this.size == 0) {
            this.head = this.tail = temp;
        } else {
            temp.next = this.head;
            this.head = temp;
        }

        this.size++;
    }

    public void display() {
        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(int val) {
        Node temp = new Node(val);

        if (this.size == 0) {
            this.head = this.tail = temp;
        } else {
            this.tail.next = temp;
            this.tail = temp;
        }
        this.size++;
    }

    public void addAt(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("InvalidIndex");

        } else if (idx == 0) {
            this.addFirst(val);
        } else if (idx == this.size) {
            this.addLast(val);
        } else {
            Node temp = new Node(val);
            Node curr = this.head;
            while (idx > 1) {
                curr = curr.next;
                idx--;
            }

            Node nbr = curr.next;
            curr.next = temp;
            temp.next = nbr;
            this.size++;

        }
    }

    public int removeFirst() {
        if (this.size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int ele = head.data;
            this.head = this.tail = null;
            this.size--;
            return ele;

        } else {
            int ele = head.data;
            this.head = this.head.next;
            this.size--;
            return ele;
        }
    }

    public int removeLast() {
        if (this.size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int ele = head.data;
            this.head = this.tail = null;
            this.size--;
            return ele;
        } else {
            Node curr = this.head;
            for (int i = 0; i <size - 2; i++) {
                curr = curr.next;
            }
            int ele = tail.data;
            curr.next = null;
            this.tail = curr;
            this.size--;

            return ele;

        }
    }
}