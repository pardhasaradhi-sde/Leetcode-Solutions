// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree {
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Node> prev=new Stack<>();
        if(root==null)
        {
            return res;
        }
        prev.push(root);
        while(!prev.isEmpty())
        {
            Node ele=prev.pop();
            res.add(ele.data);
            if(ele.right!=null)
            {
                prev.push(ele.right);
            }
            if(ele.left!=null)
            {
                prev.push(ele.left);
            }
        }
        return res;
    }
}