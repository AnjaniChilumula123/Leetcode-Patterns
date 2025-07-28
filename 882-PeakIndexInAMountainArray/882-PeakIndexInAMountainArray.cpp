// Last updated: 7/28/2025, 12:29:44 PM
class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int low = 0 , high = arr.size()-1;
        while(low <= high){
            int mid =(low+high)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return -1;
    }
};