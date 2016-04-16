public class Solution {
    public ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null) // This list has only 0 or 1 node.
        	return head;	
        ListNode l1=head,l2=head.next;
        while(l1!=null && l2!=null) { 
        	int temp=l1.val;
        	l1.val=l2.val;
        	l2.val=temp;
        	l1=l1.next.next;
        	l2=l2.next;
        	if(l2==null)
        	    break;
        	else
        	    l2=l2.next;
        }
        return head;
    }
}
