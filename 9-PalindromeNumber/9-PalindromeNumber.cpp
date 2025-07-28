// Last updated: 7/28/2025, 12:33:22 PM
class Solution {
public:
    bool isPalindrome(int x) {
        long sum = 0;
        int xx = x;
        if(x<0) return false;
        while(xx != 0){
            int rem = xx%10;
            sum = sum*10+rem;
            xx=xx/10;
        }
    
        if(sum == x) return true;
        if(sum>INT_MAX || sum<INT_MIN) return false;
        return false;
    }
};