package TOP_QUESTIONS.LinkedList;

public class Add_Two_Numbers {
    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Approach: T.C: O(n)
        //create a dummy Linkedlist
        ListNode dummy = new ListNode(0);
        //initialize a pointer
        ListNode curr = dummy;
        //initialize carry as 0
        int carry = 0;
        
        // while loop will run, until l1 OR l2 not reaches null OR
        // if they both reaches null. But our carry has some value in it,
        // We will add that as well into our list

        while(l1!=null || l2!=null || carry==1){
            //initialize the sum
            int sum = 0;
            //adding l1 to our sum and moving l1
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            //adding l2 to our sum and moving l2
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            //if we have carry, then add carry to sum
            sum+=carry;
            // if we get carry, then divide it by 10 to get the carry
            carry = sum/10;

            // the value we'll get by moduloing it, will become as new node so. add it to our list
            ListNode node = new ListNode(sum%10);
            // curr will point to that new node if we get
            curr.next = node;
            //update curr eveytime
            curr = curr.next;

        }
        // return dummy.next bcz, we don't want the value we have consider in it intially!!
        return dummy.next;
    }
     */
}
