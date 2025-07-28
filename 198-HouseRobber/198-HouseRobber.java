// Last updated: 7/28/2025, 12:31:08 PM
class Solution {
    //-----------MEMOIZATION---------------------
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     int [] dp = new int[n];
    //     Arrays.fill(dp,-1);
    //     return func(n-1,nums,dp);

    // }
    // // public int func(int ind,int [] nums,int []dp){
    // //     if(ind==0) return nums[0];
    // //     if(ind<0) return 0;
    // //     if(dp[ind]!=-1) return dp[ind];
    // //     int pick = nums[ind]+func(ind-2,nums,dp);
    // //     int notPick = 0+func(ind-1,nums,dp);
    // //     return dp[ind]=Math.max(pick,notPick);
    // // }
     //----------------TABULATION------------------
    //  public int rob(int [] nums){
    //      int n = nums.length;
    //      int [] dp = new int[n];
    //      dp[0] = nums[0];
    //      for(int i =1;i<n;i++){
    //         int pick = nums[i];
    //          if(i>1) pick += dp[i-2];
    //          int notPick = dp[i-1];
    //          dp[i]=Math.max(pick,notPick);
    //      }
    //      return dp[n-1];
    //  }
    public int rob(int [] nums){
        int n = nums.length;
        int prev2=0,prev1=nums[0];
        int curr =0;
        for(int i=1;i<n;i++){
            int pick = nums[i];
            if(i>1) pick+=prev2;
            int notPick = 0+prev1;
            curr =  Math.max(pick,notPick);
            prev2 = prev1;
            prev1 = curr ;
            
        }
        return prev1;
    }
}