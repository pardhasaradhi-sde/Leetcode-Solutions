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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            s.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<(size/2)+1;i++)
        {
            if(temp.val!=s.peek())
            {
                return false;
            }
            else{
                temp=temp.next;
                s.pop();
            }
        }
        return true;
    }
}