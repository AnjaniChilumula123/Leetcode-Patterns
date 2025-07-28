// Last updated: 7/28/2025, 12:30:57 PM
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
        if(head==null ||head.next==null) return true;
         ListNode fast =head ,slow =head;
         while(fast.next!=null && fast.next.next!=null)
         {
             fast= fast.next.next;
             slow = slow.next;
         }
         slow.next=rev(slow.next);
         slow= slow.next;
         while(slow!=null)
         {
             if(head.val!=slow.val) return false;
            head=head.next;
            slow=slow.next;
         }
         return true;

    }
    ListNode rev(ListNode head)
    {
        ListNode prev= null , curr=head , nextNode=null;
        while(curr!=null)
        {
            nextNode = curr.next;
            curr.next= prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}