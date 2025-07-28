// Last updated: 7/28/2025, 12:33:33 PM
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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode temp =dummy ;
        int sum=0,carry=0;
        while(list1!=null||list2!=null||carry==1)
        {  sum=0;
            if(list1!=null) {
                sum+=list1.val;
                list1=list1.next;
            }
            if(list2!=null)
            {
                sum+=list2.val;
                list2=list2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }
}