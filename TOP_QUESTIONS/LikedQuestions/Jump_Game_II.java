package TOP_QUESTIONS.LikedQuestions;

public class Jump_Game_II {
    public int jump(int[] nums) {
        //Approach: using Gready Algorithm, T.C: O(n), S.C: O(1)
        int n = nums.length;
        int ans = 0;
        int curr = 0;
        int maxSteps = 0;

        //Iterate
        for(int i=0;i<n-1;i++){
            /* calculate the maximum number of steps that can be
             taken from the current position*/
            maxSteps = Math.max(maxSteps, i+nums[i]);

            /* if the current position is equal to i, this means we have reached
             the end of the current jump and need to jump again*/
             if(curr == i){
                 // update current position to the new maximum number of steps
                 curr = maxSteps;
                 //increment the ans
                 ans++; 
             }
        }
        return ans;
    }
}
