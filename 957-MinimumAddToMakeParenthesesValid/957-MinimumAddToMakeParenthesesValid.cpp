// Last updated: 7/28/2025, 12:29:37 PM
class Solution {
public:
    int minAddToMakeValid(string s) {
        stack<char> st;
        for(int i=0;i<s.size();i++){
            if(s[i]=='('){
                st.push(s[i]);
            }
            else{
                if(st.empty() || st.top() == ')'){
                    st.push(s[i]);
                }
                else st.pop();
            }

        }
        return st.size();
    }
};