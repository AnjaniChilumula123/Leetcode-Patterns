// Last updated: 7/28/2025, 12:32:46 PM
class Solution {
private:
    void findsum(int ind, int tar, vector<int> &arr, vector<vector<int>> &ans, vector<int> &ds) {
          if(tar==0){
             ans.push_back(ds);
             return ;
          }
          for(int i=ind;i<arr.size();i++){
            if(i>ind && arr[i-1]==arr[i])continue;
            if(arr[i]>tar)break;
            ds.push_back(arr[i]);
            findsum(i+1,tar-arr[i],arr,ans,ds);
            ds.pop_back();
          }
    }

public:
    vector<vector<int>> combinationSum2(vector<int>& can, int tar) {
        sort(can.begin(),can.end());
        vector<vector<int>> ans;
        vector<int> ds;  
        findsum(0, tar, can, ans, ds);
        return ans;
    }
};