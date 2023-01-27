package TOP_QUESTIONS.PrefixSum;

public class Minimun_size_subarray_sum {
    public int minSubArrayLen(int target, int[] nums) {
        /*
        //Approach: Using PrefixSum, T.C: O(n^2)
        //initialize the variables
        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        //iterate the array
        for(int i=0;i<nums.length;i++){
            //prefix sum
            sum+=nums[i];

            //condition for whose sum is greater than or equal to target
            while(sum>=target){
                //update the min value
                min = Math.min(min, i-l+1);
                
                //update the sum
                sum = sum-nums[l];
                l++;
            }
        }
        //if min is equal to Integer.MAX_VALUE than return 0, otherwise return min
        return min==Integer.MAX_VALUE?0 : min;
        */

        //Approach2: Using twopointers and prefix sum
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        //Situation 1
        while(left<=right && right<nums.length){
            if(sum<target){
                sum+=nums[right];
                right++;
            }
            else{
                min = Math.min(min, right-left);
                sum-=nums[left];
                left++;
            }
        }

        //situation 2
        while(left<right){
            if(sum>=target){
                min = Math.min(min, right-left);
            }
            sum-=nums[left];
            left++;
        }

        //if min is equal to Integer.MAX_VALUE than return 0, otherwise return min
        return min==Integer.MAX_VALUE?0 : min;
    }
}
