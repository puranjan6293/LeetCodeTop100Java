package TOP_QUESTIONS.LikedQuestions;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        
        //! Approach1
        int first = nums[0];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                first = nums[i];
                count++;
            }
            else if(first==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return first;
        
        /*
        //!Approach2
        Arrays.sort(nums);
        return nums[nums.length/2];
         */
        
    }
}
