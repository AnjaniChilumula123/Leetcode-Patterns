// Last updated: 7/28/2025, 12:28:32 PM
class Solution {
    public String firstPalindrome(String[] words) {
       
       for(int i=0;i<words.length;i++)
       {
           if(pal(words[i])==true)
              return words[i];
       }
       return "";
    }
    Boolean pal(String  str)
    {   
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
         return true;
       
    }
}