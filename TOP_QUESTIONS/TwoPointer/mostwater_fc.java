import java.util.Scanner;

class Solution{
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int width = right-left;
            int area = width*Math.min(height[left], height[right]);
            //!update the maxArea
            maxArea = Math.max(maxArea, area);
            if(height[left]<height[right]){
                left++;
            }
            else  right--;
        }
        return maxArea;
    }
}
public class mostwater_fc {
    public static void main(String[] args) {
        Solution sn = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sn.maxArea(arr));
    }
}
