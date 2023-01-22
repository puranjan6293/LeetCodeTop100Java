package TOP_QUESTIONS.DFS;

public class Kth_Smmallest_Element_In_BST {
    /*
    private int count = 0;
    private int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        //Approach: Using DFS inorder traversal, T.C: (n), S.C: O(h)
        dfs(root, k);
        return ans;
    }
    public void dfs(TreeNode root, int k){
        //edge case
        if(root==null) return;
        //inorder traversal
        dfs(root.left, k);
        //condition
        if(++count==k){
            //asign the node value to ans
            this.ans = root.val;
            return;
        }
        dfs(root.right, k);
    }
     */
}
