package TOP_QUESTIONS.Greedy;

public class Jump_Game {
    public boolean canJump(int[] nums) {
        //Approach: Using Greedy Algorithm, T.C: O(n)
        //Initialize the variables
        int lastIndex = nums.length-1;
        int maxReach = 0;

        //Iterate through the array
        for(int i=0;i<nums.length;i++){
            //check if the curr index can be reached
            if(i>maxReach){
                return false;
            }
            //update the maximum reachable index
            maxReach = Math.max(maxReach, i+nums[i]);
            // if the maximum reachable index is greater than or equal to the last index, we can reach the last index
            if(maxReach>=lastIndex){
                return true;
            }
        }
        //if loop complete, we can't reach the last index
        return false;
    }
}
/*
 For example, if we're at position i = 2 and nums[i] = 3,
  we can jump to position i + nums[i] = 2 + 3 = 5. 
  So the maximum reachable index from position i = 2 is 5.
 */
