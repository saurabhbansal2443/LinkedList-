
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoSortedList {

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) {
                return list2;
            } else if (list2 == null) {
                return list1;
            } else {

                ListNode dummy = new ListNode(-1);
                ListNode ans = dummy;

                ListNode ptr1 = list1;
                ListNode ptr2 = list2;

                while (ptr1 != null && ptr2 != null) {

                    if (ptr1.val < ptr2.val) {
                        ListNode temp = new ListNode(ptr1.val);
                        dummy.next = temp;
                        dummy = dummy.next;
                        ptr1 = ptr1.next;
                    } else {
                        ListNode temp = new ListNode(ptr2.val);
                        dummy.next = temp;
                        dummy = dummy.next;
                        ptr2 = ptr2.next;
                    }
                }

                if (ptr1 == null) {
                    dummy.next = ptr2;
                } else {
                    dummy.next = ptr1;
                }

                return ans.next;

            }
        }
    }
}
