// Last updated: 7/28/2025, 12:29:43 PM
class Solution {
public:
 
    long long func(vector<int>& piles, int h){
        long long sum = 0 ;
        for(int i = 0 ; i< piles.size() ; i++){
            sum = sum + ceil((double)(piles[i])/(double)(h));
        }
        return sum;
    }
    int minEatingSpeed(vector<int>& piles, int h) {
              int low = 1 , high =  *max_element(piles.begin() , piles.end());
              int ans = -1;
              while(low <=  high){
                int mid = (low+high)/2;
                long long res = func(piles,mid);
                if(res <= h){
                    high = mid - 1;
                }
                else low = mid+1;

              }
              return low;
    }
};