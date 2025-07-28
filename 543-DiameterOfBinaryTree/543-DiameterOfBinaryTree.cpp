// Last updated: 7/28/2025, 12:30:05 PM
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
   
    int diameterOfBinaryTree(TreeNode* root) {
         int maxi = INT_MIN;
          maxDepth(root,maxi);
          return maxi;

    }
    int maxDepth(TreeNode* root,int &maxi) {
       if(root == nullptr) return 0;
        int left = maxDepth(root->left,maxi);
        int right = maxDepth(root->right,maxi);
        maxi = max(maxi , left+right);
        return max(left , right)+1;
    }
};