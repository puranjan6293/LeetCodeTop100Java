package TOP_QUESTIONS.LikedQuestions;

public class right_view_of_aTree {
    /*
    public List<Integer> rightSideView(TreeNode root) {
        //!Approach: Using DFS, T.C: O(n)
        //!Idea: just add those values which are in depth but 
        //!      add all values of right subtree first
        
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans, 0);
        return ans;
    }
    public void helper(TreeNode root, ArrayList<Integer> ans, int minDepth){
        //!base case 
        if(root==null) return;

        //!condition for add those values which are in minDepth, first look in right side
        if(minDepth==ans.size()){
            ans.add(root.val);
        }

        //!right subtree
        helper(root.right, ans, minDepth+1);

        //!left subtree
        helper(root.left, ans, minDepth+1);

    }
     */
}
