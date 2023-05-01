package TOP_QUESTIONS.LikedQuestions;

public class House_Rober {
    public int rob(int[] nums) {
        //! Initialize variables to keep track of the maximum amount robbed at the current and previous houses.
        int curMax = 0; //! Current maximum amount robbed
        int preMax = 0; //! Maximum amount robbed at the previous house

        //! Iterate over each house in the array
        for(int num: nums) {
            //! Store the current value of curMax in a temporary variable
            int temp = curMax;
            //! Calculate the maximum amount that can be robbed at the current house, either by skipping the current house and taking the maximum amount robbed at the previous house, or by robbing the current house and adding it to the maximum amount robbed at the house before the previous house
            curMax = Math.max(num + preMax, curMax);
            //! Update the previous maximum amount robbed to the value of the previous current maximum amount robbed
            preMax = temp;
        }

        //! Return the final maximum amount robbed
        return curMax;
    }
}
