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
    public void leveltraversal(TreeNode root,List<List<Integer>> l1,int level)
    {
     if(root==null)
     {
        return;
     }   
     if(l1.size()==level)
     {
        l1.add(new ArrayList<>());
     }
     l1.get(level).add(root.val);
     leveltraversal(root.left,l1,level+1);
     leveltraversal(root.right,l1,level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        leveltraversal(root,l1,0);
        return l1;
    }
}