class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0; 
        int sell = prices.length - (prices.length - 1); 
        int max_Profit = 0;
        

        while (sell < prices.length) {
            if (prices[sell] - prices[buy] < 0) {
                buy = sell;
            } else {

            int profit = prices[sell] - prices[buy];
                if (max_Profit < profit) {
                    max_Profit = profit;
                }
            }
            sell++;

        }
        return max_Profit;
    }
}
