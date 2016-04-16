struct TreeNode* buildTree(int* preorder, int preorderSize, int* inorder, int inorderSize) {
	if(preorderSize == 0 && inorderSize == 0)
		return NULL;
	else {
		int middle = preorder[0];
		int i;
		for (i = 0;inorder[i] != middle; i++);
		struct TreeNode* root = (struct TreeNode*)malloc(sizeof(struct TreeNode)); //generate root
		root->val = middle;
		root->left = buildTree(preorder+1, i, inorder, i);
		root->right = buildTree(preorder+i+1, preorderSize-i-1, inorder+i+1, inorderSize-i-1);
		return root;
	}    
}
