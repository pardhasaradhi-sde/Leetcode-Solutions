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
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> prev=new Stack<>();
        Stack<Integer> depth=new Stack<>();
        if(root==null)
        {
            return 0;
        }
        prev.push(root);
        depth.push(1);
        int maxdepth=0;
        while(!prev.isEmpty())
        {
            TreeNode ele=prev.pop();
            int dep=depth.pop();
            maxdepth=Math.max(dep,maxdepth);
            if(ele.left!=null)
            {
                prev.push(ele.left);
                depth.push(dep+1);
            }
            if(ele.right!=null)
            {
                prev.push(ele.right);
                depth.push(dep+1);
            }
        }
        return maxdepth;
    }
}