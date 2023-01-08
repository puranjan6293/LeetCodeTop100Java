package TOP_QUESTIONS.TwoPointer;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        //Approach1, using HashaMap, T.C : O(n)
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[1]=i;
                ans[0]=map.get(target-nums[i]);
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
