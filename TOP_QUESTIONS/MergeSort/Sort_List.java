package TOP_QUESTIONS.MergeSort;

public class Sort_List {
    /*\
    public ListNode sortList(ListNode head) {
        //Approach, Using Merge sort, T.C : O(n)
        //Edge case: While LinkedList is null
        if(head==null || head.next==null) return head;

        ListNode mid = getMiddle(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        right = sortList(right);

        return merge(left, right);
    }
    //Find the middle 
    private ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //merge
    private ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(left!=null && right!=null){
            if(left.val<right.val){
                curr.next = left;
                left = left.next;
            }
            else{
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if(left!=null){
            curr.next = left;
        }
        else{
            curr.next = right;
        }
        return dummy.next;
        // if(left==null) return right;
        // if(right==null) return left;

        // if(left.val<right.val){
        //     left.next = merge(left.next, right);
        //     return left;
        // }
        // else{
        //     right.next = merge(left, right.next);
        //     return right;
        // }
    }
     */
}
