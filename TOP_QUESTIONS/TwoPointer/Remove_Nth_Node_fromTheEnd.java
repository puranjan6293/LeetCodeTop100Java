package TOP_QUESTIONS.TwoPointer;

public class Remove_Nth_Node_fromTheEnd {
    /*The idea behind this solution is to use two pointers to
     traverse the list: the first pointer starts at the head and
      moves n steps ahead, while the second pointer starts at the head 
      and moves one step at a time. When the first pointer reaches the end of the list, 
      the second pointer will be pointing to the nth node from the end. 
      We remove the nth node by updating the next pointer of the second pointer. */
    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Approach: using Twopointers, T.C: O(n), S.C: O(1)
        //Initialize thw two pointers first and second, that will be use to find the nth node from the end
        ListNode first = head, second = head;

        //move the first pointer n step ahead
        for(int i=0;i<n;i++){
            first = first.next;
        }
        //if the first pointer becomes null after n steps ahead, that means the head needs to be removed
        if(first==null){
            return head.next;
        }
        // Move both pointers one step at a time until the first pointer reaches the end
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        // By the time the first pointer reaches the end, the second pointer will be pointing to the nth node from the end So we remove the nth node by updating the next pointer of the second pointer
        second.next = second.next.next;

        //return head
        return head;
    }
    */
}
