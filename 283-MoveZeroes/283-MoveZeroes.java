// Last updated: 7/28/2025, 12:30:41 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int low = 0 , high = 1;
        int n = nums.length;
        while(high<n){
            if(nums[low]==0 && nums[high]!=0){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp; 
            }
            else if(nums[low] == 0){
                high++;
            }
            else {
                low++;
                high++;
            }
        }
    }
    
}