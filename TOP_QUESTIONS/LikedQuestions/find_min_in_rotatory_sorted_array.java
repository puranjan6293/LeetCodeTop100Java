package TOP_QUESTIONS.LikedQuestions;

public class find_min_in_rotatory_sorted_array {
    public int findMin(int[] nums) {
        /*
        //! :Approach1: Using sorting
        Arrays.sort(nums);
        return nums[0];
        */
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}
