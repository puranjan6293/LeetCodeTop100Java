package TOP_QUESTIONS.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*The idea behind this solution is to first sort the array so that we can use
 two pointers to efficiently find all the triplets that sum to 0.
we start with a for loop that iterates through the array, and for each element,
we use two pointers to find pairs of elements in the remaining part of the array that sum to -nums[i].
In each iteration we also check for duplicate numbers to avoid duplicate triplets.
This solution has O(n^2) time complexity and O(n) space complexity. */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //Sort the input array first 
        //so that we can use two pointers to find the triplets that sum to 0
        Arrays.sort(nums);
        // Iterate through the array, starting from the first element
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate numbers to avoid counting the same triplet multiple times
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // We will use two pointers to find pairs that sum to -nums[i]
            int left = i + 1; // pointer to iterate from the next element after the current element
            int right = nums.length - 1; // pointer to iterate from the last element of the array
            // While the left pointer is less than the right pointer
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // If the sum is equal to 0, add the current triplet to the result
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // Skip duplicate numbers to avoid counting the same triplet multiple times
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;

                    // Move both pointers towards the center
                    left++;
                    right--;
                }else if(sum < 0) {
                    // If the sum is less than 0, it means we need to increase the sum
                    // so move the left pointer towards the right
                    left++;
                }else{
                    // If the sum is greater than 0, it means we need to decrease the sum
                    // so move the right pointer towards the left
                    right--;
                }
            }
        }
        return res;
    }
}
