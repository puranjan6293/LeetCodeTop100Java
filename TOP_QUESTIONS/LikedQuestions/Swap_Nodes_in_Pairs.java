package TOP_QUESTIONS.LikedQuestions;

public class Swap_Nodes_in_Pairs {
    // Definition for singly-linked list.
    public class ListNode {
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
    public ListNode swapPairs(ListNode head) {
        //Approach: using dummyNode, T.C: O(n), S.C: O(1)
        //base case
        if(head==null || head.next==null) return head;

        //make a dummy node
        ListNode dummy = new ListNode(0);
        //make dummy as prev
        ListNode prev = dummy;
        //make head as curr
        ListNode curr = head;

        // Iterate through the linked list as long as the current node and the next node exist.
        while(curr!=null && curr.next!=null){
            // Swap the pairs of nodes by changing the pointers.
            prev.next = curr.next;
            curr.next = prev.next.next;
            prev.next.next = curr;

            // Move the previous and current nodes to the next pair of nodes.
            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
