// Last updated: 7/28/2025, 12:31:34 PM
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node temp = null ;
        Node curr = head;
        while(curr!= null)
        { temp = curr.next;
          curr.next = new Node(curr.val);
          curr.next.next= temp;
          curr = temp ;  
        }
        curr = head ;
        while(curr!=null)
        {
          if(curr.next!= null)
          {
              curr.next.random = (curr.random != null)?curr.random.next:null;
          }
          curr = curr.next.next;   
        }
       		Node orig = head, copy = head != null ? head.next : null;
		 temp = copy;
		while(orig != null) {
			orig.next = orig.next.next;
			temp.next = temp.next != null ? temp.next.next: null;
			orig = orig.next;
			temp = temp.next;
		}
return copy;
    }
}