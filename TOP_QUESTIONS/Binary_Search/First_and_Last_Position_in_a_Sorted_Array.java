package TOP_QUESTIONS.Binary_Search;

public class First_and_Last_Position_in_a_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        int x = -1;
        int y = -1;

        //step1: for x
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //case1
            if(nums[mid]==target){
                //if our target element is in the mid than for the sorted array
                //obeously the the second element will be at mid-1 or mid+1
                //this if for mid-1
                x = mid;
                end = mid-1;
            }

            //condition for binary search
            else if(nums[mid]<target){
                start = mid+1;
            }
            else end = mid-1;
        }
        //step2: for y
        start = 0;
        end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            //if our target element is in the mid than for the sorted array
            //obeously the the second element will be at mid-1 or mid+1
            //this if for mid-1
            if(nums[mid]==target){
                y = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else end = mid-1;
        }

        //add elements to ans array
        ans[0] = x;
        ans[1] = y;

        return ans;
    }
}
