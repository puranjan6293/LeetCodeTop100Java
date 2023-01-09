package TOP_QUESTIONS.SlidingWindow;

import java.util.HashMap;

public class Contains_Duplicates_II {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            // Function to check if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k
            //Solution: T.C : O(n)
            // Create a map to store the indices of each element in the array
            HashMap<Integer, Integer> map = new HashMap<>();
            //Iterate through the array
            for(int i=0;i<nums.length;i++){
                //if the current element nums[i] is already exist in the map
                if(map.containsKey(nums[i])){
                    // Check if the absolute difference between the current index and the stored index is less than or equal to k
                    if(i-map.get(nums[i]) <= k){
                        //return true if the condition is satisfied
                        return true;
                    }
                }
                // Store the current index in the map for the current element
                map.put(nums[i], i);
            }
            return false;
        }
    }
}
