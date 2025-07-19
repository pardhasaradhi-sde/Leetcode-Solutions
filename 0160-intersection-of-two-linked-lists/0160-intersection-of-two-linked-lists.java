/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> h1=new HashMap<>();
        while(headA!=null)
        {
            h1.put(headA,headA.val);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(h1.containsKey(headB) && h1.get(headB)==headB.val)
            {
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}