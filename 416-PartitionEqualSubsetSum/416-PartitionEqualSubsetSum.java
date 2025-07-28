// Last updated: 7/28/2025, 12:30:21 PM
class Solution {
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++) s+=nums[i];
        if(s%2!=0) return false;
        int n  =  nums.length;
        int k = s/2;
        int [][] dp = new int[n][k+1];
        for(int[] row : dp){
            Arrays.fill(row , -1);
        }

        return func(nums.length-1,k,nums,dp);
    }
    boolean func(int ind , int k , int [] nums,int[][] dp){
        if(ind==0) return nums[0]==k;
        if(dp[ind][k]!=-1) return dp[ind][k]==0?false:true;
        boolean notpick = func(ind-1,k,nums,dp);
        boolean pick = false;
        if(k>=nums[ind]){
            pick = func(ind-1,k-nums[ind],nums,dp);
        }
        dp[ind][k] = notpick || pick ? 1 : 0;
        return  pick || notpick;
    }
}