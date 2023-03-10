package TOP_QUESTIONS.LikedQuestions;

public class Search_insert_position {
    public int searchInsert(int[] nums, int target) {
        //Approach: Using Binary Search, T.C: O(n), T.C: O(1)
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
}
