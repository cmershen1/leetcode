public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
			return l2;
		else if(l2==null)
			return l1;
		else {
			ListNode head=new ListNode(Math.min(l1.val,l2.val));
			ListNode temp=head;
			if(temp.val==l1.val && temp.val==l2.val) {
			    head.next=new ListNode(l1.val);
			    temp=temp.next;
			}
			if(temp.val==l1.val)
				l1=l1.next;
			if(temp.val==l2.val)
				l2=l2.next;
			while(l1!=null && l2!=null)	{
				if(l1.val<=l2.val) {
					ListNode p=new ListNode(l1.val);
					temp.next=p;
					temp=p;
					l1=l1.next;
				}
				else {
					ListNode p=new ListNode(l2.val);
					temp.next=p;
					temp=p;
					l2=l2.next;
				}
			}
			if(l1==null)
				temp.next=l2;
			else if(l2==null)
				temp.next=l1;
			return head;		
		}
    }
}
