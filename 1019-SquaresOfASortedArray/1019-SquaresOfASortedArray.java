// Last updated: 7/28/2025, 12:29:33 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] =nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}