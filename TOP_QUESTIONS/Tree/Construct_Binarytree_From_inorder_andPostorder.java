package TOP_QUESTIONS.Tree;

public class Construct_Binarytree_From_inorder_andPostorder {
    /*
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode helper(int[] inorder, int il, int ir, int[] postorder, int pl, int pr){
        //base case, if left side>right side
        if(il>ir || pl>pr){
            return null;
        }
        
        //add root to new TreeNode
        TreeNode root = new TreeNode(postorder[pr]);

        //iterate
        int idx = 0;
        for(int i=0;i<inorder.length;i++){
            //if this condition satishfy
            if(inorder[i] == root.val){
                //replace the idx with i
                idx = i;
                break;
            }
        }
        root.left = helper(inorder, il, idx-1, postorder, pl, pl+idx-il-1);
        root.right = helper(inorder, idx+1, ir, postorder, pl+idx-il, pr-1);

        return root;

    }
     */
}
