import java.util.Scanner;

public class TrappingRainWater_fc {
    public static int trap(int[] height) {
        //Idea: Using twopointers
        //calculate ans from left and right side
        //remember the formula: 
        //        ans+=lmax-height[left]
        //        ans+=rmax-height[right]

        //initialize our required variables
        int left = 0;
        int right = height.length-1;
        int lmax = height[left];
        int rmax = height[right];
        int ans = 0;

        //traverse
        while(left<right){
            if(lmax<rmax){
                left++;
                //update the lmax
                lmax = Math.max(lmax, height[left]);
                ans+=lmax-height[left];
            }
            else{
                right--;
                //update the rmax
                rmax = Math.max(rmax, height[right]);
                ans+=rmax-height[right];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sln = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = trap(arr);
        System.out.println("the answer is:"+ ans);
    }
}
//[0,1,0,2,1,0,1,3,2,1,2,1]