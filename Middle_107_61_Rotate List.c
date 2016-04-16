/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if(!head || !head->next)
        return head;
    struct ListNode* end;
    int count=1;
	for(end = head; end->next; end = end->next)
	    count++;
	end->next = head;
	struct ListNode *p1=head,*p2=head->next;
	for(int i=1;i<count-k%count;i++) {
		p1=p1->next;
		p2=p2->next;
	}
	p1->next = NULL;
	return p2;
}
