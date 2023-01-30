package TOP_QUESTIONS.LinkedList;

public class Remove_Nth_Node_from_end_of_LinkedList {
    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Approach: Using TwoPointer Algorithms, T.c: O(n)
        //initialize two pointers
        ListNode first = head;
        ListNode second = head;

        //traverse the first pointer n step forward.
        for(int i=0;i<n;i++){
            first = first.next;
        }
        //edge case, if first become null, then just return head.next
        if(first==null) return head.next;

        //now, move both the pointers untill the first.next become null
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        //now the second pointer is the nth pointer. just remove it
        second.next = second.next.next;

        //now return the head of the Linkedlist
        return head;
    }
     */
}
