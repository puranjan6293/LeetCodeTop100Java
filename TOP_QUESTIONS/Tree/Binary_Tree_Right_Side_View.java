package TOP_QUESTIONS.Tree;

public class Binary_Tree_Right_Side_View {
    /*
    public List<Integer> rightSideView(TreeNode root) {
        //Approach: Using DFS, T.C: O(n)
        //Idea: just add those values which are in depth but 
        //      add all values of right subtree first

        //initilalize ans list
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans, 0);
        return ans;

    }
    //dfs recursion method
    void dfs(TreeNode curr, ArrayList<Integer> ans, int minDepth){
        //base case
        if(curr == null) return;

        //condition for adding those values which are in depth
        if(minDepth==ans.size()){
            ans.add(curr.val);
        }

        //right subtree
        dfs(curr.right, ans, minDepth+1);

        //left subtree
        dfs(curr.left, ans, minDepth+1);
    }
     */
}
