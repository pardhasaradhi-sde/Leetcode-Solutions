/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    void mir(Node node)
    {
        if(node==null)
        {
            return;
        }
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
        mir(node.left);
        mir(node.right);
    }
    void mirror(Node node) {
        mir(node);
    }
}