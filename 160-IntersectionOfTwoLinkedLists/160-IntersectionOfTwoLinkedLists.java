// Last updated: 7/28/2025, 12:31:20 PM
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
   if(headA==null || headB==null) return null;
    //   int count1=0 ,count2=0;
    //   ListNode dum1=headA,  dum2 =headB;
    //   ListNode temp=headA;
    //   while(temp!=null)
    //   {
    //       count1 = count1+1;
    //       temp=temp.next;
    //   }
    //     temp=headB;
    //      while(temp!=null)
    //   {
    //       count2 = count2+1;
    //       temp=temp.next;
    //   }
    //   if(count1>count2)
    //   {
    //       for(int i=0;i<count1;i++)
    //       {
    //          dum1 = dum1.next;
    //       }
    //   }
    //    else
    //   {
    //       for(int i=0;i<count2;i++)
    //       {
    //          dum2 = dum2.next;
    //       }
    //   }
    //   while(dum1!=dum2)
    //   {
    //       dum1 = dum1.next;
    //       dum2 = dum2.next;
    //   }
    //   return dum1;
    ListNode A =headA;
    ListNode B = headB;

    while(A!=B)
    {
        A=(A==null)? headB : A.next;
        B =(B==null)? headA : B.next;
    }
    return A;


        
    }
}