// Last updated: 7/28/2025, 12:31:29 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        // List<Integer>  res = new ArrayList<Integer>();
        //  if(root!= null)
        //  {
        //     res.addAll(postorderTraversal(root.left));
        //     res.addAll(postorderTraversal(root.right));
        //     res.add(root.val);
        //  }
        //  return res;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        List<Integer> postorder = new ArrayList<Integer>();
        if(root==null) return postorder;
        stack1.push(root);
        while(!stack1.isEmpty())
        {
           root = stack1.pop();
           stack2.add(root);
           if(root.left != null) stack1.push(root.left);
           if(root.right != null) stack1.push(root.right);
        }
        while(!stack2.isEmpty())
        {
            postorder.add(stack2.pop().val);
        }
        return postorder;
    }
}