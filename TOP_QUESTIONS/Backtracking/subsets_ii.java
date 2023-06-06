package TOP_QUESTIONS.Backtracking;
import java.util.*;
public class subsets_ii {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //Approach: Using BackTracking, T.C: O(n log n + n * 2^n), S.C: O(2^n + n)
        //Idea: Here in the Question, the instroction is given the the nums may contain duplicates
        //so we have to skip duplicates
        //for skipping the duplicates, we have to sort the nums array

        List<List<Integer>> ans = new ArrayList<>();
        //sort the num array
        Arrays.sort(nums);
        backtrack(ans, nums, new ArrayList<>(), 0);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans, int[] nums, List<Integer> temp, int idx){
        //don't need any base case
        ans.add(new ArrayList<>(temp));
        //we have to skip duplicates
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }

            //add to temp arrayList
            temp.add(nums[i]);
            //call recursion
            backtrack(ans, nums, temp, i+1);
            //do empty temp list
            temp.remove(temp.size()-1);
        }
    }
}
