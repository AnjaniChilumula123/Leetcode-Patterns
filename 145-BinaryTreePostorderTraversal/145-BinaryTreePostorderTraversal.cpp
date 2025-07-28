// Last updated: 7/28/2025, 12:31:24 PM
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
    // vector<int> postorderTraversal(TreeNode* root) {
    //     vector<int> ans;
    //     function(root,ans);
    //     return ans;
    // }
    // void function(TreeNode* root , vector<int>&ans){
    //     if(root == nullptr) return ;
    //     function(root->left,ans);
    //     function(root->right,ans);
    //     ans.push_back(root->val);
    // }
    vector<int> postorderTraversal(TreeNode* root) {
        stack<TreeNode*> st1 , st2;
        vector<int> postorder;
        if (root == nullptr)
            return postorder;
        st1.push(root);
        while(!st1.empty()){
            TreeNode* node = st1.top();
            st1.pop();
            st2.push(node);
            if(node->left != nullptr ) st1.push(node->left);
             if(node->right != nullptr ) st1.push(node->right);
        }
        while(!st2.empty()){
            postorder.push_back(st2.top()->val);
            st2.pop();
        }
        return postorder;
    }
};