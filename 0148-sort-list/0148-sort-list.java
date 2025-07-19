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
    public ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return prev;
    }
    public ListNode merge(ListNode head1,ListNode head2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(head1!=null && head2!=null)
        {
            if(head1.val>head2.val)
            {
                tail.next=head2;
                head2=head2.next;
            }
            else{
                tail.next=head1;
                head1=head1.next;
            }
            tail=tail.next;
        }
        while(head1!=null)
        {
            tail.next=head1;
            head1=head1.next;
            tail=tail.next;
        }
        while(head2!=null)
        {
            tail.next=head2;
            head2=head2.next;
            tail=tail.next;
        }
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode mid=middle(head);
        ListNode rightHead=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rightHead);
        return merge(left,right);

    }
}