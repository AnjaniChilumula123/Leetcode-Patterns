// Last updated: 7/28/2025, 12:31:31 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> res = new ArrayList<>();
    //     if(root != null)  
    //    {
    //     res.add(root.val);
    //     res.addAll(preorderTraversal(root.left));
    //     res.addAll(preorderTraversal(root.right));
    //    }
    //    return res; 
    List<Integer> preorder = new ArrayList<Integer>();
    if(root==null ) return preorder;
    Stack<TreeNode> st = new Stack<TreeNode>();
    st.push(root);
    while(!st.isEmpty())
    {
        root = st.pop();
        preorder.add(root.val) ;
        if(root.right!=null) st.push(root.right);
        if(root.left!= null) st.push(root.left);
    }
    return preorder;
        
    }

}