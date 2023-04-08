package TOP_QUESTIONS.LikedQuestions;

public class construct_tree_from_pre_and_inorder {
    /*
    int idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //Approach: Using recursion
        //call our helper function
        return helper(preorder, inorder, 0, preorder.length-1);

    }
    public TreeNode helper(int[] preorder,int[] inorder,int left,int right){
        //base case
        if(idx==preorder.length || left>right){
            return null;
        }

        //obeously the 0'th index of preorder array is our root
        TreeNode root = new TreeNode(preorder[idx]);

        //iterate the inorder array
        for(int i=left; i<=right;i++){
            //compare the iindex values between the two arrays
            if(preorder[idx]==inorder[i]){
                //increment the idx 
                idx++;

                //call recursion for left and right subtree 
                root.left = helper(preorder, inorder, left, i-1);
                root.right = helper(preorder, inorder, i+1, right);
                
                break;
            }
        }
        return root;

    }
     */
}
