// Last updated: 7/28/2025, 12:28:49 PM
class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int right = 0 ,left = 0 ,sum = 0 ,maxSum = 0;
        unordered_map<int , int > mpp ;
        int n  = nums.size();
        while(right < n){
            mpp[nums[right]]++;
            sum += nums[right];
            if(mpp[nums[right]]>1){
                while(mpp[nums[right]]>1){
                    sum -= nums[left];
                    mpp[nums[left]]--;
                    if(mpp[nums[right]] == 0) mpp.erase(nums[left]);
                    left++;
                }
            }
            maxSum = max(maxSum , sum);
            right++;
        }
        return maxSum ;
    }
};