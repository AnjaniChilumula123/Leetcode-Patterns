// Last updated: 7/28/2025, 12:32:09 PM
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    // vector<int> inorderTraversal(TreeNode* root) {
    //     vector<int> ans;
    //     function(root,ans);
    //     return ans;
    // }
    // void function(TreeNode* root , vector<int> &ans ){
    //     if(root == nullptr) return;
    //     function(root->left,ans);
    //     ans.push_back(root->val);
    //     function(root->right,ans);
    // }
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> ans;
        if(root == nullptr) return ans;
        TreeNode* node = root;
        stack<TreeNode*> s;
        while(true){
            if(node != nullptr){
                s.push(node);
                node = node->left;
             }
             else{
                if(s.empty()) break;
                node = s.top();
                s.pop();
                ans.push_back(node->val);
                node = node->right;
             }
        }
        return ans;
    
    }
    
};