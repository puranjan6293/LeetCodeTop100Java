package TOP_QUESTIONS.LikedQuestions;

import java.util.Arrays;

public class Median_of_two_sorted_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        int i=0;
        for(int e:nums1){
            nums[i++] = e;
        }
        int j = i;
        for(int a:nums2){
            nums[j++] = a;
        }

        Arrays.sort(nums);
        int len = nums.length;
        int mid = len/2;
        if(len%2 == 0){
            int x = nums[mid];
            int y = nums[mid-1];

            return (double)(x+y)/2;
        }
        return nums[mid];
    }
}
