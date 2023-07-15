public class DeleteMiddleOfLinkedList {
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if(head==null || head.next==null){
                return null;
            }
    
            ListNode fast = head ;
            ListNode slow = head ;
            ListNode pre = head;
    
            while(fast!=null && fast.next!=null){
                pre = slow;
    
                slow=slow.next;
                fast=fast.next.next;
            }
    
            System.out.println(pre.val);
            
            pre.next=slow.next;
    
            return head;
        }
    }
}
