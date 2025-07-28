// Last updated: 7/28/2025, 12:30:28 PM
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char temp;
        for(int i=0;i<s.length/2;i++)
        {
            if(s[i]!=s[n-1-i])
            { 
                temp=s[i];
                s[i]=s[n-1-i];
                s[n-1-i]=temp;

            }
        }
        
    }
}