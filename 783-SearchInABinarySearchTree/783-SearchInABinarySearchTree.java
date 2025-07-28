// Last updated: 7/28/2025, 12:29:51 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
         if(root.val==val) return root;
        while(root!=null)
        {  
            if(root.val==val) return root;
            else if(root.val>val)
            { 
                root= root.left;
            }
            else
            {
                root=root.right;
            }
        }
        return null;
    }
}