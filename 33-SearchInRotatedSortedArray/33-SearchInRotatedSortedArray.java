// Last updated: 7/28/2025, 12:33:04 PM
class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
          int low=0,high=n-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target) return mid;
           
                if(arr[low]<=arr[mid]){
                    if(arr[low]<=target&&target<=arr[mid]){
                        high=mid-1;
                    }
                    else
                        low=mid+1;
                }
            
             
                else{
                    if(arr[mid]<=target&&target<=arr[high]){
                        low=mid+1;
                    }
                    else
                       high=mid-1;
                }
            
        }
        return -1;
    }
}