// Last updated: 7/28/2025, 12:28:50 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col= accounts[0].length;
        int max =accounts[0][0];
        for(int i=0;i<row;i++)
        {int sum=0;
            for(int j=0;j<col;j++)
            {
                sum=sum+accounts[i][j];
            }
            max=Math.max(sum,max);
        }
        return max;
        
    }
        
    
}