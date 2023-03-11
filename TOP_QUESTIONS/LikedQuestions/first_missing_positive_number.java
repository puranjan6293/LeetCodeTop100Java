package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class first_missing_positive_number {
    public int firstMissingPositive(int[] nums) {
        //Approach: Using Sorting, T.C: (nlogn), S.C: O(n)
        Arrays.sort(nums);
        int lastSeen = 1;

        //iterate
        for(int i=0;i<nums.length;i++){
            //ignore negatives and duplicates
            if(nums[i]<=0 || (i>0 && nums[i]==nums[i-1])){
                continue;
            }
            //if nums[i] is equal to lastSeen than increment lastSeen
            if(nums[i]==lastSeen){
                lastSeen++;
            }
            else break;
        }
        return lastSeen;
    }
}
