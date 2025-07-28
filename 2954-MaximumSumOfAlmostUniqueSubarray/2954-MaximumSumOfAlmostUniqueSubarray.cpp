// Last updated: 7/28/2025, 12:28:16 PM
class Solution {
public:
    long long maxSum(vector<int>& nums, int m, int k) {
        int right = 0 , left = 0 ;
        long long maxSum = 0 , sum = 0;
        unordered_map<int , int > mpp;
        int n = nums.size();
        while(right < n){
            sum += nums[right];
            mpp[nums[right]]++;
            if(right - left + 1 > k){
                sum -=nums[left];
                mpp[nums[left]]--;
                if(mpp[nums[left]]==0)mpp.erase(nums[left]);
                left++;
            }
            if(right - left + 1 ==k && mpp.size()>=m){
                maxSum = max(maxSum , sum);
            }
            right++;
        }
        return maxSum;
    }
};