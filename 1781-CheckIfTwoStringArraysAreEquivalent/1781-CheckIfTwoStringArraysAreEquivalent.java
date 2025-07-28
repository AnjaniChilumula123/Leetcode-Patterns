// Last updated: 7/28/2025, 12:28:51 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // String str1="", str2="";
        // for(int i=0;i<word1.length;i++)
        // {
        //     str1+=word1[i];
        // }
        // for(int i=0;i<word2.length;i++)
        // {
        //     str2+=word2[i];
        // }
        // if(str1.equals(str2)) return true;
        // else return false;
        return  String.join("",word1).equals(String.join("",word2));
        
    }
}