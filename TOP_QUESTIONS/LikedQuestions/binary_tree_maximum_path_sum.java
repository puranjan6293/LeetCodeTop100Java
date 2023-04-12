package TOP_QUESTIONS.LikedQuestions;

public class binary_tree_maximum_path_sum {
    /*
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        //Approach: Using recursion
        helper(root);
        return max;
    }
    public int helper(TreeNode root){
        //base case 
        if(root==null) return 0;

        //find left and right max
        int leftMax = Math.max(0, helper(root.left));
        int rightMax = Math.max(0, helper(root.right));

        //update the max
        max = Math.max(max, leftMax+rightMax+root.val);

        return Math.max(leftMax, rightMax)+root.val;
    }
     */
}
