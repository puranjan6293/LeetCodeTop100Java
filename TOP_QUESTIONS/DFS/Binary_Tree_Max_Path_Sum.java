package TOP_QUESTIONS.DFS;

public class Binary_Tree_Max_Path_Sum {
    /*
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        //Approach using DFS
        findMax(root);
        return max;

    }
    int findMax(TreeNode root){
        //Edge case if root is null
        if(root==null) return 0;

        //find the left and right max
        int leftMax = Math.max(0, findMax(root.left));
        int rightMax = Math.max(0, findMax(root.right));

        //find the max value between max and sum of left,right and root
        max = Math.max(max, leftMax+rightMax+root.val);

        //return the max value between the left, rigth and add with root value
        return Math.max(leftMax, rightMax)+root.val;
    }
     */
}
