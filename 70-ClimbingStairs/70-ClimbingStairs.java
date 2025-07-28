// Last updated: 7/28/2025, 12:32:29 PM
import java.util.*;
class Solution {
    // public int climbStairs(int n) {
     


        // int [] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // return func(n,dp);
    
    //--------function--------
    // int  func(int n){
    //     if(n<=0) return 1;
    //      int one = func(n-1);
    //      int two = func(n-2);
    //     return one+two;
    // }



    //--------Memoization------
    // int func(int n,int[]dp){
    //     if(n<0) return 0;
    //     if(n==0) return 1;
    //     if(dp[n]!=-1) return dp[n];
    //     int one = func(n-1,dp);
    //     int two = func(n-2,dp);
    //     return dp[n]=one + two ;
    // }
     public int climbStairs(int n) {
        // int[] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // int one = 0 , two =0;
        // dp[0] = 1 ;
        // dp[1] = 1;
        // for(int i=2;i<=n;i++){
        //     if(i-2>=0)
        //          dp[i] = dp[i-1]+dp[i-2] ;
        // }
        // return dp[n];

        //--------space optimization----------

        int prev2=1,prev1=1;
        for(int i=2;i<=n;i++){
            int curr = prev1 + prev2 ;
            prev2 = prev1;
            prev1 = curr; 
        }
        return prev1;
     }

}
