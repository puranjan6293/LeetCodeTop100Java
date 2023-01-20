package TOP_QUESTIONS.DFS;

public class Recover_The_BST {
    /*
    //initialize the variables
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        //traverse
        traverse(root);

        //swap the values of the two nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    void traverse(TreeNode root){
        //edge case
        if(root==null) return;

        //traverse the left subtree
        traverse(root.left);
        
        //if first element is not been found, assign it to prev
        if(prev!=null){
            if(first==null && prev.val>=root.val){
                first = prev;
            }
        }

        //if the first element is found, assign it to the root
        if(first!=null && prev.val>=root.val){
            second = root;
        }
        //assign the prev to root
        prev = root;

        //traverse the right subtree 
        traverse(root.right);
    }
     */
}
