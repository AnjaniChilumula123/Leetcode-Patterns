// Last updated: 7/28/2025, 12:31:52 PM
class Solution {
    public int maxProfit(int[] prices) {
        
        int profit =0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<min) min=prices[i];
            profit = Math.max(prices[i]-min,profit);
        }
        return profit;
        
    }
}