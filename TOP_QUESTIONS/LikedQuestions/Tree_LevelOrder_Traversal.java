package TOP_QUESTIONS.LikedQuestions;

public class Tree_LevelOrder_Traversal {
    /*
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        //base case
        if(root==null) return ans;
        //Queue for storing the node
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        //iterate the queue until empty
        while(!q.isEmpty()){
            //size of the queue
            int size = q.size();

            //for storing the values in each level
            List<Integer> level = new LinkedList<>();
            //traverse through the queue
            for(int i=0;i<size;i++){
                //remove nodes from queue
                TreeNode node = q.poll();

                //traverse nodes left subtree
                if(node.left!=null) q.add(node.left);

                //traverse nodes right subtree
                if(node.right!=null) q.add(node.right);

                //add the values
                level.add(node.val);
            }
            //add levels to the ans
            ans.add(level);
        }
        return ans;
    }
     */
}
