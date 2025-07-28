// Last updated: 7/28/2025, 12:32:04 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new  ArrayList<>();
      Queue<TreeNode> queue= new LinkedList<>();
      if(root==null) return res;
      queue.add(root);
      boolean flag =true;
      while(!queue.isEmpty())
      {
          int size = queue.size();
          List<Integer> row = new ArrayList<Integer>();
          for(int i=0;i<size;i++)
          {
              TreeNode node = queue.peek();
              queue.remove();
              row.add(node.val);
              if(node.left!=null) queue.add(node.left);
              if(node.right!=null) queue.add(node.right);

          }
          if(flag)
          {
              res.add(row);
              flag=false;
          }
          else{
              Collections.reverse(row);
              res.add(row);
              flag = true;
          }


      }
      return res;
    }
}