package TOP_QUESTIONS.DP;

public class climbing_stairs {
    public int climbStairs(int n) {
        //Approach: Using general dp
        //T.C: O(n), S.C:O(n)
        //base case 
        if(n<=2){
            return n;
        }
        //make a dp array
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n;i++){
            // To climb i steps, you can either take 1 step from step (i - 1) or 2 steps from step (i - 2)
            // Therefore, the total number of distinct ways to climb i steps is the sum of the distinct ways to climb (i - 1) steps and (i - 2) steps
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
