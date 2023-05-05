package TOP_QUESTIONS.LikedQuestions;

public class kth_smallest_element_in_BST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //!solution
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        //Approach Using inOrder traversal
        inorder(root, k);
        return ans;
    }
    
    public void inorder(TreeNode root, int k){
        //base case
        if(root==null) return;

        //left subtree
        inorder(root.left, k);

        //pre-increment the count, and if the condition satisfy
        if(++count == k){
            //assign the root.val to ans
            this.ans = root.val;
        }

        //right subtree
        inorder(root.right, k);
    }
}
