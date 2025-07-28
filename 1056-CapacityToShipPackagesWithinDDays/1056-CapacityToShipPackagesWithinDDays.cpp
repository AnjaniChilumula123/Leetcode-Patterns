// Last updated: 7/28/2025, 12:29:27 PM
class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int low = *max_element(weights.begin() , weights.end());
        int high = accumulate(weights.begin(),weights.end(),0);
        while(low <= high){
            int mid = (low+high)/2;
            int dayReq = check(weights , mid);
            if(dayReq <= days){
                high = mid -1;
            }
            else low = mid +1;
        }
        return low; 
    }
    int check(vector<int> weights , int cap){
        int sum = 0 , day=1;
        for(int i = 0;i<weights.size();i++){
            if(sum + weights[i]<=cap){
                sum += weights[i];
            }
            else{
                sum = weights[i];
                day ++;
            }
        }
        return day;
    }
};