/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    
    ArrayList<Integer> zigZagTraversal(Node root) {
       ArrayList<Integer> l1=new ArrayList<>();
       Queue<Node> q1=new LinkedList<>();
       if(root==null)
       {
           return l1;
       }
       q1.offer(root);
       
       boolean lefttoright=true;
       while(!q1.isEmpty())
       {
           int size=q1.size();
           ArrayList<Integer> level=new ArrayList<>();
           for(int i=0;i<size;i++)
           {
               Node ele=q1.poll();
               level.add(ele.data);
               if(ele.left!=null)
               {
                   q1.offer(ele.left);
               }
               if(ele.right!=null)
               {
                   q1.offer(ele.right);
               }
           }
           if(!lefttoright)
           {
               Collections.reverse(level);
           }
           l1.addAll(level);
           lefttoright=!lefttoright;
       }
       return l1;
    }
}