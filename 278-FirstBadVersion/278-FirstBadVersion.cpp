// Last updated: 7/28/2025, 12:30:37 PM
// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int low = 0 , high = n,ans=0;
        while(low <= high){
            int mid = high+(low-high)/2;
            if(isBadVersion(mid)){
                ans = mid ;
                high = mid -1;
            }
            else low = mid+1;
        }
        return ans;
    }
};