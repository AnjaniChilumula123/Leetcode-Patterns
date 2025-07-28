// Last updated: 7/28/2025, 12:31:47 PM
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy = prices[0] , profit = INT_MIN ;
        for(int i=0 ; i<prices.size(); i++){
            buy = min(prices[i] , buy);
            profit = max(profit ,prices[i]-buy);
        }
        return profit ;
    }
};