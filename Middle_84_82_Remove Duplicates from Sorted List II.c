struct ListNode* deleteDuplicates(struct ListNode* head) {
	 if (!head || !head->next)
		 return head;
	 else {
		 struct ListNode* ptr1 = head, *ptr2 = head;
		 while (ptr2) {
			 ptr1 = ptr2;
			 while (ptr2 && ptr2->val == ptr1->val)
				 ptr2 = ptr2->next;
			 if (ptr1->next == ptr2)  // no duplicate
				 ptr1 = ptr2;
			 else if (ptr1 == head)
				 head = ptr2;
			 else {
				 struct ListNode* prev = head;
				 while (prev->next != ptr1)
					 prev = prev->next;
				 prev->next = ptr2;
				 ptr1 = ptr2;
			 }
		 }
		 
		 return head;
	 }
 }
