public class basics{
    public static void main(String[] args) {
        
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
}