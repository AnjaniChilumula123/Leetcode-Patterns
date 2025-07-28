// Last updated: 7/28/2025, 12:30:07 PM
class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        // int[][] dp = new int[n][amount+1];
        // for(int [] row:dp) {
        //     Arrays.fill(row,-1);
        // }

        // return func(n-1,amount,coins,dp);
        int [] prev = new int[amount+1];
        int [] curr = new int[amount+1];

        for(int t = 0;t<=amount;t++){
            if( t%coins[0]==0)
                prev[t] = 1;
            else prev[t] = 0;
        }
        for(int ind = 1 ;ind < n ;ind++){
            for(int t=0;t<=amount;t++){
                int nottake = prev[t];
                int take = 0;
                if(t>=coins[ind]) take = curr[t-coins[ind]];
                curr[t] = nottake+take;
            }
            prev = curr;
        }
        return prev[amount];
    }
    public int func(int ind , int target , int[] a,int[][] dp ){
        if(ind==0){
            if(target%a[ind]==0) return 1;
            else return 0;
        }
        if(dp[ind][target]!=-1) return dp[ind][target];
        int nottake = func(ind-1,target,a,dp);
        int take = 0;
        if(a[ind]<=target) take = func(ind,target-a[ind],a,dp);
        return dp[ind][target]=nottake + take;
    }
}