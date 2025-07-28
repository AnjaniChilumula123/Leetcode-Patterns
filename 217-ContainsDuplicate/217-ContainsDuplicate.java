// Last updated: 7/28/2025, 12:31:00 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set <Integer> hs=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.add(nums[i])) 
                return true;
            else hs.add(nums[i]) ;
                   
        }
        
            return false;
    }
}