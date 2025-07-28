// Last updated: 7/28/2025, 12:29:21 PM
class Solution {
    public String shortestCommonSupersequence(String a, String b) {
         int n = a.length();
        int m = b.length();

        int [][] dp = new int[n+1][m+1];

        for(int i =0 ;i<=n;i++){
            dp[i][0] = 0;
        }
         for(int i =0 ;i<=m;i++){
            dp[0][i] = 0;
        }
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        int len = dp[n][m];
        String ans ="";
        int i=n,j=m;
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                ans = a.charAt(i-1)+ans;
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                ans = a.charAt(i-1)+ans;
                i--;
            }
            else{
                ans = b.charAt(j-1)+ans;
                j--;
            }
        }
        while(i>0) {
            ans = a.charAt(i-1)+ans;
            i--;
        }
         while(j>0) {
            ans = b.charAt(j-1)+ans;
            j--;
        }
        return ans;

    }
}