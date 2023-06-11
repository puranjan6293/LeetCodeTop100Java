package TOP_QUESTIONS.DP;

public class House_Robber {
    public int rob(int[] nums) {
        //Approach: Using Buttom up DP
        if(nums==null || nums.length==0){
            return 0;
        }
        int n = nums.length;
        //dp array
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];

        //loop
        for(int i=2;i<=n;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i-1]);
        }
        return dp[n];
    }
}
