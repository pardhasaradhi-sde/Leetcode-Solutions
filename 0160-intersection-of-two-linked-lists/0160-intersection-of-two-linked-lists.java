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
        int size1=0;
        int size2=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null)
        {
            size1++;
            tempA=tempA.next;
        }
        while(tempB!=null)
        {
           size2++;
            tempB=tempB.next;
        }
        if(size1>size2)
        {
            int dif=size1-size2;
            for(int i=0;i<dif;i++)
            {
                headA=headA.next;
            }
        }
        else{
            int dif=size2-size1;

             for(int i=0;i<dif;i++)
            {
                headB=headB.next;
            }
        }
        ListNode left=headA;
        ListNode right=headB;
        while(left!=null && right!=null)
        {
            if(left==right)
            {
                return left;
            }
            left=left.next;
            right=right.next;
        }
        return null;
    }
}