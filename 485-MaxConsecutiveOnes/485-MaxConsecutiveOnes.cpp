// Last updated: 7/28/2025, 12:30:14 PM
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int sum = 0;
        int n = nums.size();
        int maxSum =0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) sum =0 ;
            sum = sum + nums[i];
            maxSum = max(sum , maxSum);
            

        }
        return maxSum ;
    }
};