// Last updated: 7/28/2025, 12:28:18 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        int ans=0;
        for(int i=0;i<hours.length;i++)
        {
           if(hours[i]>=target)
           {
              ans++;
           }
        }
        return ans;

    }
}