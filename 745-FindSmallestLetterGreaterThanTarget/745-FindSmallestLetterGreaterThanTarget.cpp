// Last updated: 7/28/2025, 12:29:53 PM
class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int low = 0 , high = letters.size() , ans = letters[0] ;
        if(letters[0] > target || target >= letters[letters.size()-1])
            return letters[0]; 
        while(low<=high){
            int mid = (low+high)/2;
            if(letters[mid]-'a'> target-'a'){
                ans = letters[mid];
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
};