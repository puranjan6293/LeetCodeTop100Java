package TOP_QUESTIONS.DFS;

public class Pacific_Atlantic_WaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        //Approach: Using DFS
        List<List<Integer>> ans = new ArrayList<>();
        int r = heights.length;
        int c = heights[0].length;

        //pacific and atlantic, to represent the cells that have been reached by water from the Pacific and Atlantic oceans, respectively.
        boolean[][] pacific = new boolean[r][c];
        boolean[][] atlantic = new boolean[r][c];

        /*For each column in the heights array, do the following:
        Call the dfs() method to recursively explore all cells in the column that
         can be reached by waterfrom the Pacific ocean. 
        Call the dfs() method to recursively explore all cells in the column that can be 
         reached by water from the Atlantic ocean.*/

        for(int i=0;i<c;i++){
            dfs(0, i, heights[0][i], heights, pacific);
            dfs(r-1, i, heights[r-1][i], heights, atlantic);
        }
        for(int j=0;j<r;j++){
            dfs(j, 0, heights[j][0], heights, pacific);
            dfs(j, c-1, heights[j][c-1], heights, atlantic);
        }

        //For each cell in the heights array, if the cell is marked as reachable by both the Pacific and Atlantic oceans, add the cell's coordinates to the output list.
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pacific[i][j]&&atlantic[i][j]){
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }
    //dfs function
    public void dfs(
        int i, int j, 
        int prev, int[][] heights, 
        boolean[][] ocean){
            //base case, avoid out of bound
            if(i<0 || i>=ocean.length || j<0 || j>=ocean[0].length){
                return;
            }
            //if current element is greater than prev, than just return
            if(heights[i][j]<prev || ocean[i][j]) return;
            ocean[i][j] = true;
            //call recursion for all four direction
            dfs(i+1, j, heights[i][j], heights, ocean);
            dfs(i-1, j, heights[i][j], heights, ocean);
            dfs(i, j+1, heights[i][j], heights, ocean);
            dfs(i, j-1, heights[i][j], heights, ocean);

        }
}
