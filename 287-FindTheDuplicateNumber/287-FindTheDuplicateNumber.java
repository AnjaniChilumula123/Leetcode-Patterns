// Last updated: 7/28/2025, 12:30:35 PM
class Solution {
    public int findDuplicate(int[] nums) {
//         Set<Integer> set =new HashSet<>();
//         int  b=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             set.add(nums[i]);
//         }
//         for(int i=0;i<nums.length;i++)
//         {    
//              if(!set.add(nums[i])) 
//                  b=nums[i];
//                  return b;
              
              
//         }
//           return nums.length;
/*Return Value: The function returns True if the element is not present in the set and is new, else it returns False if the element is already present in the set.*/


        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!set.add(nums[i])) {//
                return nums[i];
            }
        }

          return len;


    }}
