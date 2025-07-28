// Last updated: 7/28/2025, 12:29:15 PM
class Solution {
    public int smallestDivisor(int[] arr, int limit) {
    int n=arr.length;
        int min=minimum(arr);
        int max=maximum(arr);
        int ans=1,sum;
        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            sum=calSum(arr,mid);
            if(sum<=limit) {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
     public static int maximum(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
             max=Math.max(max, arr[i]);
        }
        return max;
    }
      public static int minimum(int[] arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
             min=Math.min(min, arr[i]);
        }
        return min;
    }
    public static int calSum(int [] arr ,int num){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=Math.ceil((double)arr[i]/(double)num);
        }
        return ans;
    }
    
}