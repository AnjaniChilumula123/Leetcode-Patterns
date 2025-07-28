// Last updated: 7/28/2025, 12:29:36 PM
class Solution {
public:
    int fib(int n) {
        if(n==0 || n==1) return n;
        else return fib(n-2)+fib(n-1);
    }
};