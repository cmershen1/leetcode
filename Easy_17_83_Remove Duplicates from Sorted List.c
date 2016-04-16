struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode* p = head;
    if(!head)
        return;
    while(p->next) {
        if(p->val == p->next->val)
            p->next=p->next->next;
        else
            p=p->next;
    }
    return head;
}
