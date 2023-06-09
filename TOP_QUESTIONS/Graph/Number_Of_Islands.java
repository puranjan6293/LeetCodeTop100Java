package TOP_QUESTIONS.Graph;

public class Number_Of_Islands {
    public int numIslands(char[][] grid) {
        //initialize the variable to store the no of islands
        int ilands = 0;
        //traverse through the 2D matrix
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                // If the current cell is '1', increment the number of islands and call dfs
                if(grid[i][j]=='1'){
                    //increment the iland value
                    ilands++;
                    //call the recursion or dfs
                    dfs(grid, i, j);
                }
            }
        }
        //return the final value
        return ilands;
    }
    //dfs for traversing the 2D matrix or grid
    private void dfs(char[][] grid, int i, int j){
        // Base case: if the current cell is out of bounds or is '0', return
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return;
        }
        // Mark the current cell as '0'
        grid[i][j] = '0';
        // Recursively call dfs on the neighboring cells
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
