// Last updated: 7/28/2025, 12:30:11 PM
import java.util.*;
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String t = "";
        for(int i=0;i<n;i++){
            t += s.charAt(n-1-i);
        }
        int [][] dp = new int[n+1][n+1];
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
        return lcs(n-1,n-1,s,t,dp);
    }
    public int lcs (int ind1, int ind2, String s , String t,int[][] dp){
        if(ind1<0||ind2<0) return 0 ;
        if(dp[ind1][ind2]!=-1)  return dp[ind1][ind2];
        if(s.charAt(ind1)==t.charAt(ind2)) return dp[ind1][ind2]=1+lcs(ind1-1,ind2-1,s,t,dp);
        return dp[ind1][ind2]= Math.max(lcs(ind1-1,ind2,s,t,dp),lcs(ind1,ind2-1,s,t,dp));
    }
}