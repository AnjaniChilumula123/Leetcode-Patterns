// Last updated: 7/28/2025, 12:30:49 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int n=matrix.length;

        int m=matrix[0].length;
        
        for(int i=0;i<n;i++){
            if(binarySearch(matrix[i] , target)==true){
                  return true;
            }
        }
        return false;
    }
     public static boolean binarySearch(int[] arr ,int x){
        int n=arr.length;
        int low=0 , high=arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==x) return true;
            else if(arr[mid]>x) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}