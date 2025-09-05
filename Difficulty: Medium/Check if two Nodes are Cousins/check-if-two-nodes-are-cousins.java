/*
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {

    // Returns true if the nodes with values 'a' and 'b' are cousins. Else returns false
    public boolean isCousins(Node root, int a, int b) {
        if (root == null) return false;
        if(a==b)
        {
            return false;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            boolean afound = false, bfound = false;

            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                // check if current node's children are a and b (siblings)
                if (node.left != null && node.right != null) {
                    if ((node.left.data == a && node.right.data == b) ||
                        (node.left.data == b && node.right.data == a)) {
                        return false; // same parent
                    }
                }

                // check current node itself
                if (node.data == a) afound = true;
                if (node.data == b) bfound = true;

                // push children
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            // if both found at this level → cousins
            if (afound && bfound) return true;

            // if only one found at this level → not cousins
            if (afound || bfound) return false;
        }

        return false;
    }
}
