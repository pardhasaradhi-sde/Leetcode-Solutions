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
    public ArrayList<Integer> findSpiral(Node root) {
    ArrayList<Integer> l1=new ArrayList<>();
    Queue<Node> q1=new LinkedList<>();
    if(root==null)
    {
        return l1;
    }
    int level=0;
    q1.offer(root);
    while(!q1.isEmpty())
    {
        int size=q1.size();
        List<Integer> le=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            Node ele=q1.poll();
            le.add(ele.data);
            if(ele.left!=null)
            {
                q1.offer(ele.left);
            }
            if(ele.right!=null)
            {
                q1.offer(ele.right);
            }
        }
        if(level%2==0)
        {
            Collections.reverse(le);
        }
        l1.addAll(le);
        level++;
    }
    return l1;
    }
}