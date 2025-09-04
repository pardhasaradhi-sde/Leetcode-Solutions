/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int maxdepth=0;
    void heig(Node root,int cur_depth)
    {
        if(root==null)
        {
            maxdepth=Math.max(cur_depth,maxdepth);
            return;
        }
        heig(root.left,cur_depth+1);
        heig(root.right,cur_depth+1);
    }
    // Function to find the height of a binary tree.
    int height(Node node) {
      heig(node,0);
      return maxdepth-1;
    }
}