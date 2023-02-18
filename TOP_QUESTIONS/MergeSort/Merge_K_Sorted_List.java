package TOP_QUESTIONS.MergeSort;
public class Merge_K_Sorted_List {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //
    public ListNode mergeKLists(ListNode[] lists) {
        /*
        //Approach1: T.C: O(nlogn)
        int n = lists.length;
        ArrayList<Integer> ans = new ArrayList<>();

        //iterate the array
        for(int i=0;i<n;i++){

            //the array contains nodes so, treat i as node
            ListNode curr = lists[i];

            //iterate the curr
            while(curr!=null){

                //add curr values to ans 
                ans.add(curr.val);
                curr = curr.next;
            }
        }
        //sort
        Collections.sort(ans);

        //converting the array values to node
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        //iterate the ans
        for(int i : ans){
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        //head.next because we added -1 in the initial
        return head.next;

        */
        //Approach2: Using Merge sort
        return mergeSort(lists, 0, lists.length-1);

        
    }
    //method for merge sort
    private ListNode mergeSort(ListNode[] lists, int left, int right){
        //base case
        if(left==right) return lists[left];

        if(left<right){
            //devide the list in to two pieces
            int mid = (left+right)/2;

            //make ln1,i.e: start to mid
            ListNode ln1 = mergeSort(lists, left, mid);
            //make ln1,i.e: mid to end
            ListNode ln2 = mergeSort(lists, mid+1, right);

            //merge them
            return merge(ln1, ln2);
        }
        else return null;

    }
        
    //method for merge
    private ListNode merge(ListNode ln1, ListNode ln2){
        if(ln1==null) return ln2;
        if(ln2==null) return ln1;

        //case 1: if ln1.val<ln2.val
        if(ln1.val<ln2.val){
            ln1.next = merge(ln1.next, ln2);
            return ln1;
        }
        else{
            ln2.next = merge(ln1, ln2.next);
            return ln2;
        }
    }
}
