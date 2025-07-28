// Last updated: 7/28/2025, 12:33:29 PM
class Solution {
    public int reverse(int x) {
        int sum=0;
        int rem =0;
        int temp=x;
        
        if(x<0) temp=-x;
        while(temp>0)
        { 
            if (sum > Integer.MAX_VALUE/10 || sum < Integer.MIN_VALUE/10 )
                return 0 ;
           rem = temp%10;
           sum=sum*10+rem;
           temp=temp/10;
        }
        if(x<0) return -sum;
        return sum;
    }
}