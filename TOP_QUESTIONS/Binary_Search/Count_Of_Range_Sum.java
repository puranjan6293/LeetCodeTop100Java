package TOP_QUESTIONS.Binary_Search;
import java.util.*;
public class Count_Of_Range_Sum {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int len = arr.length;
        int right = binarySearchRight(arr, x);
        int left = right - 1;
        while (k-- > 0) {
            if (left < 0) {
                right++;
            } else if (right >= len) {
                left--;
            } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                left--;
            } else {
                right++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = left + 1; i < right; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }

    private static int binarySearchRight(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return right;
    }
}
