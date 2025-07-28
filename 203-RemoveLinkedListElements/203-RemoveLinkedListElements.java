// Last updated: 7/28/2025, 12:31:04 PM
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
    public ListNode removeElements(ListNode head, int val) {
     ListNode dummy = new ListNode(0);
     dummy.next = head;
     ListNode check = dummy ;
     while(check.next!=null){
         if(check.next.val == val){
             check.next = check.next.next;
         }
         else {
             check=check.next;
         }

     }
     return dummy.next;
    }
 
}