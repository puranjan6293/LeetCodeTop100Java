package TOP_QUESTIONS.Tree;

public class Unique_Binary_Search_tree {
    public int numTrees(int n) {
        /*
        //Approach1: Using HashMap, T.C: O(n^2)
        //base case
        if(n==0 || n==1) return 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        //initialize ans
        int ans = 0;

        //iterate
        for(int i=1;i<=n;i++){
            //case1 if map not contains i-1
            if(!map.containsKey(i-1)){
                map.put(i-1, numTrees(i-1));
            }
            //case2 if map not contain n-i
            if(!map.containsKey(n-i)){
                map.put(n-i, numTrees(n-i));
            }
            //update ans
            ans +=map.get(i-1)*map.get(n-i);
        }
        return ans;
        */
        //Approach2: Using DP
        int[]dp = new int[n+1];

        //base case
        dp[0] = 1;
        dp[1] = 1;

        //iterate
        for(int i=2;i<=n;i++){
            // eg for i=4
            // we consider 0,3 + 1,2 + 2,1 + 3,0 , here i-1=3
            for(int j=0, k=i-1; j<i; j++, k--){
                dp[i] += dp[j]*dp[k];
            }
        }
        return dp[n];
    }
}
