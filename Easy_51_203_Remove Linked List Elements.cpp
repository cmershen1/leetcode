class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        ListNode *p=head;
        if(!p || (!p->next && p->val==val))//p is null or (length of linklist=1 and this unique node is going to be deleted)
            return NULL;
        else {
            ListNode *q=head->next;
        	while(q) {
        		if(q->val==val) {// the first node is going to be deleted
        			p->next=p->next->next;
        			q=q->next;
        			continue;
        		}
        		else {
        			p=p->next;
        			q=q->next;
        		}
        	}
        	if(head->val!=val)
        	    return head;
        	else
        	    return head->next;
        }
    }
};
