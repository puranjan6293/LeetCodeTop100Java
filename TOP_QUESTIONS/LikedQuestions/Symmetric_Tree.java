package TOP_QUESTIONS.LikedQuestions;

public class Symmetric_Tree {
    /*
    public boolean isSymmetric(TreeNode root) {
        //Approach: Using Recursion, T.C: O(n)
        //call our helper function
        return helper(root.left, root.right);
    }
    boolean helper(TreeNode left, TreeNode right){
        //base case if both are null
        if(left==null && right==null) return true;
        //if one of them is null
        if(left==null || right==null) return false;

        //check the values & call recursion
        return (left.val==right.val) && helper(left.left, right.right) && helper(left.right, right.left);
    }
     */
}
