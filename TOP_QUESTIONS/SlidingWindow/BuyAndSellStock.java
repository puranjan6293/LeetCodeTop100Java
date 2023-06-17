import java.util.Scanner;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        //Approach: Using Sliding Window
        //Idea: take two index values of the initial array price
        //      update maxProfit in each iteration: right price - left price

        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                //update the max profit
                maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
                right++;
            }
            else{
                //move one window
                left = right;
                right++;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("max profit is: "+ maxProfit(arr));
    }
}
