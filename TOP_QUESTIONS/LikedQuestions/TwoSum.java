package TOP_QUESTIONS.LikedQuestions;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //Approach: Using HashMap
        //Idea: x+y = z, x = z-y

        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //condition for the idea
            if(map.containsKey(target-nums[i])){
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
