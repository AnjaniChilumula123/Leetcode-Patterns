// Last updated: 7/28/2025, 12:29:03 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max=-1;
         for(int i=0;i<n;i++)
         {
             max=Math.max(candies[i],max);
         }
        List <Boolean> b =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            b.add(candies[i]+extraCandies>=max);
        }
        return b;
    }
}