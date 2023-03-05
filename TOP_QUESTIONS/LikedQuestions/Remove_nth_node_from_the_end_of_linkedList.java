package TOP_QUESTIONS.LikedQuestions;

public class Remove_nth_node_from_the_end_of_linkedList {
    //default function for Linked List
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Approach: Using Two Pointer Algorithm

        ListNode first = head;
        ListNode second = head;

        //move to the n-1 th node
        for(int i=0;i<n;i++){
            first = first.next;
        }

        //edge case if the left becomes null
        if(first==null) return head.next;

        //move both the pointer
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }

        //now the cond pointer is our nth node so, just remove it
        second.next = second.next.next;

        return head;
    }
}
