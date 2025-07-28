// Last updated: 7/28/2025, 12:32:34 PM
class Solution {
    public int uniquePaths(int m, int n) {
        // int [][] dp = new int [m][n]; 
        // for(int [] row :dp){
        //     Arrays.fill(row,-1);
        // }
        // return tabulation(m,n,dp);
        
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //          if(m==0 && n==0) {
        //            dp[0][0] = 1 ;
        //            continue;
        //          }
        //          else{
        //          int up = 0 , left = 0;
        //          if(i>0) up = dp[i-1][j];
        //          if(j>0) left = dp[i][j-1];
        //          dp[i][j] = up+left;
        //          }
        //     }
        // }
        // return dp[m-1][n-1];

        int  [] prev = new int [n];
        for(int i =0 ;i<m;i++){
            int [] curr = new int [n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0) {
                     curr[j]=1;
                     continue;
                }
                int up = 0 , left = 0;
                 if(i>0) up = prev[j];
                 if(j>0) left = curr[j-1];
                 curr[j] = up+left;
            }
            prev = curr;
        }
        return prev[n-1];


    }
    public int tabulation(int m , int n , int [][] dp){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 if(j==0 && i==0) {
                   dp[0][0] = 1 ;
                   continue;
                 }
                 int up = 0 , left = 0;
                 if(i>0) up = dp[i-1][j];
                 if(j>0) left = dp[i][j-1];
                 dp[i][j] = up+left;
            }
        }
        return dp[m-1][n-1];
    }
    public int func(int m , int n,int [][] dp){
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int up = func(m-1,n,dp);
        int left = func(m,n-1,dp);
        return dp[m][n]=up+left;
    }
}