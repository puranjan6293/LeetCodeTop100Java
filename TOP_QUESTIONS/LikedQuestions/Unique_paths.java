package TOP_QUESTIONS.LikedQuestions;

public class Unique_paths {
    public int uniquePaths(int m, int n) {
        //Approach: Using DP, Idea: the formula is (i-1, j)+(i, j-1)
        //T.C: O(mxn)
        int[][] dp = new int[m][n];

        //adding 1 to the matrix
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int j = 0;j<n;j++){
            dp[0][j] = 1;
        }

        //calculating
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        //return the dp
        return dp[m-1][n-1];
    }
}
