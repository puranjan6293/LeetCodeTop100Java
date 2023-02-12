package TOP_QUESTIONS.Tree;

public class BinaryTree_ZigZag_Level_Order_Traversal {
    /*
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        //Edge case
        if(root==null) return ans;
        //make a queue for storing the levels
        Queue<TreeNode> q = new LinkedList<>();
        //add root to queue
        q.add(root);
        
        int oddEven = 0; //for checking the curr level is odd or even
        //traverse
        while(!q.isEmpty()){
            int size = q.size();
            //for storing the values of each level
            List<Integer> level = new ArrayList<>();
            //loop for zigzag or odd even level
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                //conditions
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                //add values to level
                level.add(node.val);
            }
            //condition for Zigzag or oddeven
            if(oddEven%2!=0){
                Collections.reverse(level);
            }
            ans.add(level);
            oddEven++;
        }
        return ans;
    }
     */
}
