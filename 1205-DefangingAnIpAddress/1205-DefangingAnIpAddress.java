// Last updated: 7/28/2025, 12:29:20 PM
class Solution {
    public String defangIPaddr(String address) {
        String str ="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                str+="[.]";
            }
            else{
            str=str+address.charAt(i);}
        }
        return str;
    }
}