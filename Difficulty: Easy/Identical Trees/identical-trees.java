/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

class Solution {
    boolean same(Node p1,Node p2)
    {
        if(p1==null && p2==null)
        {
            return true;
        }
        if(p1==null || p2==null)
        {
            return false;
        }
        if(p1.data!=p2.data)
        {
            return false;
        }
        return same(p1.left,p2.left) && same(p1.right,p2.right);
    }
    boolean isIdentical(Node root1, Node root2) {
        return same(root1,root2);
    }
}