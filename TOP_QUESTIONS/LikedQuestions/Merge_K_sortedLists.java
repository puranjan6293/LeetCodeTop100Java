package TOP_QUESTIONS.LikedQuestions;

public class Merge_K_sortedLists {
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

    public ListNode mergeKLists(ListNode[] lists) {
        // Approach: Using MergeSort Algorithm
        return mergeSort(lists, 0, lists.length - 1);

    }

    // method for merge sort
    private ListNode mergeSort(ListNode[] lists, int left, int right) {
        // base case
        if (left == right)
            return lists[left];

        // case: if left<right
        if (left < right) {
            // devide the list in to two pieces
            int mid = (left + right) / 2;

            // left side: start to mid
            ListNode ll = mergeSort(lists, left, mid);

            // right side: mid to end
            ListNode lr = mergeSort(lists, mid + 1, right);

            // merge them
            return merge(ll, lr);
        } else
            return null;

    }

    // method for merge
    private ListNode merge(ListNode l1, ListNode l2) {
        // base case
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        // case 1: value of l1 is less than value of l2
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        }
        // case 2: value of l2 is less than value of l1
        else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
