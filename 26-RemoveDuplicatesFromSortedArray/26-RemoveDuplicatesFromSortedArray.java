// Last updated: 7/28/2025, 12:33:12 PM
class Solution {
    public int removeDuplicates(int[] nums) {
       int  index=0;
       Set<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}