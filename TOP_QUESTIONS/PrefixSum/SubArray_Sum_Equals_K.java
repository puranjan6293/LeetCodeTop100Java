package TOP_QUESTIONS.PrefixSum;

import java.util.HashMap;

public class SubArray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        /*
        //Approach1: Using PrefixSum, T.C: O(n^2)
        int sum = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    ans++;
                }
            }
            sum = 0;
        }
        return ans;
        */

        //Approach2; Using HashMap and prefix Sum, T.C: O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int sum = 0;
        int ans = 0;
        map.put(0, 1);
        for(int i=0;i<len;i++){
            //prefixSum
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
