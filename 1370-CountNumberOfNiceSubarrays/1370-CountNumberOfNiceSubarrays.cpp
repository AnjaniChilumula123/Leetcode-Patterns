// Last updated: 7/28/2025, 12:29:12 PM
class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int goal) {
        int ans  = func( nums,goal) - func(nums, goal - 1);
        return ans ;
    }
    int func(vector<int>& nums, int goal){
        int right = 0 , left = 0 , count = 0;
        int n = nums.size();
       long sum = 0 ;
        while(right < n) {
            sum += nums[right]%2;
            while(sum > goal && left <= right){
                sum = sum - nums[left]%2;
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