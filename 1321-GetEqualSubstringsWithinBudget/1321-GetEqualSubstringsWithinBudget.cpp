// Last updated: 7/28/2025, 12:29:13 PM
class Solution {
public:
    int equalSubstring(string s, string t, int maxCost) {
        int right = 0 ,left = 0 ;
        int ans = 0 , cost = 0 , n =s.size();
        while(right < n){
            cost += abs(s[right] - t[right]);
            while(left <= right && cost > maxCost){
                cost -= abs(s[left] - t[left]);
                left ++ ;
            }
            ans = max(ans , right - left + 1);
            right ++ ;
        }
        return ans;
        
    }
};