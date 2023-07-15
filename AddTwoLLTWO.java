import java.util.Stack;
public class AddTwoLLTWO {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1= new Stack<>();
         Stack<Integer> st2= new Stack<>();

         ListNode curr1=l1;

         while(curr1!=null){
             st1.push(curr1.val);
             curr1=curr1.next;
         }

         ListNode curr2=l2;

         while(curr2!=null){
             st2.push(curr2.val);
             curr2=curr2.next;
         }

         int carry =0;

         ListNode dummy =null;
        ListNode ans = dummy;
         while(st1.size()>0 || st2.size()>0){
             int val1 = st1.size()>0?st1.pop():0;
             int val2 = st2.size()>0?st2.pop():0;

             int sum = val1+val2+carry;

             carry = sum/10;
             int d = sum%10;

            ListNode temp = new ListNode(d);
            if(dummy==null){
                dummy=temp;
            }else{
            temp.next=dummy;
            dummy=temp;
            }

         }

         if(carry>0){
           ListNode temp = new ListNode(carry);
            temp.next=dummy;
            dummy=temp;   
         }

         //ListNode fans = reverse(ans.next);

         return dummy;


    }
}

