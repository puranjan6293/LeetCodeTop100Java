package TOP_QUESTIONS.HashTable;

import java.util.HashMap;

public class Longest_Consicutive_SubSequence {
    
    public int longestConsecutive(int[] nums) {
        /*
        //Approach 1, Using soorting, T.C: O(nlogn), S.C: O(1)
        //Base cse
        if(nums==null || nums.length==0) return 0;
        //sort the array
        Arrays.sort(nums);
        //initialize the variables
        int count = 1;
        int max = 1;
        //traverse through the array
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]-nums[i-1]==1){
                count = count+1;
                max = Math.max(max, count);
            }
            //lets avoid duplicates
            else if(i>0 && nums[i]==nums[i-1]) continue;
            //if nums is like 123489 then after 4 count will be reset to 1
            else{
                count = 1;
            }

        }
        return max;
        */
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                // sum: length of the sequence n is in
                int sum = left + right + 1;
                map.put(n, sum);
                    
                // keep track of the max length 
                res = Math.max(res, sum);
                    
                // extend the length to the boundary(s)
                // of the sequence
                // will do nothing if n has no neighbors
                map.put(n - left, sum);
                map.put(n + right, sum);
            }
            else {
                // duplicates
                continue;
            }
        }
        return res;

    }
}
