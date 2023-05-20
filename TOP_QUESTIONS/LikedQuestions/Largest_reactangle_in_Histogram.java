package TOP_QUESTIONS.LikedQuestions;

public class Largest_reactangle_in_Histogram {
    public int largestRectangleArea(int[] histo) {
        //Approach: Using Stack
        Stack<Integer> stack = new Stack<>();
        int n = histo.length;
        int maxArea = 0;
        
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || histo[i] <= histo[stack.peek()])) {
                int height = histo[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        
        return maxArea;
    }
}
