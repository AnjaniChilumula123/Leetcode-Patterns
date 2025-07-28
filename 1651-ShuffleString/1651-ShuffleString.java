// Last updated: 7/28/2025, 12:28:54 PM
class Solution {
    public String restoreString(String s, int[] indices) {
     int n=s.length();
     char [] res= new char[n];
     for(int i=0;i<n;i++)
     {
         res[indices[i]]=s.charAt(i);
     }
     return new String(res);

        
    }
}