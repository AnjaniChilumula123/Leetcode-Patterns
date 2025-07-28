// Last updated: 7/28/2025, 12:33:03 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb=lowerbound(nums,n,target);
        if(lb==n || nums[lb]!=target)  return new int[] {-1,-1};
        int ub=upperbound(nums,n,target);
        return new int[] {lb,ub};
    }
   static int lowerbound(int[] nums , int n , int k){
        int low=0,high=n-1 , ans=n, mid=0;
        while(low<=high){
           mid=(low+high)/2;
           if(nums[mid]>=k){
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
           }

        }
        return ans;
    }
   static int upperbound(int[] nums , int n , int k){
        int low=0,high=n-1 , ans=n, mid=0;
        while(low<=high){
           mid=(low+high)/2;
           if(nums[mid]>k){
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
           }
        }
        return ans-1;
    }
    };
