package TOP_QUESTIONS.LikedQuestions;

public class No_of_closed_Islands {
    public int closedIsland(int[][] grid) {
        //Approach: Using DFS, T.C:O(mn), S.C: O(mn)
        /*Base Condition :
        If row or column length is less than 3 all the values will be somehow 
        connected to perimeter So, there can't be a island.*/
        if(grid.length<3 || grid[0].length<3){
            return 0;
        }

        int count = 0;
        //iterate
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[0].length-1;j++){
                if(grid[i][j]==0){
                    if(helper(i, j, grid)){
                        count++;
                    }
                }
            }
        }
        return count;

    }
    //helper function to check the validation
    public boolean helper(int row, int col, int[][] grid){
        /*If we are reaching till to a position which is water or 
        already explored we can return true.
        As this can lead to a probable closed island*/
        if(grid[row][col]==1 || grid[row][col]==-1){
            return true;
        }

        //base case 
        if(row==0 || row==grid.length-1 || col==0 || col==grid[0].length-1){
            return false;
        }
        // To denote that this position is visited, instead of boolean[] visited array.
        grid[row][col] = -1;

        boolean left = helper(row, col-1, grid);
        boolean right = helper(row, col+1, grid);
        boolean up = helper(row-1, col, grid);
        boolean down = helper(row+1, col, grid);

        return left && right && up && down;
    }
}
