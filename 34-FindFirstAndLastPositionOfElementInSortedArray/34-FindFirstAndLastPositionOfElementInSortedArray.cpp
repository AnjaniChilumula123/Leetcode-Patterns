// Last updated: 7/28/2025, 12:32:56 PM
class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int fir = first(nums , target);
        int sec = last(nums,target);
        return {fir , sec};
    }
    int first(vector<int>& nums, int target){
        int low =  0 , high = nums.size() - 1 ,ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid -1;
            }
            else if(nums[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
       int last(vector<int>& nums, int target){
        int low =  0 , high = nums.size() - 1 ,ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid] < target) {
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
        return ans;
    }
};