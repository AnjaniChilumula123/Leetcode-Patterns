// Last updated: 7/28/2025, 12:32:50 PM
class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        int count=1;
        String s="11";
        String t;
        for(int i=3;i<=n;i++)
        {
            t="";
            s=s+'&';
            count=1;
            for(int j=1;j<s.length();j++)
            {
                if(s.charAt(j)!=s.charAt(j-1))
                {
                    t=t+count;
                    t=t+s.charAt(j-1);
                    count=1;
                }
                else{
                    count++;
                }

            }
            s=t;
        }
        return s;   
    }
}