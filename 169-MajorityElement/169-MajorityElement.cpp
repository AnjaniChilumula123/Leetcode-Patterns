// Last updated: 7/28/2025, 12:31:13 PM
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int  count = 0,element ;
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(count == 0){
                element = nums[i];
                count = 1;
            }
            else if(nums[i] == element){
                count ++ ;
            }
            else{
                count -- ;
            }
        }
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == element) count1++;
        }
        if(count1>(n/2)) return element;
        return -1;
    }
};