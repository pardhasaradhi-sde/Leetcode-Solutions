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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        List<ListNode> odd=new ArrayList<>();
        List<ListNode> even=new ArrayList<>();
        int index=1;
        ListNode temp=head;
        while(temp!=null)
        {
            if(index%2==0)
            {
                even.add(temp);
            }
            else{
                odd.add(temp);
            }
            temp=temp.next;
            index++;
        }
        for(int i=0;i<odd.size()-1;i++)
        {
            odd.get(i).next=odd.get(i+1);
        }
        for(int i=0;i<even.size()-1;i++)
        {
            even.get(i).next=even.get(i+1);
        }
        if(!odd.isEmpty())
        {
            odd.get(odd.size()-1).next=even.isEmpty()?null:even.get(0);
        }
        if(!even.isEmpty())
        {
            even.get(even.size()-1).next=null;
        }
        
        return odd.get(0);
    }
}