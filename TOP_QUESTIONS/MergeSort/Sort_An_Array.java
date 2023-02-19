package TOP_QUESTIONS.MergeSort;

public class Sort_An_Array {
    public int[] sortArray(int[] nums) {
        /*
        //Approach1: Using default sort, T.C: O(nlogn)+n
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        int idx = 0;
        for(int e:nums){
            ans[idx++] = e;
        }
        return ans;
        */

        //Approach2: using MergeSort
		mergeSort(nums, 0, nums.length - 1);
		return nums;
        
	}

    //method for mergeSort
	public void mergeSort(int[] nums, int start, int end) {
		// if the start index is larger or equal to the end index, the sort of the subarray is finished
		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;
		mergeSort(nums, start, mid);
		mergeSort(nums, mid + 1, end);
		merge(nums, start, end);
	}

    //method for merge
	public void merge(int[] nums, int start, int end) {
		int mid = start + (end - start) / 2;
		int[] temp = new int[end - start + 1];
		int leftStart = start;
		int leftEnd = mid;
		int rightStart = mid + 1;
		int rightEnd = end;
		int i = 0;
		while (leftStart <= leftEnd && rightStart <= rightEnd) {
			if (nums[leftStart] <= nums[rightStart]) {
				temp[i] = nums[leftStart];
				leftStart++;
			} else {
				temp[i] = nums[rightStart];
				rightStart++;
			}
			i++;
		}
		while (leftStart <= leftEnd) {
			temp[i] = nums[leftStart];
			leftStart++;
			i++;
		}
		while (rightStart <= rightEnd) {
			temp[i] = nums[rightStart];
			rightStart++;
			i++;
		}
		for (int j = 0; j < i; j++) {
			nums[start + j] = temp[j];
		}
	}
}
