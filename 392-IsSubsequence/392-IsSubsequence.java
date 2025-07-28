// Last updated: 7/28/2025, 12:30:24 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        String temp="";
        while(i<s.length() && j<t.length()){
             if(s.charAt(i)==t.charAt(j)){
                 temp=temp+s.charAt(i);
                 j++;
                 i++;
               
             }
             else  {
                 j++;
             }
        }
        if(temp.length()==s.length()) return true;
        else return false;
    }
}