// Last updated: 7/28/2025, 12:29:32 PM
class Solution {
    public int shipWithinDays(int[] weights, int d) {
    int n= weights.length;
        int low=maximum(weights);
        int sum=0;
        for(int a : weights){
            sum+=a;
        }
        int totalDay=0,ans=1;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            totalDay=daysReq(weights,mid);
            if(totalDay<=d){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
        
    }
    public static int daysReq(int [] arr,int capacity){
        int days=1,load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>capacity){
                days=days+1;
                load=arr[i];
            }
            else load=load+arr[i];
        }
        return days;
    }
     public static int maximum(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
             max=Math.max(max, arr[i]);
        }
        return max;
    }
}