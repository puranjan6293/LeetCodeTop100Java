package TOP_QUESTIONS.DP;

public class min_cost_climbing_stairs {
    public int minCostClimbingStairs(int[] cost) {
        //Approach: Using DP buttom up approach
        int n = cost.length;
        int[] dp = new int[n];

        //mincost for first step and second step
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2;i<n;i++){
            dp[i] = cost[i]+Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}
