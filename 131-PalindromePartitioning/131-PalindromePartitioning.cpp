// Last updated: 7/28/2025, 12:31:38 PM
class Solution {
public:
    int n;
    
    bool isPalindrome(string s, int st, int end) {
    
         int i=st, j=end;

         while(i < j) {
             if(s[i] != s[j]) return false;
             i++;
             j--;
         }
       
         return true;
    }

    vector<vector<string>> ans;

    void solve(string& s, int idx, vector<string>& curr) {
         
         if(idx == n) {
             ans.push_back(curr);
             return;
         }

         for(int i=idx; i<n; i++) {
            if(isPalindrome(s, idx, i)) {
                curr.push_back(s.substr(idx, i-idx+1));
                solve(s, i+1, curr);
                curr.pop_back();
            }
         }

    }

    vector<vector<string>> partition(string s) {

        n = s.length(); 
        vector<string> tmp;

        solve(s, 0, tmp);

        return ans;
    }
};