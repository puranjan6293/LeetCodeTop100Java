package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class set_matrix_zeros {
    public void setZeroes(int[][] matrix) {
        //Approach: Using HashSet
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
}
