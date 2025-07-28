// Last updated: 7/28/2025, 12:31:42 PM
class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
      s=s.replaceAll("[^a-z0-9]","");
      int i=0,j=s.length()-1;
      while(i<j){
          if(s.charAt(i)!=s.charAt(j)) return false;
          i++;
          j--;
      }
      return true;
    }
}