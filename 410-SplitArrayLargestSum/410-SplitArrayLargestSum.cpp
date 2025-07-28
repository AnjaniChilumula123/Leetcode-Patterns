// Last updated: 7/28/2025, 12:30:22 PM
class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        int low = *max_element(nums.begin(),nums.end());
        int high = accumulate(nums.begin(),nums.end(),0);
        int ans =  -1;
        while(low<=high){
            int mid = (low+high)/2;
            int splittedArrays = func(nums,mid);
            if(splittedArrays <= k){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    int func( vector<int>& nums, int maxiValue){
        int splittedArrays = 1 , value = 0;
        for(int i = 0 ;i< nums.size();i++){
             if(value + nums[i] <= maxiValue){
            value += nums[i];
        }
        else{
            value = nums[i];
            splittedArrays += 1;
        }
        }
        return splittedArrays;
      
    }
    
};