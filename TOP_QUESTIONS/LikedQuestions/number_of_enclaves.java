package TOP_QUESTIONS.LikedQuestions;

public class number_of_enclaves {
    public int numEnclaves(int[][] grid) {
        //Approach: Using DFS, T.C: O(mn), S.C: O(mn)
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        //traverse through the grid
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                //condition for the position
                if(i==0 || j==0 || i==row-1 || j==col-1){
                    //check if grid of i,j is 1
                    if(grid[i][j]==1){
                        //call the recursion helper function for each direction
                        helper(i, j, grid);
                    }
                }   
            }
        }
        //count the number of 1's in the grid
        for(int i=1;i<row; i++){
            for(int j=1;j<col;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    //helper function to track the route
    public void helper(int row, int col, int[][] grid){
        /* boundary cases, and if we encounter 0(water) or -1(visited element) than,
        we don't need to process further */
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0 || grid[row][col]==-1){
            return;
        }

        //mark grid as visited 
        grid[row][col] = -1;

        //track, the required 4 direction
        helper(row-1, col, grid); //left
        helper(row+1, col, grid); //right
        helper(row, col-1, grid); //up
        helper(row, col+1, grid); //down
        


    }
}
