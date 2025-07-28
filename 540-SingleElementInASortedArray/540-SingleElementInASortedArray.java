// Last updated: 7/28/2025, 12:30:13 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}