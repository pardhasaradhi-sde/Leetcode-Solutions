/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateOnce(ListNode head)
    {
        if(head==null ||head.next==null)
        {
            return head;
        }
        ListNode secondlast=null;
        ListNode last=head;
        while(last.next!=null)
        {
            secondlast=last;
            last=last.next;
        }
        secondlast.next=null;
        last.next=head;
        return last;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            length++;
        }
        k=k%length; 
        for(int i=0;i<k;i++)
        {
            head=rotateOnce(head);
        }
        return head;
    }
}