package TOP_QUESTIONS.PrefixSum;

import java.util.HashMap;

public class ContinuesSubarray {
    public int findMaxLength(int[] nums) {
        //Approach: using HashMap and PrefixSum, T.C: O(n)
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        //Iterate through the array
        for(int i=0;i<nums.length;i++){
            //if nums[i]=0, then do -1 from the sum, else add nums[i]
            sum+=nums[i]==0?-1:nums[i];

            if(sum==0){
                maxLength = i+1;
            }
            else if(map.containsKey(sum)){
                maxLength = Math.max(maxLength, i-map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
