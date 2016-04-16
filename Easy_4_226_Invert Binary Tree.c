struct TreeNode* invertTree(struct TreeNode* root) {
    if(!root)
        return NULL;
    struct TreeNode* temp = root->left;
    root->left = invertTree(root->right);
    root->right = invertTree(temp);
    return root;
}
