// Last updated: 7/28/2025, 12:32:19 PM

class Solution {
public:
    string minWindow(string s, string t) {
     int right = 0 , left = 0 , minLen = INT_MAX , count = 0 , sIndex = -1;
     unordered_map<int,int> mpp ;
     for(int i = 0 ;i < t.size() ; i++){
        mpp[t[i]]++;
     }
     while(right < s.size()){
        if(mpp[s[right]] > 0) count = count + 1 ;
        mpp[s[right]] --;
        while(count == t.size()){
            if(right -  left + 1 < minLen){
                minLen = right - left + 1;
                sIndex = left ;
            }
            mpp[s[left]]++;
            if(mpp[s[left]]>0) count = count - 1;
            left ++ ;
        }
        right++;
     }
     return sIndex == -1 ? "" : s.substr(sIndex , minLen);
    }
};