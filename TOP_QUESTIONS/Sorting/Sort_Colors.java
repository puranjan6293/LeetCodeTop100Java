package TOP_QUESTIONS.Sorting;

public class Sort_Colors {
    public void sortColors(int[] nums) {
        //Approach: using merge sort, T.C: O(n)
        int low = 0; // pointer for last red element
        int mid = 0; // pointer for current element
        int high = nums.length - 1; // pointer for first blue element
        while (mid <= high) { // iterate until mid pointer reaches last blue element
            if (nums[mid] == 0) { // if current element is red
                swap(nums, low, mid); // swap with last red element
                low++; // increment low pointer
                mid++; // increment mid pointer
            } else if (nums[mid] == 1) { // if current element is white
                mid++; // increment mid pointer
            } else { // if current element is blue
                swap(nums, mid, high); // swap with first blue element
                high--; // decrement high pointer
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
