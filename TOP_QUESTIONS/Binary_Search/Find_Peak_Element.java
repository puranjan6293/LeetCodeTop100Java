package TOP_QUESTIONS.Binary_Search;

public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        //Approach: Using Binary Search, T.C: O(n)
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;

        while(left<right){
            mid = left+(right-left)/2;

            //if(nums[left-1]>nums[left] && nums[right]>nums[right+1])
            if(nums[mid]<nums[mid+1]){
                left = mid+1;
            }
            else right = mid;
        }
        return left;
    }
}
