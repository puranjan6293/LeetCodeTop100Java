package TOP_QUESTIONS.LikedQuestions;

import java.util.Stack;

public class Longest_Reactangle_in_histogram {
    public int largestRectangleArea(int[] height) {
        /*
        //Brute force approach, TLE
        int n = height.length;
        //base case 
        if(n==0) return 0;
        int maxArea = 0;

        //initialize left and right array,
         //Main aim is to find the nearest smallest element to the left and the right

         int[] left = new int[n];
         int[] right = new int[n];

         //add -1 in 0th index of left & n in n-1th index of right
         left[0] = -1;
         right[n-1] = n;

         //find and add the less height from the left
         for(int i=1;i<n;i++){
             int prev = i-1;
             while(prev>=0 && height[prev]>=height[i]){
                 prev = left[prev];
             }
             left[i] = prev;
         }

         //find and add the less height from the right
         for(int i=1;i<n;i++){
             int prev = i+1;
             while(prev<n && height[prev]>=height[i]){
                 prev = right[prev];
             }
             right[i] = prev;
         }
         // once we have these two arrays fill we need width & area
         for(int i=0;i<n;i++){
             int width = right[i]-left[i]-1;
             maxArea = Math.max(maxArea, height[i]*width);
         }
         return maxArea;
         */

         //Optimize pproach using stack, T.C: O(n), S.C: O(n)
         int n = height.length;
         int maxArea = 0;
         Stack<Integer> st = new Stack<>();

         for(int i=0;i<=n;i++){
             //if our array is empty then take 0 as curr height else currHeight will be the height[i]
             int currHeight = i==n ? 0 : height[i];

             while(!st.isEmpty() && currHeight<height[st.peek()]){
                 int top = st.pop();
                 //finding the width
                 // width differ, if stack is empty or not empty after we pop the element
                 int width = st.isEmpty() ? i : i-st.peek()-1;

                 //now update the max area
                 maxArea = Math.max(maxArea, height[top]*width);
             }
             st.push(i);
         }
         return maxArea;
    }
}
