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
    public ListNode reverse (ListNode head,ListNode tail)
    {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=tail)
        {
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)
        {
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevgrouptail=dummy;
        ListNode curr=head;
        while(true)
        {
            ListNode grouptail=curr;
            for(int i=0;i<k;i++)
            {
                if(grouptail==null)
                {
                    return dummy.next;
                }
                grouptail=grouptail.next;
            }
            ListNode nextgrouphead=grouptail;
            ListNode grouphead=reverse(curr,grouptail);
            prevgrouptail.next=grouphead;
            curr.next=nextgrouphead;
            prevgrouptail=curr;
            curr=nextgrouphead;
        }
    }
}