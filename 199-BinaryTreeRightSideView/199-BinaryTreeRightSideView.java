// Last updated: 7/28/2025, 12:31:11 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
       rightView(result,root,0);
        return result;
        
    }
    
    public  void rightView(List<Integer> ans,TreeNode root , int level)
    {
        if(root == null ) return  ;
        if(level==ans.size()) ans.add(root.val);
        rightView(ans,root.right,level+1);
        rightView(ans,root.left,level+1);
    }
}