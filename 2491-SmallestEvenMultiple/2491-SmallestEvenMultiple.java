// Last updated: 7/28/2025, 12:28:27 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        
        for(int i=1;i<=150;i++){
            // if(n*i%2==0 && n*i%n==0) return i;
            if(n*i%2==0) return n*i;
        }
        return n;
    }
}