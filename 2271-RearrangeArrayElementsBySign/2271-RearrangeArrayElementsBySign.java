// Last updated: 7/28/2025, 12:28:30 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] pos = new int[n/2];
        int [] neg = new int[n/2];
        int negind =0 ,posind=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg[negind]=nums[i];
                negind++;
            }
            else{
                pos[posind] = nums[i];
                posind++;
            }
        }
        for(int i = 0;i<n/2;i++){
            nums[2*i] = pos[i];
            nums[2*i+1] = neg[i];
        }
        return nums;
    }
}