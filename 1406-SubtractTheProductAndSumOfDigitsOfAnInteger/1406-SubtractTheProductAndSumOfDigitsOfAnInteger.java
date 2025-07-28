// Last updated: 7/28/2025, 12:29:11 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,product=1;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10;

        }
       int  ans= product-sum;
        return ans;
    }
}