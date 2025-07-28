// Last updated: 7/28/2025, 12:28:40 PM
class Solution {
    public int[] buildArray(int[] nums) {
        //extra space code
       /* int size = nums.length;
         int [] ans = new int [size];
        for(int i :nums)
        {
            ans[i] = nums[nums[i]];
        }
        
        return ans;*/
       // Without extra space code
        int n = nums.length;
         for(int i=0;i<n;i++)
         {
             nums[i] = nums[i] + n*(nums[nums[i]]%n);
         }
        for(int i=0;i<n;i++){
               nums[i]=nums[i]/n;
        }
        return nums;
    }
}