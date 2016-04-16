struct ListNode* reverseList(struct ListNode* head) {
    if(!head || !head->next)
        return head;
    else {
        struct ListNode *temp=head->next;
        struct ListNode *newHead=reverseList(head->next);
        temp->next=head;
        head->next=NULL;
        return newHead;
    }
}
