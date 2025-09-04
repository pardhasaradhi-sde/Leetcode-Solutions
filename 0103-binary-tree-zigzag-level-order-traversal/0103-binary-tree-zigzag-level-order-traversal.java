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
        List<List<Integer>> l1=new ArrayList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        if(root==null)
        {
            return l1;
        }
        q1.offer(root);
        boolean lefttoright=true;
        while(!q1.isEmpty())
        {
            int size=q1.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode ele=q1.poll();
                if(lefttoright)
                {
                    level.add(ele.val);
                }
                else{
                    level.add(0,ele.val);
                }
                if(ele.left!=null)
                {
                    q1.offer(ele.left);
                }
                if(ele.right!=null)
                {
                    q1.offer(ele.right);
                }
            }
            l1.add(level);
            lefttoright=!lefttoright;
        }
        return l1;
    }
}