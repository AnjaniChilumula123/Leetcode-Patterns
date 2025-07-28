// Last updated: 7/28/2025, 12:33:32 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
          HashMap<Integer,Integer> hm =new HashMap<>();
           int [] result = new int[2];
           for(int i=0;i<nums.length;i++)
           {
               if(hm.containsKey(target-nums[i]))
               {
                   result[0]=hm.get(target-nums[i]);
                   result[1]=i;
                   return result;
               }
               hm.put(nums[i],i);
           }
           return result;
    }
}
/* soo
   #declare a map
   #declare array of size 2(two sum)
   #traverse entire and check
     -if the target-nums[i] is already in map
     -then result[0] will be the value of target-nums[i] in the map
     -and result[1] will be pointer i 
    If the value is not present in the map we will put the value (nums[i] 
    into the map will i as value  ex:(11,3)
 */