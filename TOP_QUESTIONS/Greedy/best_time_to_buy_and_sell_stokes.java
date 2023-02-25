package TOP_QUESTIONS.Greedy;

public class best_time_to_buy_and_sell_stokes {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int firstMin = prices[0]; //taking 0th index as first buy day
        
        for(int i=0;i<prices.length;i++){
            firstMin = Math.min(firstMin, prices[i]);
            int profit = prices[i]-firstMin;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
