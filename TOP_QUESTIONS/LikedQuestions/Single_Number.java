package TOP_QUESTIONS.LikedQuestions;

import java.util.Arrays;

public class Single_Number {
    public int singleNumber(int[] nums) {
        //Approach: Using sorting, T.C: O(nlogn), S.C: O(1)
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            //check pairwise
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        //if our ans will at in the last index
        return nums[nums.length-1];
    }
}
