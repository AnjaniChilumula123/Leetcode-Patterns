// Last updated: 7/28/2025, 12:29:57 PM
class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
      int right = k-1, left = 0 , n = nums.size();
      double sum = 0 , maxSum = 0;
      for(int i = 0; i < k ;i++){
        sum = sum + nums[i];
      }
      maxSum =sum;
      right++;
      while(right < n){
        sum -= nums[left];
        sum += nums[right];
        left++;
        right++;
        maxSum = max(maxSum , sum);
      }
      return maxSum/(double)k;
    }
};