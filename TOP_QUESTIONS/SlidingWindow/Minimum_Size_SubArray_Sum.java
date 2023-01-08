package TOP_QUESTIONS.SlidingWindow;
/*The idea is to use a sliding window approach, 
where we keep a window of contiguous elements and move it from left to right through the array. 
At each step, we update the sum of the elements in the window and check if it is greater than or equal to the target.
If it is, we update the minimum length of a subarray that satisfies the condition and ,
then move the left pointer of the window to the right by one. 
We keep doing this until the sum is less than the target, 
at which point we move the right pointer of the window to the right by one and repeat the process.

In each iteration, the left pointer moves to the right at most once, 
and the right pointer moves to the right at most once, 
so the overall time complexity of the algorithm is O(n). 
The space complexity is O(1), since we only use a few variables that do not depend on the size of the input. */
public class Minimum_Size_SubArray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        //Approach: Using Sliding Window Algorithm, T.C: O(n)
        //return 0 if the Array is null or empty
        if(nums==null || nums.length==0) return 0;

        //initialize the variables
        int n = nums.length;
        int left = 0;
        int currSum = 0;
        //initialize the minLength to maximum possible value
        int minLength = Integer.MAX_VALUE;

        //Iterate through the array with sliding window
        for(int right = 0;right<n;right++){
            //add the current element to the Sum
            currSum+=nums[right];

            // Shrink the window from the left as long as the sum is greater than or equal to the target
            while(currSum>=target){
                //update the minLength if needed
                minLength = Math.min(minLength, right-left+1);
                // Subtract the element at the left pointer from the sum and move the left pointer to the right
                currSum-=nums[left];
                left++;
            }
        }
        // Return 0 if no subarray was found, otherwise return the minimum length
        return minLength==Integer.MAX_VALUE ? 0 : minLength;
    }
}
