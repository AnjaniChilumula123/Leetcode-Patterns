// Last updated: 7/28/2025, 12:28:35 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for( String i : operations)
        {
            if(i.charAt(1) =='+')  x=x+1;
            else x=x-1;
        }
        return x;
    }
}