package TOP_QUESTIONS.HashTable;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        //Approach, using HashMap, T.C: O(n)
        /*The Idea is to find the target-nums[i] */
        //initialize the array
        int[] ans = new int[2];

        //initialize a Map
        HashMap<Integer, Integer> map = new HashMap<>();
        //Traverse through the array
        for(int i=0;i<nums.length;i++){
            //condition if target-nums[i] is present in map
            if(map.containsKey(target-nums[i])){
                //if present add the indexes
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            //else put the values in to the map
            map.put(nums[i], i);
        }
        return ans;
    }
}
