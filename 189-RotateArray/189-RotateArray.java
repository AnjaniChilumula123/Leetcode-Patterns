// Last updated: 7/28/2025, 12:31:15 PM
class Solution {
    public void rotate(int[] nums, int k) {
        
//          int i=nums.length-1;
//         while(k>0)
//         { i=nums.length-1;
//              while(i>=1)
//         {
//           int temp= nums[i];
//           nums[i]=nums[i-1];
//           nums[i-1]=temp;
//           i--;
//         }
//          k--;
            
//         }
        
    //optimizedd
        int n=nums.length;
       k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
        
       public  int[] rev(int nums[],int start, int end)
        {
            while(start<=end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
             return nums;
        }
       
            
        
    }
