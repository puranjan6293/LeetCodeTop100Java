package TOP_QUESTIONS.Backtracking;

public class word_search {
    //we need these global variables
    int n;
    int m;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        //Approach: Using BackTracking algorithm
        n = board.length;
        m = board[0].length;

        //initialize a boolean array to keep track is the index is visited or not
        visited = new boolean[n][m];

        //traverse through the board and keep check is the curr index is valid or not
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                //check the first position of the board where the first character of the word is matched
                if(board[i][j]==word.charAt(0)){
                    //if we find the position, now we have to check validation for moving forward
                    if(valid(i, j, board, word, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    //back track method for check validation
    //x and y is the direction
    public boolean valid(int x, int y, char[][] board, String word, int wordIndex){
        //base cases: 
        //out of bond condition
        if(x<0 || x>=n || y<0 || y>=m){
            return false;
        }
        //if already visited
        if(visited[x][y]){
            return false;
        }
        //if character not match with the word character
        if(board[x][y]!=word.charAt(wordIndex)){
            return false;
        }
        //if the word is found in the bord, that wordIndex count will be equal to the size of the word-1
        if(wordIndex==word.length()-1){
            return true;
        }

        //calculation and recursive calls
        //mark the visited array
        visited[x][y] = true;
        //increment the wordIndex 
        wordIndex++;
        //call recursion for top, down, left, and right
        if(
            valid(x+1, y, board, word, wordIndex) ||
            valid(x-1, y, board, word, wordIndex) ||
            valid(x, y+1, board, word, wordIndex) ||
            valid(x, y-1, board, word, wordIndex)
        ){
            return true;
        }
        //mark the curr than unvisited
        visited[x][y] = false;

        return false;

    }
}
