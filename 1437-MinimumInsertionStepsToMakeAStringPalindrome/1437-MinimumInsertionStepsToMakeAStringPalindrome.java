// Last updated: 7/28/2025, 12:29:08 PM
class Solution {
    public int minInsertions(String str) {
      int n = str.length();
        String s2 = "";
        for(int i =0;i<n;i++){
            s2 = s2+str.charAt(n-1-i);
        }
        int [][] dp = new int[n+1][n+1];
        int [] prev = new int[n+1];
        int [] curr = new int[n+1];

              int ans = 0;
        // for(int [] row:dp){
        //     Arrays.fill(row,-1);
        // }
        // for(int i=0;i<=n;i++){
        //     dp[i][0] = 0;
        //     dp[0][i] = 0;
        // }
        for(int i=0;i<=n;i++){
            prev[i]=0;
        }
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(str.charAt(i-1) == s2.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }
                else curr[j] = Math.max(prev[j],curr[j-1]);
            }
            prev = curr.clone();
        }
         
        ans  = prev[n] ;
        return n-ans;
    }
    public int f(int ind1, int ind2, String s , String t,int[][]dp){
        if(ind1<0 || ind2<0) return 0;
        if( dp[ind1][ind2]!=-1) return  dp[ind1][ind2];
        if(s.charAt(ind1)==t.charAt(ind2)) return  dp[ind1][ind2]= 1+f(ind1-1,ind2-1,s,t,dp);
        return dp[ind1][ind2]=Math.max(f(ind1-1,ind2,s,t,dp),f(ind1,ind2-1,s,t,dp));
    }
}