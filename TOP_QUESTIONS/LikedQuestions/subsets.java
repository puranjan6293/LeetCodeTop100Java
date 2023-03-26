package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        //Approach: Using Backtracking , T.C:
        List<List<Integer>> ans = new ArrayList<>();
        //base case 
        if(nums==null || nums.length==0) return ans;

        //call our backtrack method
        backtrack(nums, ans, new ArrayList<>(), 0);
        return ans;

    }
    public void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> temp, int idx){
        //base case
        if(idx>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        //case 1: we pic the element
        //add to temp
        temp.add(nums[idx]);
        //call recursion
        backtrack(nums, ans, temp, idx+1);
        //remove element from temp
        temp.remove(temp.size()-1);

        //case 2: we dont pic the element 
        backtrack(nums, ans, temp, idx+1);

    }
}
