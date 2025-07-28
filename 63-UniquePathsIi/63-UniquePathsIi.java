// Last updated: 7/28/2025, 12:32:32 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        // int [][] dp = new int[m][n];
        // for(int [] row : dp){
        //     Arrays.fill(row,-1);
        // }

        // return func(m,n,obstacleGrid,dp);
        int [] prev = new int[n];
        for(int i=0;i<m;i++){
             int [] curr = new int[n];
            for(int j=0;j<n;j++){
                if(i>=0 && j>=0 && obstacleGrid[i][j]==1 ){
                    curr[j]=0;
                    continue;
                }
                if(i==0 && j==0){
                    curr[j]=1;
                    continue;
                }
             int up=0,left=0;
             if(i>0) up = prev[j];
             if(j>0) left = curr[j-1];
             curr[j]=up+left;
            }
            prev=curr;
        }
        return prev[n-1];

    }

    // public int func(int m , int n , int[][] a ,int[][]dp ){
    
   
    // for(int i=0;i<m;i++ ){
    //     for(int j=0;j<n;j++)
    //     {
    //         if(i>=0 && j>=0 && a[i][j]==1){
    //             dp[i][j]=0;
    //             continue;    
    //         }
    //         if(i==0 && j==0 ) {
    //            dp[0][0]=1;
    //            continue;
    //         }
    //         int up=0,left=0;
    //         if(i>0) up = dp[i-1][j];
    //         if(j>0) left = dp[i][j-1];
    //         dp[i][j]=up+left;
    //         }
    // }
    //       return dp[m-1][n-1];
    // }
}