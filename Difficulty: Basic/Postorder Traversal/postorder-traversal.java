/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    void post(Node root,ArrayList<Integer> res)
    {
        if(root==null)
        {
            return;
        }
        post(root.left,res);
        post(root.right,res);
        res.add(root.data);
    }
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        post(root,res);
        return res;
    }
}