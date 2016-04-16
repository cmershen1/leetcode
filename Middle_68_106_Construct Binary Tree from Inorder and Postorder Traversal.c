struct TreeNode* buildTree(int* inorder, int inorderSize, int* postorder, int postorderSize) {
	if(inorderSize == 0 && postorderSize == 0)
		return NULL;
	else {
		int middle = postorder[postorderSize-1];
		int i;
		for (i = 0;inorder[i] != middle; i++);
		struct TreeNode* root = (struct TreeNode*)malloc(sizeof(struct TreeNode)); //generate root
		root->val = middle;
		root->left = buildTree(inorder, i, postorder, i);
		root->right = buildTree(&inorder[i+1], inorderSize-i-1, &postorder[i], inorderSize-i-1);
		return root;
	}
}
