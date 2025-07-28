// Last updated: 7/28/2025, 12:32:14 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
       
        // if(root != null)
        // {
        //     res.addAll(inorderTraversal(root.left));
        //     res.add(root.val);
        //     res.addAll(inorderTraversal(root.right));
        // }
        // return res;

         List<Integer> inorder = new ArrayList<>();
         Stack<TreeNode> st =new Stack<TreeNode>();
         if(root==null) return inorder;
         TreeNode node = root;
         while(true)
         {
             if(node != null)
             {
                 st.push(node);
                 node=node.left;
             }
             else
             {
                 if(st.isEmpty())
                 { break;}
                node=st.pop();
                inorder.add(node.val);
                node = node.right;
                 
             }

         }
         return inorder;


    }

}