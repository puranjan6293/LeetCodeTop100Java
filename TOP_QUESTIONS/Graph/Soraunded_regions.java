package TOP_QUESTIONS.Graph;

public class Soraunded_regions {
    public void solve(char[][] board) {
        //Approach: Using Backtracking
        //Idea: first we traverse all the boundries, if there is a 'O' present we mark that aa 'P'
        /*after that again we traverse through the board, 
        if there is any 'O', present than we replace that with 'X'.
        else if there is a 'P' is there than we replace that with 'O'.*/

        int r = board.length;
        int c = board[0].length;

        // 1a) Capture unsurrounded regions - top and bottom row (replace O with P)
        for(int i=0;i<c;i++){
            if(board[0][i]=='O'){
                dfs(0, i, board);
            }
            if(board[r-1][i]=='O'){
                dfs(r-1, i, board);
            }
        }
        // 1b) Capture unsurrounded regions - Left and right columns (replace O with P)
        for(int j=0;j<r;j++){
            if(board[j][0]=='O'){
                dfs(j, 0, board);
            }
            if(board[j][c-1]=='O'){
                dfs(j, c-1, board);
            }
        }

        //main loop
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X'; //making the soraunded regions 'O' --> 'X'
                }
                if(board[i][j]=='P'){
                    board[i][j]='O'; //making the soraunded regions 'P' --> 'O'
                }
            }
        }
    }
    //dfs method
    public void dfs(int i, int j, char[][] board){
        //base case 
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O'){
            return;
        }
        //make the 'O' position as 'P'
        board[i][j] = 'P';
        //call dfs for all direction
        dfs(i+1, j, board);
        dfs(i-1, j, board);
        dfs(i, j+1, board);
        dfs(i, j-1, board);
    }
}
