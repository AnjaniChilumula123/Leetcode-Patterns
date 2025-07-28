// Last updated: 7/28/2025, 12:32:27 PM
class Solution {
    public void sortColors(int[] nums) {
        // int low=0,mid=0,high=nums.length-1 ,temp;
        // while(mid<=high)
        // {
        //     if(nums[mid]==0)
        //     {
        //        temp=nums[mid];
        //        nums[mid]=nums[low];
        //        nums[low]=temp;
        //        low++;
        //        mid++;
        //     }
        //     else if (nums[mid]==1)
        //     {
        //         mid++;
        //     }
        //     else {
        //         temp=nums[high];
        //         nums[high]=nums[mid];
        //         nums[mid]=temp;
        //         high--;
        //     }
        // }


        int low=0,mid=0,high=nums.length-1;
        int temp;
        while(mid<=high)
        {   
            if(nums[mid]==0)
            {
               temp= nums[mid];
               nums[mid]=nums[low];
               nums[low]=temp;
               mid++;
               low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
             else
            {
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
               
            }
        }
    
    }
}