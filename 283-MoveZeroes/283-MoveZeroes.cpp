// Last updated: 7/28/2025, 12:30:36 PM
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i=0;
        int n = nums.size();
        for(int j=1;j<n;j++){
            
            if(nums[i] == 0 && nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            
            }
            if(nums[i]!=0) i++;
        }
        
    }
};