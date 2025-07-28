// Last updated: 7/28/2025, 12:28:37 PM
class Solution {
public:
    int maxConsecutiveAnswers(string answerKey, int k) {
        int ans = max (func( answerKey , 'T' , k) , func( answerKey , 'F', k));
        return ans;
    }
    int func(string s , char c , int k){
        int right = 0 , left = 0 ,  n = s.size();
        int count = 0 ,sum =0;
        while ( right < n){
            count += s[right] == c;
            while(count > k){
               
                if(s[left] == c) count -- ;
                left ++;
            }
            sum = max (sum , right - left + 1);
            right ++ ;
        }
        return sum ;
    }
};