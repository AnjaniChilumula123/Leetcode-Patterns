// Last updated: 7/28/2025, 12:28:38 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int [] ans = new int[2*length];
        for(int i=0;i<length;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<length;i++)
        {
            ans[i+length] = nums[i];
        }
        return ans;
    }
}