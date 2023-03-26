package TOP_QUESTIONS.LikedQuestions;
// import java.util.*;
public class set_matrix_zeros {
    /*
    public void setZeroes(int[][] matrix) {
        
        //Approach!: Using HashSet, T.C: O(n^2), S.C: O(m+n)
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> colum = new HashSet<>();

        //add the index to set where 0 is present in the matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    colum.add(j);
                }
            }
        }
        //match with HashSet
        for(int i=0;i<matrix.length;i++){
            boolean hasRow = row.contains(i);
            for(int j=0;j<matrix[0].length;j++){
                if(hasRow || colum.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    */
    public void setZeroes(int[][] matrix) {
        //Best optimize approach
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        /* Traverse through the matrix, setting rows and cols
         to true if 0 is found*/
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        /* Traverse through the matrix again, setting elements to 0 
        if their row or col is true*/
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
