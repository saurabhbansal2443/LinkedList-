public class mergeNodesInBetweenZero {
    class Solution {
        public ListNode mergeNodes(ListNode head) {
            if(head==null){
                return null;
            }
    
            ListNode dummy = new ListNode(-1);
            ListNode ans = dummy;
            ListNode curr = head.next ;
    
            int sum =head.val;
    
            while(curr!=null){
                sum+=curr.val;
    
                if(curr.val==0){
                    ListNode temp = new ListNode(sum);
                    dummy.next = temp;
                    dummy=dummy.next;
                    sum=0;
                }
                curr=curr.next;
            }
    
            return ans.next;
            
        }
    }
}
