// Last updated: 7/28/2025, 12:31:36 PM
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0;
        for(int i=0 ; i<nums.size();i++){
            ans = ans^nums[i];
        }
        return ans;
    }
};