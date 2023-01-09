package TOP_QUESTIONS.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow_Maximum {
/*Approach: To solve this problem, you can use a deque (double ended queue) to store the indices of the array. The deque should store the indices in decreasing order of the values at those indices.

For each iteration, you can do the following:

Remove the indices that are out of the current window from the deque.
Remove the indices with values smaller than the current value from the deque.
Append the current index to the deque.
Append the maximum value in the current window to the result list. */
public int[] maxSlidingWindow(int[] nums, int k) {
    //Approach: Using SlidingWindow+Deque T.C : O(n)
    // edge case: if nums is empty or k is 0, return an empty array
    if (nums == null || k == 0) {
        return new int[0];
    }

    int n = nums.length;
    int[] result = new int[n - k + 1];
    Deque<Integer> q = new LinkedList<>();

    // process first window
    for (int i = 0; i < k; i++) {
        // remove indices with values smaller than the current value
        while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
            q.removeLast();
        }
        q.addLast(i);
    }

    // process rest of the windows
    for (int i = k; i < n; i++) {
        // add the maximum value in the current window to the result array
        result[i - k] = nums[q.getFirst()];

        // remove indices that are out of the current window
        while (!q.isEmpty() && q.getFirst() <= i - k) {
            q.removeFirst();
        }

        // remove indices with values smaller than the current value
        while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
            q.removeLast();
        }

        q.addLast(i);
    }

    // add the maximum value in the last window to the result array
    result[n - k] = nums[q.getFirst()];

    return result;
}
    
}
