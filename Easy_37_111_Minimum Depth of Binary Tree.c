int minDepth(struct TreeNode* root) {
    if(!root)
    	return 0;
    else if(!root->right)
    	return 1+minDepth(root->left);
    else if(!root->left)
    	return 1+minDepth(root->right);
    else
    	return 1+min(minDepth(root->left),minDepth(root->right));
}
int min(int a,int b) {
	return a<b?a:b;
}
