// Last updated: 7/28/2025, 12:33:28 PM
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    //      int start = -1 , ans = 0;
    //      vector<int> m(128,-1);
    //      for(int i = 0 ;i < s.size() ;i++){
    //         start = max(start , m[s[i]]);
    //         m[s[i]] = i;
    //         ans = max(ans , i - start);
    //      }
    //      return ans;
    // }
    /*Shrinkable window*/
 int  left = 0 ,right = 0;
    int dup = 0 ,ans = 0;
    int N = s.size();
    int cnt[128] ={0};
    
    while(right < N) {
        cnt[s[right]]++;
        if(cnt[s[right]]==2) {dup++;}
        right++;
        while(dup>0){
            cnt[s[left]]--;
            if(cnt[s[left]]==1) dup--;
            left++;
        }
        
        ans = max(ans , right-left);
    }
    return ans;
    }
};