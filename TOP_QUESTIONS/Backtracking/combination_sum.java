package TOP_QUESTIONS.Backtracking;
importjava.util.*;
public class combination_sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Approach: Using Backtracking, T.C: O(2^N), S.C: O(n)
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, candidates, new ArrayList<>(), 0, target);
        return ans;
    }
    public void backtrack(
        List<List<Integer>> ans, 
        int[] candidates, 
        List<Integer> curr, 
        int index, 
        int target
        ){
            //base case
            if(target==0){
                ans.add(new ArrayList<>(curr));
            }
            else if(
                target<0 || index>=candidates.length
            ){
                return;
            }else{
                //add to current ArrayList
                curr.add(candidates[index]);

                //we chose element
                backtrack(ans, candidates, curr, index, target-candidates[index]);

                //clear the current ArrayList
                curr.remove(curr.size()-1);

                //we dont chose the element
                backtrack(ans, candidates, curr, index+1, target);
            }
    }
}
