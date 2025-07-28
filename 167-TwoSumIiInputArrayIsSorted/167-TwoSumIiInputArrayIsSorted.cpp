// Last updated: 7/28/2025, 12:31:14 PM
class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int n = numbers.size();
        int left = 0 , right = n-1;
        vector<int> ans ;
        int sum = 0;
        while(left < right){
            sum = numbers[left] + numbers[right];
            if(sum == target){
                ans.push_back(left+1);
                ans.push_back(right+1);
                return ans;
            }
            else if(sum > target){
                right --;
            }
            else left ++;
        }
       return ans;
    }
};