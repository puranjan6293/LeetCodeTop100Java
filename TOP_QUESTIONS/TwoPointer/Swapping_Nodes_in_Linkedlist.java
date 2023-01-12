package TOP_QUESTIONS.TwoPointer;

public class Swapping_Nodes_in_Linkedlist {
    /*
    public ListNode swapNodes(ListNode head, int k) {
        //Approach: Using TwoPointer, T.C: O(n)
        //Edge case: if the list has no less than k nodes, return the head
        int n = 0; //veriable to store the size of the list
        //Iterate through the lnkedList
        for(ListNode curr = head; curr!=null; curr=curr.next){
            //increment n with each Iteration
            n++;
        }
        // if size of list is less than k, it means there is no kth node
        if(n<k){
            //return the original head
            return head;
        }
        //Find the kth node from the beginning and the kth node from the end
        ListNode first = head; //first pointer is set as head
        //starting from 1st index as linked list is 1-indexed
        for(int i=1;i<k;i++){
            first = first.next;
        }
        
        ListNode second = head; //second pointer is set as head
        //n-k+1 is the second position we need (I calculated, You can try)
        for(int i=1;i<n-k+1;i++){
            second = second.next;
        }

        // Swap the values of the two nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        // Return the head of the updated list
        return head;
    }
     */
}
