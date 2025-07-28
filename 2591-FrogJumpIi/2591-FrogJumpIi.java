// Last updated: 7/28/2025, 12:28:24 PM
class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        int max=stones[1]-stones[0];
        for(int i=2;i<n;i++){
            max = Math.max(max,stones[i]-stones[i-2]);
        }
        return max;
    }
}