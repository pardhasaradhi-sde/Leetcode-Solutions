// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> l1=new ArrayList<>();
       Stack<Node> trac=new Stack<>();
       Stack<Node> rev=new Stack<>();
       if(node==null)
       {
           return l1;
       }
       trac.push(node);
       while(!trac.isEmpty())
       {
           Node ele=trac.pop();
           rev.push(ele);
           if(ele.left!=null)
           {
               trac.push(ele.left);
           }
           if(ele.right!=null)
           {
               trac.push(ele.right);
           }
       }
       while(!rev.isEmpty())
       {
           l1.add(rev.pop().data);
       }
       return l1;
    }
}