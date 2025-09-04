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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        Stack<TreeNode> s1=new Stack<>();
        TreeNode curr=root;
        while(true)
        {
            if(curr!=null)
            {
                s1.push(curr);
                curr=curr.left;
            }
            else{
                if(s1.isEmpty())
                {
                    break;
                }
                curr=s1.pop();
                l1.add(curr.val);
                curr=curr.right;
            }
        }
        return l1;
    }
}