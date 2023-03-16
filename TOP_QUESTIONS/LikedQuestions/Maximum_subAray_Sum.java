package TOP_QUESTIONS.LikedQuestions;

public class Maximum_subAray_Sum {
    public int maxSubArray(int[] nums) {
        //Approach: Using Prefix Sum, T.C: O(n), S.C: O(1)
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        //iterate
        for(int i=0;i<len;i++){
            //prefix sum
            sum+=nums[i];

            max = Math.max(sum, max);

            //if sum becomes lessthan 0, than consider it 0
            if(sum<0) sum = 0;
        }
        return max;
    }
}
