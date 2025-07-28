// Last updated: 7/28/2025, 12:28:56 PM
class Solution {
    public int xorOperation(int n, int start) {
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
        }
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}