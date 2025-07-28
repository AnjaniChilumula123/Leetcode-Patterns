// Last updated: 7/28/2025, 12:28:15 PM
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE ,maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=min && nums[i]!=maxi) return nums[i];
        }
        return -1;
    }
}