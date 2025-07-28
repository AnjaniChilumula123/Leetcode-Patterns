// Last updated: 7/28/2025, 12:32:07 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {    
     
   
   
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> resList = new LinkedList<List<Integer>>();
    if(root== null) return resList;
    q.offer(root);
    while(!q.isEmpty())
    {
       int levelNum = q.size();
       List<Integer> sublist = new ArrayList<Integer>();
       for(int i=0;i<levelNum;i++)
       {
           if(q.peek().left!=null) q.offer(q.peek().left);
           if(q.peek().right!=null) q.offer(q.peek().right);
           sublist.add(q.poll().val);
       }
       resList.add(sublist);
    }
    return resList;


        
    }
}