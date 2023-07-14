public class oddEven {
   /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }else{

            ListNode even = new ListNode(-1);
            ListNode connect = even;
            ListNode odd = new ListNode(-1);

            ListNode ans = odd;

            ListNode curr = head;

            boolean flag = true;

            while(curr!=null){

                if(flag==true){
                    ListNode temp = new ListNode(curr.val);
                    odd.next=temp;
                    odd=odd.next;

                    flag = false;
                }else{
                    ListNode temp = new ListNode(curr.val);
                    even.next=temp;
                    even=even.next;

                    flag = true;
                }

                curr=curr.next;
            }

            odd.next=connect.next;


            return ans.next;





        }
    }
} 
}
