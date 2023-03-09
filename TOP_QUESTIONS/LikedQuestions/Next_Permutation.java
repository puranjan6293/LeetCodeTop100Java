package TOP_QUESTIONS.LikedQuestions;

public class Next_Permutation {
    public void nextPermutation(int[] nums) {
        //Using TwoPointer

        //base case
        if(nums==null || nums.length<=1) return;
        
        int i = nums.length-2;

        //traverse and find the breakpoint
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }
    //method for swap
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    //method for reverse
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i++, j--);
        }
    }
}
