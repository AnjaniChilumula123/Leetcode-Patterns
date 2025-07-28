// Last updated: 7/28/2025, 12:29:54 PM
class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        if(nums.length==1 && nums[0]==target) return 0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}