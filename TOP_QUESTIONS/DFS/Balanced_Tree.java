package TOP_QUESTIONS.DFS;

public class Balanced_Tree {
    /*
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        else if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }

        //call recursion
        return isBalanced(root.left) && isBalanced(root.right);
    }
    //find the height
    int height(TreeNode root){
        //base case
        if(root==null) return 0;

        //find the left height and right height
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }
     */
}
