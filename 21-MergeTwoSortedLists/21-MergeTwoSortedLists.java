// Last updated: 7/28/2025, 12:33:11 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
           EXTERNAL SPACE
        */       //   ListNode res = new ListNode ();
        //   ListNode dummy = res;
        //   while(list1!=null && list2!=null)
        //   {
        //       if(list1.val<=list2.val)
        //       {
        //           res.next=list1;
        //           list1=list1.next;
        //       }
        //     else
        //       {
        //           res.next=list2;
        //           list2=list2.next;
        //       }
        //       res=res.next;
        //   }
        //   if(list1!=null) res.next=list1;
        //   if(list2!=null) res.next=list2;
        //  return dummy.next  ;

/**INPLACE  */ 
       if(list1==null) return list2;
       if(list2==null) return list1;
        if(list1.val>list2.val)
        {
            ListNode temp=list1;
            list1=list2;
            list2=temp;
        }
        ListNode res = list1;

        while(list1!=null&&list2!=null)
        {
            ListNode temp =null;
            while(list1!=null&&list1.val<=list2.val)
            {
                temp=list1;
                list1=list1.next;
            }
            temp.next=list2;

            ListNode temp1 = list1;
            list1=list2;
            list2=temp1;
        }
        return res;

    }
}