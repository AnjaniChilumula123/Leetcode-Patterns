// Last updated: 7/28/2025, 12:29:56 PM
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
    class Pair{
        int lev;
        TreeNode node;
        Pair(int _lev, TreeNode _node)
        {
            lev=_lev;
            node=_node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
        if(root==null) return ans;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(0,root));
        while(!q.isEmpty())
        {
            int min = q.peek().lev;
            int first=0,last=0;
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int id = q.peek().lev-min;
                TreeNode temp = q.peek().node;
                q.poll();
                if(i==0) first =id;
                if(i==size-1) last = id;
                if(temp.left!=null) q.add(new Pair(2*id+1,temp.left));
                if(temp.right!=null) q.add(new Pair(2*id+2,temp.right));
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}