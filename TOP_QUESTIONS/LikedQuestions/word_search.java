package TOP_QUESTIONS.LikedQuestions;

public class word_search {
    boolean[][] visited;
    int n,m;
    public boolean exist(char[][] board, String word) {
        //Approach: Using Backtracking 
        n = board.length;
        m = board[0].length;

        visited = new boolean[n][m];

        //traverse through the boadrd and math with word
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                //if char at 0 of word is equa to board of [i][j]
                if(board[i][j]==word.charAt(0)){
                    //check for validation
                    if(valid(i, j, 0, board, word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    //backtrack function
    public boolean valid(int i, int j, int count, char[][] board, String word){
        //base case: out of bond condition
        if(i<0 || i>=n || j<0 || j>=m) return false;

        //if already visited
        if(visited[i][j]) return false;

        //if not match
        if(board[i][j] != word.charAt(count)) return false;

        //if the word is found in the bord, that means count will be equal to the size of the word-1
        if(count == word.length()-1){
            return true;
        }

        //calculation and recursive calls
        //mark the visited array
        visited[i][j] = true;

        //increment the count 
        count++;

        //call recursion for top, down, left, and right
        if(valid(i+1, j, count, board, word) ||
           valid(i, j+1, count, board, word) ||
           valid(i-1, j, count, board, word) ||
           valid(i, j-1, count, board, word)
           ){
               return true;
           }
        
        //mark the curr than unvisited
        visited[i][j] = false;

        return false;

    }

    /*
     * The time complexity of the solution is O(N * M * 4^L), 
     * where N is the number of rows in the board, M is the number of columns in the board, 
     * and L is the length of the target word. 
     * his is because the solution visits each cell in the board (which takes O(N * M) time), 
     * and for each cell, it potentially explores 4 directions recursively until either 
     * the word is found (taking O(4^L) time in the worst case) or all paths have been explored. 
     * Therefore, the overall time complexity is O(N * M * 4^L).
     */
}
