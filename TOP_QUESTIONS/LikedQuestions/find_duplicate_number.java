package TOP_QUESTIONS.LikedQuestions;

public class find_duplicate_number {
    public int findDuplicate(int[] nums) {
        //T.C: O(n), S.C:O(1)
        int slow = 0;
        int fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow!=fast);

        int slow2 = 0;
        do{
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        while(slow!=slow2);

        return slow2;
    }
}
