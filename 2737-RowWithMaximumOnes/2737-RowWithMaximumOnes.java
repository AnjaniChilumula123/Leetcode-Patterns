// Last updated: 7/28/2025, 12:28:21 PM
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int cntOnes = -1 , cntMax=0;
        int ind=-1;
        int n = mat.length;
        int m = mat[0].length;
        int [] ans = new int[2];
        for(int i=0;i<n;i++){
             cntOnes =  m - UpperBound(mat[i],m,0);
            if(cntOnes>cntMax){
                cntMax=cntOnes;
                ind=i;
                 ans[0]=ind;
                 ans[1]=cntMax;
            }
        }
        
       
        return ans;
    }
    public static int UpperBound ( int [] arr , int m , int x){
        Arrays.sort(arr);
        int low=0,high=m-1,ans=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
}