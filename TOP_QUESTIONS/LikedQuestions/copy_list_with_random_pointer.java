package TOP_QUESTIONS.LikedQuestions;

public class copy_list_with_random_pointer {
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        //Approach: Using HashMap
        HashMap<Node, Node> map = new HashMap<>();
        //first loop to copy to the map
        Node curr = head;
        while(curr!=null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        //second loop to assign the random and next pointers 
        curr = head;
        while(curr!=null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
