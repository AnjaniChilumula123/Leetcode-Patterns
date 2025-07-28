// Last updated: 7/28/2025, 12:29:40 PM
class Solution {
    // public int fib(int n) {
    //     int [] dp = new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return f(n,dp);
    // }
    // public int f(int n,int [] dp){
    //   if(n<=1) return n;
    //   if(dp[n]!=-1) return dp[n];
    //   return dp[n]=f(n-1,dp)+f(n-2,dp); 
    // }
    public int fib(int n){
        int prev2=0,prev1=1;
        int curr=0;
        if(n<=1) return n;
        for(int i=2;i<=n;i++){
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
}