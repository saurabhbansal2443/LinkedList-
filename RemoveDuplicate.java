public class RemoveDuplicate {
    
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next==null){
            return head;
        }
    
        ListNode dummy = new ListNode(-200);
        ListNode ans = dummy; 
           ListNode curr = head ;

           while(curr!=null){

               if(dummy.val!=curr.val){
                 ListNode temp = new ListNode(curr.val);

                 dummy.next=temp;
                 dummy=dummy.next;
               }

               curr= curr.next;
           }

           return ans.next;
    }
}
}
