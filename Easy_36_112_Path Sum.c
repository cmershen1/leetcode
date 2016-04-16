bool hasPathSum(struct TreeNode* root, int sum) {
    if(!root)
        return 0;
    else if (!root->left && !root->right)
        return root->val==sum;
    else
        return hasPathSum(root->left,sum-root->val) || hasPathSum(root->right,sum-root->val);
}
