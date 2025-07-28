// Last updated: 7/28/2025, 12:31:26 PM
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int min=Integer.MAX_VALUE ,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }
        }
        return min;
      

    }
}