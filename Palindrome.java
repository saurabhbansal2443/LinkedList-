public class Palindrome {
    
 
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {

    public ListNode reverse(ListNode head ){
        ListNode curr = head ;
        ListNode pre = null;

        while(curr!=null){
            ListNode temp = curr.next;

            curr.next=pre ;

            pre = curr;
            curr= temp;
        }

        return pre ;


    }

    public ListNode midLL(ListNode head){
        ListNode fast = head ;
        ListNode slow = head ;
        ListNode pre = null;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            pre=slow;
            slow = slow.next;
        }
        pre.next=null;
        return slow ;
    }
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next==null){
            return true;
        }

        ListNode mid = midLL(head);
       

        ListNode rev = reverse(mid);

        ListNode temp = rev;

        
         


        while(head!=null){

            


            if(rev.val!=head.val){
                return false;
            }

            
            rev=rev.next;
            head = head.next;
        }

        return true;



    }
}
}
