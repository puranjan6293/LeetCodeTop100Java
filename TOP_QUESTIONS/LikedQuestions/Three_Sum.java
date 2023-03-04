package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class Three_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        //Approach: Using Three pointers & sorting
        List<List<Integer>> ans = new ArrayList<>();
        //step-1: sort the array
        Arrays.sort(nums);

        //step-2: Iterate
        for(int i=0;i<nums.length-2;i++){
            //skip the duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;

            //initialize the twopointers
            int left = i+1; //pointing two the second pointer, which is after the current
            int right = nums.length-1; //third pointer

            //while loop
            while(left<right){
                //find the sum
                int sum = nums[i]+nums[left]+nums[right];

                //check the condition, if the sum is 0
                if(sum==0){
                    //add the triplet values to the ans
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //skip the duplicates triplets
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;

                    //move both the pointers
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
}
