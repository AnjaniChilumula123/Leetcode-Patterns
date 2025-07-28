// Last updated: 7/28/2025, 12:28:42 PM
class Solution {
public:
    int maxFrequency(vector<int>& nums, int k) {
        
        int left = 0 , right = 0 ,n = nums.size();
        long sum = 0 ;
        long ans=0;
         sort(nums.begin() , nums.end());
        while(right < n){
            sum += nums[right];
            while(nums[right]*static_cast<long>(right-left+1)>sum+k){
                sum -= nums[left];
                left++;
            }
            ans = max(ans,static_cast<long>(right-left+1));
            right++;
        }
        return static_cast<int>(ans);

    }
};