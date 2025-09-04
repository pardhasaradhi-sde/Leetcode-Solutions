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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> prev=new LinkedList<>();
        if(root==null)
        {
            return true;
        }
        prev.offer(root.left);
        prev.offer(root.right);
        while(!prev.isEmpty())
        {
            TreeNode ele1=prev.poll();
            TreeNode ele2=prev.poll();
            if(ele1==null && ele2==null)
            {
                continue;
            }
            if(ele1==null || ele2==null)
            {
                return false;
            }
            if(ele1.val!=ele2.val)
            {
                return false;
            }
            prev.offer(ele1.left);
            prev.offer(ele2.right);
            prev.offer(ele1.right);
            prev.offer(ele2.left);
        }
        return true;
    }
}