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
        List<List<Integer>> l1=new ArrayList<>();
        Queue<TreeNode> q1=new ArrayDeque<>();
        if(root==null)
        {
            return l1;
        }
        q1.offer(root);
        while(!q1.isEmpty())
        {
            List<Integer> l2=new ArrayList<>();
            int size=q1.size();
            for(int i=0;i<size;i++)
            {
                TreeNode ele=q1.poll();
                l2.add(ele.val);
                if(ele.left!=null)
                {
                    q1.offer(ele.left);
                }
                if(ele.right!=null)
                {
                    q1.offer(ele.right);
                }
            }
            l1.add(l2);
        }
        return l1;
    }
}