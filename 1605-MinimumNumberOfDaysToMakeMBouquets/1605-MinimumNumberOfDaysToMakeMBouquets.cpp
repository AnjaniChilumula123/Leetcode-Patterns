// Last updated: 7/28/2025, 12:28:58 PM
class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        int mini = INT_MAX , maxi = INT_MIN;
        long long val = m * 1ll * k * 1ll;
        if(val>bloomDay.size()) return -1;
        for(int i =0 ;i<bloomDay.size();i++){
            mini = min(mini , bloomDay[i]);
            maxi = max(maxi , bloomDay[i]);
        }
        int low = mini , high = maxi;
        while(low <= high){
            long long mid = (low+high)/2;
            bool daysReq = func (bloomDay , mid , m , k);
            if(daysReq ){
                high = mid -1;
            }
            else low = mid+1;
        }
        return low;
    }
    bool func(vector<int> bloom , int days, int bouq , int adj){
        int count =  0, noOfB =0;
        for(int i=0;i<bloom.size();i++){
            if(bloom[i]<=days){
                count ++ ;
            }
            else{
                noOfB += (count/adj);
                count =0;
            }
        }
        noOfB += (count/adj);
        return noOfB >= bouq;
    }
};