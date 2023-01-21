package TOP_QUESTIONS.DFS;

public class Binary_Tree_Right_View {
    /*
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfsRecursion(root, ans, 0);
        return ans;
    }
    //dfs traversal with minDepth
    void dfsRecursion(TreeNode curr, List<Integer> ans, int minDepth){
        if(curr==null) return;

        //if minDepth is equal to the size of the arrayList then add the curr value
        if(minDepth==ans.size()){
            ans.add(curr.val);
        }
        //call recursion for the right and then left subtree
        dfsRecursion(curr.right, ans, minDepth+1);
        dfsRecursion(curr.left, ans, minDepth+1);
    }
     */
}
