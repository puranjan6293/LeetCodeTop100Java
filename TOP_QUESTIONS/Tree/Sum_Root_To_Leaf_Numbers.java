package TOP_QUESTIONS.Tree;

public class Sum_Root_To_Leaf_Numbers {
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
////////////////////////////////////////////////////////////////
    int sum;
    public int sumNumbers(TreeNode root) {
        
        //Approach1, using mathematics and dfs, T.C: O(n)
        solve(root, 0);
        return sum;

    }
    public void solve(TreeNode root, int num){
        //base case
        if(root.left==null && root.right==null){
            num = num*10 + root.val;
            sum+=num;
            return;
        }
        num = num*10 + root.val;

        //if left not null
        if(root.left!=null) solve(root.left, num);

        //if right is not null
        if(root.right!=null) solve(root.right, num);
    }

    /*
        //Approach2: Using StringBuilder and recursion
        helper(root, new StringBuilder());
        int sum = 0;
        for(String str : list){
            sum += Integer.valueOf(str);
        }
        return sum;


    }
    private void helper(TreeNode root, StringBuilder sb){
        //add root value to sb
        sb.append(root.val);

        //left subtree not null
        if(root.left!=null){
            System.out.println(root.val);
            //call recursion
            helper(root.left, new StringBuilder(sb));
        }
        //right subtree not null
        if(root.right!=null){
            System.out.println(root.val);
            helper(root.right, new StringBuilder(sb));
        }
        //both
        if(root.left==null && root.right==null){
            //add to list
            list.add(new StringBuilder(sb).toString());
            return;
        }
    }
    //the List
    List<String> list = new LinkedList<>();
    */
}
