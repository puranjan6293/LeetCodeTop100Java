package TOP_QUESTIONS.Recursion;

public class Add_Two_Numbers_LinkedList {
    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Approach, Using Recursion, T.C: O(n)
        return helper(l1, l2, 0);
    }
    public ListNode helper(ListNode l1, ListNode l2, int carry){
        //base case
        if(l1==null && l2==null && carry==0){
            if(carry==0) return null;
            else return new ListNode(1);
        }

        //function to avoid NullPointerException
        int sum = ((l1==null?0:l1.val) + (l2==null?0:l2.val))+carry;

        //make a new ListNode, size is sum%10
        ListNode head = new ListNode(sum%10);

        //Set the next pointer to be the sum of the next element of the two lists and the carry
        head.next = helper((l1==null)?null:l1.next, l2==null?null:l2.next, sum/10);

        return head;
    }
     */
}
