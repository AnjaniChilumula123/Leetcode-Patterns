// Last updated: 7/28/2025, 12:31:02 PM
class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int right = 0, left = 0 ,sum = 0 , minSum = INT_MAX;
        int n = nums.size();
        while(right < n){
            sum += nums[right];
            
            while(sum >= target){
                minSum  = min(minSum , right - left + 1);
                sum -= nums[left];
                left ++ ;
            }
            right++;
        }
        if(minSum == INT_MAX) return 0;
        return minSum;
    }
};