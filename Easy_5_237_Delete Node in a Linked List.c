void deleteNode(struct ListNode* node) {
    if(node) {
        node->val=node->next->val;
        node->next=node->next->next;
    }
}
