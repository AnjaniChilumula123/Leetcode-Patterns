// Last updated: 7/28/2025, 12:29:28 PM
class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        //Bruteforce approach
        // int maxLen = 0 ;
        // int n = nums.size();
        // int zeroes = 0 , len =0 ;
        // for(int i = 0 ; i<n ;i++){
        //     zeroes = 0;
        //     for(int j = i ;j<n;j++){
        //         if(nums[j] == 0){
        //             zeroes++;
        //         }
        //         if(zeroes <= k){
        //                 len =  j - i + 1;
        //                 maxLen = max(maxLen , len);
        //             }
                
        //         else break ;
        //     }
        // }
        // return maxLen;

        // Sliding window - shrinkable window
        int right = 0, left = 0;
        int zeroes = 0 ,len = 0 , maxLen = 0;
        while(right < nums.size()){
            if(nums[right] == 0) zeroes++;
            while(zeroes > k){
                if(nums[left]==0) zeroes --;
                left ++ ;
            }
            if(zeroes <= k){
                len = right - left + 1;
                maxLen = max(maxLen , len);
            }
            right++;
        }
        return maxLen;
    }
};