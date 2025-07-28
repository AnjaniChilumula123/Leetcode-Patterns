// Last updated: 7/28/2025, 12:28:59 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        //int []rsum = new int [n];
           /* for(int i=0;i<n;i++)
            {
            int sum=0;
            for(int j=0;j<=i;j++)
                
            {  sum= sum+nums[j];
                
            }
             rsum[i]=sum;
        }*/
      int   prev=nums[0];
        for(int i=1;i<n;i++)
        {
            nums[i]=prev+nums[i];
            prev=nums[i];
        }
        return nums;
    }
}