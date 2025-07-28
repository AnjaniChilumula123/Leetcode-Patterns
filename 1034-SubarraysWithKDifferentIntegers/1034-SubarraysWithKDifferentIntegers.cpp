// Last updated: 7/28/2025, 12:29:31 PM
class Solution {
public:
    int subarraysWithKDistinct(vector<int>& nums, int k) {
        int ans = func(nums,k) - func(nums,k-1);
        return ans;
    }
    int func(vector<int>& nums, int k){
        int right = 0 , left = 0 , count = 0;
        unordered_map<int , int > mpp ;
        int n = nums.size();
        while(right < n){
            mpp[nums[right]]++;
            while(mpp.size() > k){
                mpp[nums[left]]--;
                if(mpp[nums[left]] == 0 ) mpp.erase(nums[left]);
                left ++ ;
            }
            count = count + right - left + 1;
            right++;
        }
        return count;
    }
};