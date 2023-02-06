package TOP_QUESTIONS.HashTable;

import java.util.HashSet;

public class Set_matrix_Zeros {
    public void setZeroes(int[][] matrix) {
        //Approach, Using hashset, T.C: O(mxn), S.C: O(m+n)
        //initialize two hashset named row and colum
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> colum = new HashSet<>();

        /*In the first loop, the program iterates through the matrix
         and adds the row and column indexes of cells with value 0 to
          the two HashSets.*/
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //if the matrix[i][j]==0, then add them to set
                if(matrix[i][j]==0){
                    row.add(i);
                    colum.add(j);
                }
            }
        }

        /*n the second loop, the program checks if the current cell's
         row and column index are in the two HashSets,
         and sets the value of the cell to 0 if either the row or
          column is found in the HashSets.*/
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
