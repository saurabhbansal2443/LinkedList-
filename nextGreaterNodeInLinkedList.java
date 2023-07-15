import java.util.Stack;

public class nextGreaterNodeInLinkedList {
    class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int[] arr ;

        if(head.next==null){
            arr = new int[1];
            return arr;
        }

        ListNode curr = head ;

        Stack<Integer>  main = new Stack<>();

        while(curr!=null){
            main.push(curr.val);
            curr=curr.next;
        }

        arr=new int[main.size()];

        arr[arr.length-1]=0;
        int itr = arr.length-2;

        Stack<Integer>  helper = new Stack<>();
        helper.push(main.pop());

        while(main.size()!=0){

            int ele = main.pop();

            while(helper.size()!=0 && (ele>helper.peek() || helper.peek().equals(ele))){
                 helper.pop();
            }
            if(helper.size()==0){
                arr[itr]=0;
            }else{
            arr[itr]=helper.peek();
            }
            itr--;

            helper.push(ele);

        }

        return arr ;
    }
}
}
