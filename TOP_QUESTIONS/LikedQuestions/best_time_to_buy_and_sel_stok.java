package TOP_QUESTIONS.LikedQuestions;

public class best_time_to_buy_and_sel_stok {
    public int maxProfit(int[] prices) {
        //Approach using general thinking, T.C: O(n), S.C: O(1)
        //find the first minimum
        //find the profit
        //update the profit

        int maxProfit = 0;
        int firMin = prices[0];

        for(int i=0;i<prices.length;i++){
            firMin = Math.min(firMin, prices[i]);
            int profit = prices[i]-firMin;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
