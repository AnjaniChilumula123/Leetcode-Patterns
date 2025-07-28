// Last updated: 7/28/2025, 12:31:27 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
       
        ListNode* fast = head ;
        ListNode* slow = head ;
        while(fast != nullptr && fast->next != nullptr){
            fast = fast->next->next;
            slow = slow->next;
            if(fast == slow ) {
                break;
            }   
        }
        if (!(fast && fast->next)) return nullptr;
        while(head != slow){
            head = head->next;
            slow = slow->next;
        }
        return head;
    }
};