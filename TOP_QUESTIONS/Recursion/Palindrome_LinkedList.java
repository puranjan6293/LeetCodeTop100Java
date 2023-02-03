package TOP_QUESTIONS.Recursion;

public class Palindrome_LinkedList {
    /*
    boolean flag = true;
    public boolean isPalindrome(ListNode head) {
        /*
        //Approach1, Using Stack
        //add values in stack
        Stack st = new Stack();
        ListNode curr = head;
        while(curr!=null){
            st.push(curr.val);
            curr = curr.next;
        }
        //remove element from stack and match with head
        while(head!=null){
            if(head.val!=(int)st.pop()) return false;
            head = head.next;
        }
        return true;
        //////////////////////////////////

        //Approach2, Using recursion
        recursion(head, head);
        return flag;

        
    }
    public ListNode recursion(ListNode node1, ListNode node2){
        //base conditions
        if(node2==null) return node1;
        if(node2.next==null) return node1.next;

        //call recursion
        ListNode check = recursion(node1.next, node2.next.next);

        //if values are same
        if(check.val!=node1.val){
            flag = false;
        }

        //return the next of check
        return check.next;
    }
     */
}
