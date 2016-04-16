/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
	if(!headA||!headB)
		return NULL;
	struct ListNode *p;
	int lengtha,lengthb;
	for(p=headA,lengtha=0;p;p=p->next,lengtha++);
	for(p=headB,lengthb=0;p;p=p->next,lengthb++);

	if(lengtha>lengthb)	{
		for(int i=0;i<lengtha-lengthb;i++)
			headA=headA->next;
	}
	else if (lengthb>lengtha) {
		for(int i=0;i<lengthb-lengtha;i++)
			headB=headB->next;
	}
	while(headA!=headB)	{
		headA=headA->next;
		headB=headB->next;
	}
	return headA;
}
