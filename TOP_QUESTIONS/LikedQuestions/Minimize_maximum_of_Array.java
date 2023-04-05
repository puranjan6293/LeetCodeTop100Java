package TOP_QUESTIONS.LikedQuestions;

public class Minimize_maximum_of_Array {
    public int minimizeArrayValue(int[] nums) {
        //Approach: Using PrefixSum
        long sum = 0;
        long ans = 0;

        //traverse and find the prefixSum
        for(int i=0;i<nums.length;++i){
            sum+=nums[i];

            //now update the ans
            ans = Math.max(ans, (sum+i)/(i+1));
        }
        return (int)ans;
    }
}
