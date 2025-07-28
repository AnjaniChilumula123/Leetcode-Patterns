// Last updated: 7/28/2025, 12:29:19 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][] dp = new int[n+1][m+1];
        // for(int [] row : dp){
        //     Arrays.fill(row,-1);
        // }
    
        // return f(n-1,m-1,text1,text2,dp);

        for(int i=0;i<=n;i++){
           dp[i][0] = 0;
        }
        for(int j=0;j<=m;j++){
            dp[0][j] = 0;
        }
        for(int i = 1 ;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                 if(text1.charAt(i-1) == text2.charAt(j-1))  dp[i][j]= 1+dp[i-1][j-1];
                 else dp[i][j]=0+Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public int f(int ind1 ,int ind2 , String s , String t,int[][] dp){
        if(ind1<0 || ind2 <0) return 0;
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        if(s.charAt(ind1)==t.charAt(ind2)) return 1+f(ind1-1,ind2-1,s,t,dp);
        return dp[ind1][ind2]=0+Math.max(f(ind1-1,ind2,s,t,dp),f(ind1,ind2-1,s,t,dp));
    }
}