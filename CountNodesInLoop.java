

public class CountNodesInLoop {
    //{ Driver Code Starts
// driver code


    public static void removeLoop(Node head){
       if(head==null){
           return ;
       }
       
       Node fast = head ;
       Node slow = head ;
       Node pre = null;
       Node ptr = head;
       
       while(fast!=null && fast.next!=null){
           pre = slow ;
           slow= slow.next;
           fast = fast.next.next;
           
           if(fast == slow){
               
               while(slow!=ptr){
                   pre=slow;
                   slow=slow.next;
                   ptr=ptr.next;
               }
               
               pre.next=null;
               return;
               
           }
       }
    }
}

