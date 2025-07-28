// Last updated: 7/28/2025, 12:30:17 PM
class Solution {
public:
int allZeroes(vector<int> arr){
    for(int i = 0 ; i<arr.size();i++){
        if(arr[i]!=0) return false;
    }
    return true;
}
    vector<int> findAnagrams(string s, string p) {
        int right = 0 , left = 0 ;
        vector<int> ans;
        vector<int> freq(26,0);
        int slen = s.length();
        int plen = p.length();
        for(int i = 0 ; i<plen;i++){
            freq[p[i]-'a']++;
        }
        while(right < slen){
            freq[s[right]-'a'] -- ;
            if(right - left + 1 == plen){
                if(allZeroes(freq)) ans.push_back(left);
                freq[s[left]-'a']++;
                left++;
            }
            right++;
        }
        return ans;
    }
};