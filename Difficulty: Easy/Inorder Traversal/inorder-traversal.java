/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    void in(Node root,ArrayList<Integer> res)
    {
        if(root==null)
        {
            return;
        }
        in(root.left,res);
        res.add(root.data);
        in(root.right,res);
    }
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        in(root,res);
        return res;
    }
}