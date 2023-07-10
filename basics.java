public class basics{
    public static void main(String[] args) {
        Linked list=new Linked();

        //System.out.println(list.size);

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

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
}