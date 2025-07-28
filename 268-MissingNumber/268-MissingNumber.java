// Last updated: 7/28/2025, 12:30:39 PM
class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum1=0 , sum2=0;
        for(int i=0;i<=length;i++){
           sum1+=i;
        }
         for(int i=0;i<length;i++){
           sum2+=nums[i];
        }
        return sum1-sum2;
        
    }
}