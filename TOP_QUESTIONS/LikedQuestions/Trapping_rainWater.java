package TOP_QUESTIONS.LikedQuestions;

public class Trapping_rainWater {
    public int trap(int[] height) {
        //General Approach, T.C:O(n), S.C: O(n)
        int n = height.length;
        //make tro arrays to store the left and right traverse values
        int[] left = new int[n];
        int[] right = new int[n];

        //add max from left side in left array
        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        //add max from right side in right array
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        //find the minimum between left and right and substract the val with height
        int ans = 0;
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i], right[i])-height[i];
        }
        return ans;
    }
}
