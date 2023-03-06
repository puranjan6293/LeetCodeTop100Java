package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class Generate_paranthesis {
    public List<String> generateParenthesis(int n) {
        //Approach: Using BackTracking 
        List<String> ans = new ArrayList<>();

        //call recursion
        backtrack("", ans, n, n);
        return ans;
    }
    //method for backtracking
    void backtrack(String helper, List<String> ans, int left, int right){
        //base case
        if(left>right){
            return;
        }
        //case 1: if left>0
        if(left>0){
            backtrack(helper+'(', ans, left-1, right);
        }

        //case2: if right>0
        if(right>0){
            backtrack(helper+')', ans, left, right-1);
        }

        //case 3: if both become 0
        if(left==0 && right==0){
            ans.add(helper);
        }
    }
}
