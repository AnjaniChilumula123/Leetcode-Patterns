// Last updated: 7/28/2025, 12:30:29 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true; 
        if(n%4!=0||n==0) return false;
        return isPowerOfFour(n/4);
    }
}