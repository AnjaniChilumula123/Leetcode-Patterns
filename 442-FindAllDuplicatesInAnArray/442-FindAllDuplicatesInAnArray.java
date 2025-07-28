// Last updated: 7/28/2025, 12:30:16 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // List<Integer> res = new ArrayList<Integer>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     int index = Math.abs(nums[i])-1;
        //     if(nums[index]<0)
        //        { res.add(index+1);}
        //     nums[index]=-nums[index];
        // }
        // return res;


      List<Integer> res = new ArrayList<Integer>();

      Set<Integer> set = new HashSet<Integer>();

      for(int i=0;i<nums.length;i++)
      {
          if(set.contains(nums[i])) res.add(nums[i]);
          else set.add(nums[i]);
      }
      return res;





















    }
}