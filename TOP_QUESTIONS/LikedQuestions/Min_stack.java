package TOP_QUESTIONS.LikedQuestions;

public class Min_stack {
    //design a Stack
    private class Node{
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    //initialize the head
    private Node head;
    
    public void push(int x) {
        if (head == null) 
            head = new Node(x, x, null);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
}
