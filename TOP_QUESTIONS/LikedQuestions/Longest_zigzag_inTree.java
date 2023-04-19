package TOP_QUESTIONS.LikedQuestions;

public class Longest_zigzag_inTree {
    //Definition for a binary tree node.
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
    int maxLen = 0;
    public int longestZigZag(TreeNode root) {
        //Approach: Using Recursion
        helper(root, 0, 0);
        helper(root, 1, 0);

        return maxLen;

    }
    public void helper(TreeNode root, int direc, int currLen){
        //base case 
        if(root==null) return;

        //find max len
        maxLen = Math.max(maxLen, currLen);
        //case 1
        if(direc==1){
            helper(root.left, 0, currLen+1);
            helper(root.right, 1,1);
        }
        else{
            helper(root.right, 1, currLen+1);
            helper(root.left, 0,1);
        }
    }
}
