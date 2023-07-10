public class basics{
    public static void main(String[] args) {
        Linked list=new Linked();

        //System.out.println(list.size);

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.addLast(40);
        list.addLast(50);

        list.addAt(900, 2);
        list.addAt(700, 3);

        list.display();

    }
}

class Node{
    int data ;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Linked{
    Node head ;
    Node tail ;
    int size;

    Linked(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void addFirst(int val){

        Node temp = new Node(val);

        if(this.size==0){
           this.head=this.tail=temp;
        }else{
            temp.next=this.head;
            this.head=temp;
        }

        this.size++;
    }

    public void display(){
        Node temp = this.head;

        while(temp!=null){
            System.out.print(temp.data + "  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void addLast(int val){
        Node temp = new Node(val);

        if(this.size==0){
            this.head=this.tail=temp;
        }else{
            this.tail.next=temp;
            this.tail=temp;
        }
        this.size++;
    }

    public void addAt(int val , int idx){
        if(idx<0 || idx>size){
            System.out.println("InvalidIndex");

        }else if(idx==0){
            this.addFirst(val);
        }else if(idx==this.size){
            this.addLast(val);
        }else{
            Node temp = new Node(val);
            Node curr=this.head;
            while(idx>1){
                curr=curr.next;
                idx--;
            }

            Node nbr = curr.next;
            curr.next=temp;
            temp.next=nbr;
            this.size++;

        }
    }
}