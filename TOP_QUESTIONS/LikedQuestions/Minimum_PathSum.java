package TOP_QUESTIONS.LikedQuestions;

public class Minimum_PathSum {
    public int minPathSum(int[][] grid) {
        //Approach: using DP, T.C: O(mxn)
        int m= grid.length;
        int n=grid[0].length;

        int memo[][]=new int[m][n];
        //call recursion
        return find(grid,m-1,n-1,memo);  
    }
    public static int find(int [][]grid,int m,int n,int memo[][]){
        //case 1, if m and n is zero
        if (m==0&&n==0) return grid[m][n];

        //case 2, if m and n is less than zero
        else if (m<0||n<0) {
            return Integer.MAX_VALUE;

            //case 3, if dp[m][n] is not zero
        } else if (memo[m][n]!=0) {
            return memo[m][n];
        }
        //find the min path sum
        return memo[m][n]=grid[m][n]+Math.min(find(grid,m-1,n,memo),find(grid,m,n-1,memo));
    }
}
