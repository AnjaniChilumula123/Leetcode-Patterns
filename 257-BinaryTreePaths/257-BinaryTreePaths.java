// Last updated: 7/28/2025, 12:30:40 PM
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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> res = new  ArrayList<> ();
       if(root==null) return res;
       getPaths(root,res,"");
       return res;
    }

    public void getPaths (TreeNode root , List<String> res , String str)
    {
        if(root.left==null && root.right==null) res.add(str+root.val);
        if(root.left!=null ) getPaths(root.left,res,str+root.val+"->");
        if(root.right!=null ) getPaths(root.right,res,str+root.val+"->");
    }
}