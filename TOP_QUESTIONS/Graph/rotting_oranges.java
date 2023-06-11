package TOP_QUESTIONS.Graph;

public class rotting_oranges {
    public int orangesRotting(int[][] grid) {
        //Approach: Using BFS, T.C:O(m.n)
        int r = grid.length;
        int c = grid[0].length;

        //Store the positions of rotten oranges in a Queue
        Queue<int[]> queue = new LinkedList<>();
        //intitalize the count of fresh oranges
        int freshorange = 0;
        //Traverse the grid to find rotten oranges and count fresh oranges
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                //if the we found rotten orange, than put it into the Queue
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                //else count the fresh oranges
                else if(grid[i][j]==1){
                    freshorange++;
                }
            }
        }
        //initialize the dirrections and time
        int [][] directions = {{1,0}, {-1,0}, {0,1}, {0, -1}};
        int minutes = 0;

        //traverse
        while(!queue.isEmpty() && freshorange>0){
            int size = queue.size();

            for(int i=0;i<size;i++){
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                for(int[] dir : directions){
                    int newRow = row+dir[0];
                    int newCol = col+dir[1];

                    // Check if the new position is within the grid
                    if(newRow>=0 && newRow<r && newCol>=0 && newCol<c && grid[newRow][newCol]==1){
                        //mark the fresh orange as rotten
                        grid[newRow][newCol]=2;
                        queue.offer(new int[]{newRow, newCol});
                        freshorange--;
                    }
                }

            }
            minutes++;
        }
        return freshorange==0 ? minutes : -1;
    }
}
