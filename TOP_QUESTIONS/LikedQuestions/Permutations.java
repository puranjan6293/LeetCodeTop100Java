package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        //Approach 1: Using Backtracking, T.C: O(n!)
        List<List<Integer>> ans = new ArrayList<>();

        //call the backtrack function
        backtrack(ans, new ArrayList<>(), nums);
        return ans;

    }
    private void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] nums){
        //base case
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            //if element is already exist than skip that
            if(temp.contains(nums[i])){
                continue;
            }

            //add element to temp array
            temp.add(nums[i]);
            //call recursion
            backtrack(ans, temp, nums);
            //remove element from temp array
            temp.remove(temp.size()-1);
        }
    }
}
