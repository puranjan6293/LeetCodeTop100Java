package TOP_QUESTIONS.Greedy;

public class Jump_Game_II {
    public int jump(int[] nums) {
        //Using Greedy Algo, T.C: O9n
        int n = nums.length;
        //Edge case: if the length of array is 1, return 0 as no jump is needed
        if(n==1) return 0;
        // maximum index that can be reached by current jump
        int maxReach = nums[0];
        // number of steps taken to reach the current jump
        int steps = nums[0];
        // number of jumps needed to reach the end
        int jumps = 1;

        //iterate through the array
        for(int i=1;i<n;i++){
            // reached the end, return the number of jumps
            if(i==n-1) return jumps;
            //update maxReach with the farthest possible index that can be reached
            maxReach = Math.max(maxReach, i+nums[i]);
            steps--;
            if(steps==0){
                jumps++;
                // cannot reach the end, return -1
                if(i>=maxReach) return -1;
                steps = maxReach-i;
            }
        }
        return -1;
    }
}
