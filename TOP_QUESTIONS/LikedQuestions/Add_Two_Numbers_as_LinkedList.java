package TOP_QUESTIONS.LikedQuestions;

public class Add_Two_Numbers_as_LinkedList {
    /*
    //!Carry   = sum/10
    //!size of new Linkedlist = sum%10
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Approach: Using Recursion, T.C: O(n)
        //call the helper function
        return helper(l1, l2, 0);
    }
    public ListNode helper(ListNode l1, ListNode l2, int carry){
        //base case
        if(l1==null && l2==null && carry==0){
            if(carry==0) return null;
            else return new ListNode(1);
        }

        //to avoid null pointer exception with sum
        int sum = ((l1==null?0:l1.val) + (l2==null?0:l2.val))+carry;

        //make a new ListNode, Size of sum%10;
        ListNode head = new ListNode(sum%10);

        //add the values to the new ListNode
        head.next = helper(l1==null?null:l1.next, l2==null?null:l2.next, sum/10);

        //return the head of new ListNode
        return head;
        
    }
     */
}
