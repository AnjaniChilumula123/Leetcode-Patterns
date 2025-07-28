// Last updated: 7/28/2025, 12:31:01 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int i=0;i<k;i++){
        //     pq.add(nums[i]);
        // }
        // for(int i=k;i<nums.length;i++)
        // {
        //     if(pq.peek()<nums[i])
        //     {
        //         pq.poll();
        //         pq.add(nums[i]);
        //     }
        // }
        // return pq.peek();
         
        
        int res=getKthSmallest(nums,k,0,nums.length-1);
        return res;
        
    }

     int getpivotPoint(int [] nums, int low, int high)
    {
       int pivotElement = nums[high];
         int pivotPoint=low;
        for(int i=low;i<=high;i++)
        {
            if(nums[i]>pivotElement)
            {
                int temp=nums[pivotPoint];
                 nums[pivotPoint] = nums[i];
                nums[i]=temp;
                pivotPoint++;
            }
        }
        int temp=nums[high];
        nums[high]= nums[pivotPoint];
        nums[pivotPoint] =temp;
        return pivotPoint;
    }
    
    int getKthSmallest(int [] nums,int k, int low, int high)
    {
        int pivotPoint=getpivotPoint(nums,low,high);
        if(pivotPoint==k-1)
            return nums[pivotPoint];
        else if (pivotPoint<k-1)
            return getKthSmallest(nums,k,pivotPoint+1,high);
        else
            return getKthSmallest(nums,k,low,pivotPoint-1);
    }
   
    
}