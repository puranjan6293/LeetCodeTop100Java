package TOP_QUESTIONS.TwoPointer;

public class Container_With_Most_Water {
    /*The idea behind the two-pointer approach is to start with the widest container possible
    and then move the pointers inwards in search of a taller container that can hold more water.
    In the above implementation, we start with the left pointer at the first element and
    the right pointer at the last element of the array.
    In each iteration of the while loop, we calculate the width of the container by subtracting the
    right pointer from the left pointer. We then calculate the height of the container as the
    minimum of the height of the left pointer and the height of the right pointer.
    Finally, we calculate the area of the container by multiplying the width and the height,
    and update the maximum area if the current area is greater than the current maximum area.
    As the area of the container is determined by the smaller of the two sides and not the bigger side, 
    we move the pointer pointing to the shorter line and discard the other pointer.
    We continue moving the pointers until they meet, as at that point, 
    we have checked all possible containers.
    We return the maximum area as the final result. */
    //T.C: O(n)
    public int maxArea(int[] height) {
        int n = height.length;
        //initialze the left and right pointer to be the first and last elements of the array respectvely
        int left = 0;
        int right = n-1;
        //initialize the maxArea that stores the maximum area
        int maxArea = 0;
        // loop through the array until left pointer is less than right pointer
        while(left<right){
            //width is the distance between the two pointers
            int width = right-left;
            // height of the container is the minimum of the heights of the two pointers
            int h = Math.min(height[left], height[right]);
            // calculate the area of the container and update the max area if it's greater than the current max area
            maxArea = Math.max(maxArea, width*h);
            // if the height at left pointer is less than the height at right pointer, move the left pointer towards right
            if(height[left]<height[right]){
                left++;
            }
            //if the height at right pointer is less than the height at left pointer, move the right pointer towards left
            else{
                right--;
            }
        }
        //return the max area found
        return maxArea;
    }
}
