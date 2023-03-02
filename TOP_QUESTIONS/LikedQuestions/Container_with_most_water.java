package TOP_QUESTIONS.LikedQuestions;

public class Container_with_most_water {
    public int maxArea(int[] height) {
        //Approach: Using Two Pointers Algorithms
        //T.C: O(n)
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left<right){
            //find thi width
            int width = right-left;

            //find min height
            int minHeight = Math.min(height[left], height[right]);

            //calculate the max Area
            maxArea = Math.max(maxArea, minHeight*width);

            //when left idx val is less than right idx value, increment left
            if(height[left]<height[right]){
                left++;
            }
            else right--;
        }
        return maxArea;
    }
}
