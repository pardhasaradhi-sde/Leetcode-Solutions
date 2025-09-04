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
    public boolean sameornot(TreeNode p1,TreeNode p2)
    {
        if(p1==null &&  p2==null)
        {
            return true;
        }
        if(p1==null || p2==null)
        {
            return false;
        }
        if(p1.val!=p2.val)
        {
            return false;
        }
        
        return sameornot(p1.left,p2.left) && sameornot(p1.right,p2.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return sameornot(p,q);
    }
}