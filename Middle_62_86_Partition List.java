public class Solution {
    public static ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode beforex = null,afterx = null;
        for(ListNode node = head; node!=null; node=node.next) {
        	if(node.val<x) {
        		if(beforex == null)
        			beforex = new ListNode(node.val);
        		else {
        			ListNode temp = beforex;
        			while(temp.next!=null)
        				temp=temp.next;
        			temp.next=new ListNode(node.val);
        		}
        	}
        	else {
        		if(afterx == null)
        			afterx = new ListNode(node.val);
        		else {
        			ListNode temp = afterx;
        			while(temp.next!=null)
        				temp=temp.next;
        			temp.next=new ListNode(node.val);
        		}
        	}
        }
        ListNode temp = beforex;
		if (temp!=null) {
			while(temp.next!=null)
				temp=temp.next;
			temp.next=afterx;
	        return beforex;
		}
		else
			return afterx;
    }
}
