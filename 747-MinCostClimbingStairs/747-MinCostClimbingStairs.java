// Last updated: 7/28/2025, 12:29:52 PM

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min( func(n-1,cost,dp),func(n-2,cost,dp) );
    }
    public int func(int ind,int [] cost,int[] dp){
        if(ind==0) return cost[0];
        if(ind == 1) return cost[1];
        if(dp[ind]!=-1) return dp[ind];
        int pick = cost[ind] + func(ind-1,cost,dp);
        int notpick = cost[ind] +  func(ind-2,cost,dp);
       
        return dp[ind]=Math.min(notpick,pick);
    }
}