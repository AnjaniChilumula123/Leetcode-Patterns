// Last updated: 7/28/2025, 12:30:20 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0,maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) 
            {
               sum=sum+1;
               maxi=Math.max(sum,maxi);
            }
            else sum=0;
        }
        return maxi;
    }
}