package TOP_QUESTIONS.DFS;

public class max_area_of_island {
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        //Approach: Using DFS
        //Idea: Same as finding no of islands problem, in this question we have count the depth
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                maxArea = Math.max(maxArea, dfs(i, j, grid));
            }
        }
        return maxArea;
    }
    public int dfs(int i, int j, int[][] grid){
        //base case
        if(
            i<0 || i>=grid.length ||
            j<0 || j>=grid[0].length ||
            grid[i][j]==0
        ){
            return 0;
        }
        //else mark the position as visited by making that 0
        grid[i][j]=0;
        //here 1+, because we have to count the first position also
        return (1+dfs(i+1, j, grid)+dfs(i-1, j, grid)+dfs(i, j+1, grid)+dfs(i, j-1, grid));
    }
}
