struct ListNode* reverseBetween(struct ListNode* head, int m, int n) {
	 if (m == n || !head || !head->next)
		 return head;
	 int i = 1;
	 struct ListNode* mPtr = head, *nPtr = head;
	 for (struct ListNode* node = head; node; node = node->next, i++) {
		 if (i == m)
			 mPtr = node;
		 if (i == n)
			 nPtr = node;
	 }
	 if (mPtr == head) {
		 while (mPtr != nPtr) {
			 struct ListNode* temp = mPtr;
			 mPtr = mPtr->next;
			 temp->next = nPtr->next;
			 nPtr->next = temp;
		 }
		 return nPtr;
	 }
	 else {
		 struct ListNode* mPtrPrev = head;
		 while (mPtrPrev->next != mPtr)
			 mPtrPrev = mPtrPrev->next;
		 mPtrPrev->next = nPtr;
		 while (mPtr != nPtr) {
			 struct ListNode* temp = mPtr;
			 mPtr = mPtr->next;
			 temp->next = nPtr->next;
			 nPtr->next = temp;
		 }
		 return head;
	 }
 }
