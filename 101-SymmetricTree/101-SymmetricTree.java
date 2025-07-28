// Last updated: 7/28/2025, 12:32:08 PM
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
    public boolean isSymmetric(TreeNode root) {

       return root==null || SymmetricCheck(root.left,root.right);    
    }
    boolean SymmetricCheck(TreeNode left , TreeNode right)
     {
         if(left==null || right==null) return left==right;
         if(left.val!=right.val) return false;
         return SymmetricCheck(left.left,right.right) &&
             SymmetricCheck(left.right,right.left);
     }
}