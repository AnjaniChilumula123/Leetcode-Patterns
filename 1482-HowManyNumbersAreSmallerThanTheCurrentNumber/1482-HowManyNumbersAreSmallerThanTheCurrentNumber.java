// Last updated: 7/28/2025, 12:29:06 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int n = nums.length ;
        int []res = new int[n];
        int count=0;
          for(int i=0;i<n;i++)
          {
              count=0;
              for(int j=0;j<n;j++)
              {
                  if(j!=i && nums[i]>nums[j])
                  {
                      count++;
                  }    
              }
                res[i]=count;
          }
        return res;
      /*  int [] smaller = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            smaller[nums[i]]++;
        }
        for(int i=1;i<101;i++)
        {
            smaller[i]+=smaller[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            int pos=nums[i];
            if(pos==0) nums[i]=0;
            else nums[i] = smaller[pos-1];
            
        }
        return nums;*/
        
    }
}