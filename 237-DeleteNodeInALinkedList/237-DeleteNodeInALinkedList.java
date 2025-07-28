// Last updated: 7/28/2025, 12:30:47 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       
       // 4 -> 5 -> 1-> 9-> null
       
       /* since we are not given the head (nodes before the given nodes)
        so... we just copy the next in the place give node */
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}