package TOP_QUESTIONS.LikedQuestions;

public class LinkedList_cycle_ii {
    class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
    }
    public ListNode detectCycle(ListNode head) {
        //Approach: Using Two Pointers
        ListNode slow = head;
        ListNode fast = head;

        //iterate & check is there any cycle is present
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            //condition for cycle detextion
            if(slow==fast){
                //make the slow as head
                slow = head;

                //again traverse and find where the cycle is begain
                while(slow!=fast){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
