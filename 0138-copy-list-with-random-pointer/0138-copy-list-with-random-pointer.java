/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Map<Node,Node> m1=new HashMap<>();
       Node temp=head;
       while(temp!=null)
       {
        m1.put(temp,new Node(temp.val));
        temp=temp.next;
       }
       temp=head;
       while(temp!=null)
       {
        m1.get(temp).next=m1.get(temp.next);
        m1.get(temp).random=m1.get(temp.random);
        temp=temp.next;
       }
       return m1.get(head);
    }
}