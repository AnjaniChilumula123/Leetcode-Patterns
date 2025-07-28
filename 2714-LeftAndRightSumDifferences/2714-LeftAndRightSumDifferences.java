// Last updated: 7/28/2025, 12:28:23 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        // int [] left = new int[nums.length];
        // int [] right= new int[nums.length];
        // left[0]=0;
        // right[nums.length-1]=0;
        // for(int i=1;i<nums.length;i++)
        // {
        //     left[i]=left[i-1]+nums[i-1];
        // }
        // for(int i=nums.length-2;i>=0;i--)
        // {
        //     right[i]=right[i+1]+nums[i+1];
        // }
         int []diff=new int[nums.length];
        //  diff[0]=right[0];
        //  diff[nums.length-1]=left[nums.length-1];
        // for(int i=1;i<nums.length-1;i++)
        // {
        //     diff[i]=Math.abs(left[i]-right[i]);
        // }
        // return diff;
        int right = 0 , left=0;
        for(int i=1;i<nums.length;i++)
        {
            right+=nums[i];
        } 
        diff[0]=right;
        for(int i=1;i<nums.length;i++)
        {
            left+=nums[i-1];
            right-=nums[i];
            diff[i]=Math.abs(left-right);
        }
        return diff;

    }
}