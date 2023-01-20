package TOP_QUESTIONS.DFS;

public class Valid_BST {
    /*
    public boolean isValidBST(TreeNode root) {
        //Approach: Using DFS, T.C: O(n)
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean dfs(TreeNode root, long min, long max){
        if(root==null) return true;

        if(root.val>=max || root.val<=min) return false;
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }
     */
}
