// Last updated: 7/28/2025, 12:29:58 PM
class Solution {
public:
    bool judgeSquareSum(int c) {
        for(long long a = 0 ; a*a <= c ; a++){
            long long b = sqrt(c - (a*a));
            if(a*a + b*b == c){
                return true ;
            }
        }
        return false ;
    }
};