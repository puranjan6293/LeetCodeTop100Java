package TOP_QUESTIONS.LikedQuestions;

public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        //Approach1: Using general HashSet, T.C: O(mxn), S.C: O(mxn)
        if (matrix.length == 1 && matrix[0].length == 1) {
            return matrix[0][0] == target;
        }
        
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> colum = new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i == 0) {
                    colum.add(matrix[i][j]);
                }
                if(j == 0) {
                    row.add(matrix[i][j]);
                }
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
        */
        //Approach2: Using Binary Search Approach, 
        int left = 0;
        int right = matrix[0].length-1;

        while(left<matrix.length && right>=0){
            if(matrix[left][right]==target){
                return true;
            }
            else if(matrix[left][right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
}
