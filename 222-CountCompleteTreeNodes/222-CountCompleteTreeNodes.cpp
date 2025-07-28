// Last updated: 7/28/2025, 12:30:59 PM
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
    int countNodes(TreeNode* root) {
        int nodes = count(root);
        return nodes;
    }
   int count(TreeNode* root) {
        if(root == nullptr) {
            return 0;
        }

        return 1 + count(root->left) + count(root->right);
    }
};