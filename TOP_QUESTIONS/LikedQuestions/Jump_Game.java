package TOP_QUESTIONS.LikedQuestions;

public class Jump_Game {
    public boolean canJump(int[] nums) {
        //Approach: Using Greedy Algorithm, T.C: O(n)
        int maxReach = 0;
        int lastIdx = nums.length-1;

        //traverse
        for(int i=0;i<nums.length;i++){

            //base case, if the curr index can be reached
            if(i>maxReach) return false;

            //update the maximum reachable idx
            maxReach = Math.max(maxReach, i+nums[i]);

            /* if the maximum reachable index is greater than or 
            equal to the last index, we can reach the last index*/
            if(maxReach>=lastIdx) return true;
        }
        //if loop complete and we cannot reach the end then just return false
        return false;
    }
}
