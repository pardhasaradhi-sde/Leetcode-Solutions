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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> tr1=new LinkedList<>();
        Queue<TreeNode> tr2=new LinkedList<>();
        if(p==null && q==null)
        {
            return true;
        }
        tr1.offer(p);
        tr2.offer(q);
        while(!tr1.isEmpty() && !tr2.isEmpty())
        {
            TreeNode ele1=tr1.poll();
            TreeNode ele2=tr2.poll();
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
            tr1.offer(ele1.left);
            tr2.offer(ele2.left);
            tr1.offer(ele1.right);
            tr2.offer(ele2.right);
        }
        return true;
    }
}