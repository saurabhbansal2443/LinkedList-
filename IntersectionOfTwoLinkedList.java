public class IntersectionOfTwoLinkedList {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int sizeLL(ListNode head){
        int size=0;
        ListNode curr = head ;

        while(curr!=null){
            curr=curr.next;
            size++;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int s1= sizeLL(headA);
        int s2 = sizeLL(headB);

        int diff = s1-s2;

        ListNode ptr1=headA;
        ListNode ptr2=headB;

        if(diff>0){
          
          while(diff>0){
              ptr1=ptr1.next;
              diff--;
          }

        }else{

            while(diff<0){
               ptr2=ptr2.next;
               diff++; 
            }
        }

        while(ptr1!=null && ptr2!=null){

            if(ptr1==ptr2){
                return ptr1;
            }

            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        return null;
    }
}
}
