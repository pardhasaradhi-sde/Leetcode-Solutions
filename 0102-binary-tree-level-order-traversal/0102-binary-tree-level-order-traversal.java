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
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> trav=new LinkedList<>();
        if(root==null)
        {
            return res;
        }
        trav.offer(root);
        while(!trav.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            int size=trav.size();
            for(int i=0;i<size;i++)
            {
                TreeNode ele=trav.poll();
                level.add(ele.val);
                if(ele.left!=null)
                {
                    trav.add(ele.left);
                }
                if(ele.right!=null)
                {
                    trav.add(ele.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}