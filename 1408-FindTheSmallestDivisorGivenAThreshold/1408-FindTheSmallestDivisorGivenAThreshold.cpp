// Last updated: 7/28/2025, 12:29:10 PM
class Solution {
public:
    int divisionResult(vector<int> nums , int div){
        int res = 0 ;
        for(int i=0;i<nums.size();i++){
            res += ceil((double)nums[i]/(double)div);
        }
        return res;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int low = 1 , high = *max_element(nums.begin() , nums.end());
        while(low <= high){
            int mid = (low+high)/2;
            int divisor = divisionResult(nums , mid);
            if(divisor <= threshold){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return low ;
    }
};