// Last updated: 7/28/2025, 12:33:15 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        int length = length(head);
        return reverse( head,k,length);
    }

    ListNode reverse(ListNode head , int k ,int length)
    {
        if(length<k) return head;
        int count=0;
        ListNode curr=head,prev=null,nex =null;
        while(count<k && curr!=null)
        {
            nex = curr.next;
            curr.next = prev;
            prev=curr;
            curr=nex;
            count++;

        }
        if(nex!=null) head.next = reverse(nex , k ,length-k);
        return prev;
    }
    int length(ListNode head)
    {
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            length++;
        }
        return length;
    }
    
}