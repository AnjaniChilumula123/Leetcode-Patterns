// Last updated: 7/28/2025, 12:31:45 PM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {  
        int m = triangle.size()+1;
        int n = triangle.size()+1;
        int[][] dp = new int[m][n];
        for(int [] row : dp ){
            Arrays.fill(row,-1);
        }  
       return Total(0,0,triangle,dp);
    }
     public int Total(int i , int j,List<List<Integer>> triangle,int[][] dp) {
        if(i>=triangle.size() || j>=triangle.get(i).size())
            return Integer.MAX_VALUE;
        if(i==triangle.size()-1) return triangle.get(i).get(j);
        if(dp[i][j]!=-1)  return dp[i][j] ;
        int down = triangle.get(i).get(j) + Total(i+1,j,triangle,dp);
        int diag = triangle.get(i).get(j) + Total(i+1,j+1,triangle,dp);
        return dp[i][j] = Math.min(down,diag);
    }
}