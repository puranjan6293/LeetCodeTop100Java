package TOP_QUESTIONS.LikedQuestions;

public class Number_of_Islands {
    public int numIslands(char[][] grid) {
        //Approach: Using DFS
        int ilands = 0;

        //traverse 
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                /* If the current cell is '1', increment the number of islands
                 and call dfs*/
                 if(grid[i][j]=='1'){
                     ilands++;
                 }
                 helper(grid, i, j);
            }
        }
        return ilands;
    }
    //helper function for checking is it iland
    public void helper(char[][] grid, int i, int j){
        // Base case: if the current cell is out of bounds or is '0', return
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return;
        }
        // Mark the current cell as '0', for visited
        grid[i][j]='0';

        //call recursion for 4 adjusency
        helper(grid, i+1, j);
        helper(grid, i-1, j);
        helper(grid, i, j+1);
        helper(grid, i, j-1);
    }
}
