struct ListNode* insertionSortList(struct ListNode* head) {
    if(!head || !head->next)
		return head;
	else {
		struct ListNode* sortedHead = (struct ListNode*)malloc(sizeof(struct ListNode));
		sortedHead->val = head->val;
		sortedHead->next = NULL;
		
		for (struct ListNode* node = head->next; node; node = node->next) {
			if(node->val <= sortedHead->val) { // this node is smaller than the smallest node of sortedHead
				struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
				newNode->val = node->val;
				newNode->next = sortedHead;
				sortedHead = newNode;
			}
			else {
				struct ListNode* temp;
				for(temp = sortedHead; temp; temp = temp->next) {
					if(temp->val <= node->val && (!temp->next || temp->next->val >node->val)) { //insert this node after temp
						struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
						newNode->val = node->val;
						newNode->next = temp->next;
						temp->next = newNode;
						break;
					}						
				}
			}
		}
		return sortedHead;
	}
}
