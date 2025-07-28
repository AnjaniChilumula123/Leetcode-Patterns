// Last updated: 7/28/2025, 12:30:43 PM
class Solution {
public:
    bool isAnagram(string s, string t) {

        int n = t.length();
        int m = s.length();
        if(n != m) return false;
        map<char,int> map1;
        map<char,int> map2;
        for(int i=0;i<n;i++){
            map1[t[i]]++;
        }
        for(int i=0;i<m;i++){
            map2[s[i]]++;
        }
        return map1 == map2;

    }
};