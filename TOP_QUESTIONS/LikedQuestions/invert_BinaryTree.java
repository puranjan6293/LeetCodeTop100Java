package TOP_QUESTIONS.LikedQuestions;

public class invert_BinaryTree {
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
    public TreeNode invertTree(TreeNode root) {
        //Approach: Just Swapping and recursion

        //base case 
        if(root==null) return null;

        //swap
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //call recursion
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
