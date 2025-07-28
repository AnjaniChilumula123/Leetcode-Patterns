// Last updated: 7/28/2025, 12:30:32 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n%3!=0 || n==0) return false;
        return isPowerOfThree(n/3);
    }
}