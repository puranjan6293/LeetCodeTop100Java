package TOP_QUESTIONS.Tree;

public class Construct_BinaryTree_From_Inorder_and_Preorder {
    /*
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //Approach: Using Recursion
        return recursion(preorder, inorder, 0, preorder.length-1);

    }
    //recursion method
    public TreeNode recursion(int[] preorder, int[] inorder, int left, int right){
        //base case
        if(index == preorder.length || left>right){
            return null;
        }

        //make new node and add index, that will be the root
        TreeNode root = new TreeNode(preorder[index]);

        //iterate
        for(int i = left; i <= right; i++){
            //if preorder ka idx vlu inorder ka idx vlu ke sath same hua
            if(preorder[index] == inorder[i]){
                //increment the index value
                index++;

                //call recursion for left subtree with right will be i-1
                root.left = recursion(preorder, inorder, left, i-1);

                //call recursion for right subtree left will be i+1
                root.right = recursion(preorder, inorder, i+1, right);

                //break
                break;
            }
        }
        return root;
    }
     */
}
