// Last updated: 7/28/2025, 12:30:53 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2) return true;
        if(n%2!=0||n==0) return false;
         while(n%2==0)
         {  
             n=n/2;
             if(n==1) return true;
             if(n%2!=0)
                return false;
         }
         return true;
         
        
    }
}