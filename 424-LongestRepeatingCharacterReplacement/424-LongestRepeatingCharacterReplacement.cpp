// Last updated: 7/28/2025, 12:30:18 PM
class Solution {
public:
    int characterReplacement(string s, int k) {
        int right = 0 , left = 0 , maxLen = 0 , maxFreq = 0;
        int mpp[26]={0};
        int N = s.size();
        while(right <  N){
            mpp[s[right] - 'A']++;
            maxFreq = max(maxFreq , mpp[s[right] - 'A']);
            if((right - left + 1) - maxFreq <= k){
                maxLen = max(maxLen , right - left + 1);
            }
            while((right - left + 1) - maxFreq > k){
                 mpp[s[left] - 'A']--;
                 left ++ ;
            }
            right ++;
        }
        return maxLen ;
    }
}; 