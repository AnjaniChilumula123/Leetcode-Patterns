// Last updated: 7/28/2025, 12:29:02 PM
class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) {
        int lsum = 0 , rsum = 0 ;
        int n = cardPoints.size();
        for(int i = 0 ;i < k ;i++){
            lsum = lsum + cardPoints[i];
        }
        int maxSum = lsum ;
        int rind = n-1;
        for(int i = k-1 ; i >= 0 ;i-- ){
            rsum = rsum + cardPoints[rind];
            lsum = lsum - cardPoints[i];
           
            rind-- ;
            maxSum = max(maxSum , lsum+rsum);
        }
        return maxSum ;
    }
};