// Last updated: 7/28/2025, 12:32:28 PM
class Solution {
    public int minDistance(String str1, String str2) {
         int n = str1.length();
        int m = str2.length();
        int [][] dp = new int[n+1][m+1];
        int [] prev = new int[m+1];
        int [] curr = new int[m+1];
        // for(int[]row: dp) {
        //     Arrays.fill(row,-1);
        // }
        // for(int i=0;i<n+1;i++) dp[i][0]=i;
        for(int j=0;j<m+1;j++) prev[j]=j;

        for(int  i =1;i<n+1;i++){
              curr[0]=i;
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                   curr[j]=prev[j-1];
                }
                else curr[j]=1+Math.min(prev[j],Math.min(prev[j-1],curr[j-1]));
            }
            prev= curr.clone();
        }
        return prev[m];

    }
}