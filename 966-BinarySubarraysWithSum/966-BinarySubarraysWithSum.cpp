// Last updated: 7/28/2025, 12:29:35 PM
class Solution {
public:
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        int ans  = func( nums,goal) - func(nums, goal - 1);
        return ans ;
    }
    int func(vector<int>& nums, int goal){
        int right = 0 , left = 0 , count = 0;
        int n = nums.size();
       long sum = 0 ;
        while(right < n) {
            sum += nums[right];
            while(sum > goal && left <= right){
                sum = sum - nums[left];
                left ++;
            } 
            if(sum <= goal){
                count = count +(right-left+1);
            }
            right ++ ;
        }
        return count ;
    }
};