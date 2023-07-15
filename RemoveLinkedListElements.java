public class RemoveLinkedListElements {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(head==null) return head;
    
    
            ListNode dummy = new ListNode(-1);
            ListNode ans = dummy;
    
            ListNode curr = head ;
    
            while(curr!=null){
    
                if(curr.val!=val){
                   ListNode temp = new ListNode(curr.val);
                   dummy.next=temp;
                   dummy=dummy.next; 
                }
    
                curr=curr.next;
            }
    
            return ans.next;
        }
    }
}
