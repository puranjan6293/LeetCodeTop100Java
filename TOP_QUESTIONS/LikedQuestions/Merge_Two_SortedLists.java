package TOP_QUESTIONS.LikedQuestions;

public class Merge_Two_SortedLists {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // base case
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        // case1: if list1.val<list2.val, then add the values in list1 and return that
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }

        // case2: if list2.val<list1.val, then add the values in list2 and return that
        else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
