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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> prev=new LinkedList<>();
        if(root==null)
        {
            return false;
        }
        prev.offer(root);
        while(!prev.isEmpty())
        {
            boolean xfound=false;
            boolean yfound=false;
            int size=prev.size();
            for(int i=0;i<size;i++)
            {
                TreeNode ele=prev.poll();
                if(ele.left!=null && ele.right!=null)
                {
                   if((ele.left.val==x && ele.right.val==y) || (ele.left.val==y && ele.right.val==x))
                   {
                    return false;
                   }
                }
                if(ele.left!=null)
                {
                    prev.offer(ele.left);
                    if(ele.left.val==x)
                    {
                        xfound=true;
                    }
                    if(ele.left.val==y)
                    {
                        yfound=true;
                    }
                }
                if(ele.right!=null)
                {
                    prev.offer(ele.right);
                    if(ele.right.val==x)
                    {
                        xfound=true;
                    }
                    if(ele.right.val==y)
                    {
                        yfound=true;
                    }
                }
            }
            if(xfound && yfound )
            {
                return true;
            }
            if(xfound || yfound)
            {
                return false;
            }
        }
        return false;
    }

}