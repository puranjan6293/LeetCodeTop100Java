package TOP_QUESTIONS.LikedQuestions;

import java.util.Arrays;

public class longest_consecutive_subsequence {
    public int longestConsecutive(int[] nums) {
        //Approach: Using Sorting, T.C: O(nlogn), S.C: O(1)
        //base case 
        if(nums==null || nums.length==0) return 0;

        //sort the array
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        //Traverse through the array
        for(int i=0;i<nums.length;i++){
            //the condition
            if(i>0 && nums[i]-nums[i-1]==1){
                count = count+1;
                max = Math.max(max, count);
            }
            //don't consider the duplicates
            else if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            else{
                count = 1;
            }
        }
        return max;
    }
}
