package TOP_QUESTIONS.Recursion;

public class Reverse_Nodes_in_KGroup {
    /*
    public ListNode reverseKGroup(ListNode head, int k) {
        //Approach1, Using Recursion, T.C: O(n)
        //initialize a count variable
        int count = 0;
        ListNode curr = head;
        //first k nodes
        while(curr!=null && count!=k){
            curr = curr.next;
            count++;
        }
        //if(k+1)th node is found
        if(count==k){
            //call recursion for reversing the list with k+1 node as head
            curr = reverseKGroup(curr, k);

            //note: 
            //head is pointer to direct part
            //curr is pointer to reverse part

            //reverse
            while(count-->0){
                ListNode temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
            }
            //move to next group so make head as curr
            head = curr;
        }
        return head;
    }
     */
}
