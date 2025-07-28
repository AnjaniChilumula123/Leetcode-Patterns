// Last updated: 7/28/2025, 12:30:33 PM
#include<bits/stdc++.h>
class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> dp(n+1,vector<int>( n+1,-1));
        return findLenLIS(0,-1,nums,n,dp);
    }
    int findLenLIS(int ind,int prev , vector<int> &a,int n,vector<vector<int>> &dp){
        if(ind == n) return 0;
        if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];

        int len = 0 + findLenLIS(ind+1,prev,a , n,dp);
        
        if(prev == -1 || a[ind]>a[prev]){
             len = max(len,1 + findLenLIS(ind+1,ind,a,n,dp));
        }
        return dp[ind][prev+1]=len;


    }

};