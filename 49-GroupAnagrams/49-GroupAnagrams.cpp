// Last updated: 7/28/2025, 12:32:39 PM
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> mapp;
        for(auto s : strs){
            string word  = s;
            sort(word.begin(),word.end());
            mapp[word].push_back(s);
        }
        vector<vector<string>> anagram;
        for(auto x : mapp){
            anagram.push_back(x.second);
        }
        return anagram;
    }
};