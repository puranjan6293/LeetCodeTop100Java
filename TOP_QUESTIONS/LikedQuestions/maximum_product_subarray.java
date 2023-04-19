package TOP_QUESTIONS.LikedQuestions;

public class maximum_product_subarray {
 
    public int maxProduct(int[] nums) {
        //Approach: Using Prefix and suffix product
        //T.C: O(n)

        //take 1st index value as max
        int max = nums[0];
        int left = 1;
        int right = 1;
        int n = nums.length;

        //traverse
        for(int i=0;i<n;i++){
            //condition for avoiding zeros
            if(left==0) left = 1;
            if(right==0) right = 1;

            //prefix product
            left*=nums[i];

            //suffix product
            right*=nums[n-1-i];

            //find the max
            max = Math.max(max, Math.max(left, right));
        }
        return max;
    }
}
