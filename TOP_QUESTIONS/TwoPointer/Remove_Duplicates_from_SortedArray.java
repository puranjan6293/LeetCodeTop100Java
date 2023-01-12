package TOP_QUESTIONS.TwoPointer;

public class Remove_Duplicates_from_SortedArray {
    public int removeDuplicates(int[] nums) {
        //Approach: using TwoPointers, T.C: O(n)
        //Edge case: 
        if(nums.length==0) return 0;
        // i is the pointer to the last unique element
        int i = 0;
        for(int j=0;j<nums.length;j++){
            //if the curr element is different than the last unique element
            if(nums[j]!=nums[i]){
                //increment the pointer to the last unique element
                i++;
                //copy current element to the position of last unique element
                nums[i] = nums[j];
            }
        }
        //return number of unique element
        return i+1;
    }
}
