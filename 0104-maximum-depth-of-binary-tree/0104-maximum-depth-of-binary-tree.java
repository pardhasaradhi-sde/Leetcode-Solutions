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
    private int depth=0;
    public void depth1(TreeNode root,int node_depth)
    {
        if(root==null)
        {
            depth=Math.max(depth,node_depth);
            return;
        }
        depth1(root.left,node_depth+1);
        depth1(root.right,node_depth+1);
    }
    public int maxDepth(TreeNode root) {
        depth1(root,0);
        return depth;
    }
}