// Last updated: 7/28/2025, 12:30:55 PM
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
    public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> ans = new ArrayList<>();
      ans = inorder(root,ans);
       return ans.get(k-1);
    }
    public ArrayList<Integer> inorder(TreeNode root ,ArrayList<Integer> ans )
    {  
       if(root==null) return null ;
       if(root!=null)  inorder(root.left,ans);
       if(root!=null) ans.add(root.val);
       if(root!=null)  inorder(root.right,ans);
       return ans;
    }
}