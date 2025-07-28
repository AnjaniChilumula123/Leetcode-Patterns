// Last updated: 7/28/2025, 12:33:27 PM
class Solution {
    public boolean isPalindrome(int x) {
      int rev=0,rem=0,i=x;  
      if(x<0) return false;
      while(i!=0)
      {
          rem=i%10;
          rev=rem+rev*10;
          i=i/10;
      }
      if(rev==x){
          return true;
      }
      return false;
    }
}