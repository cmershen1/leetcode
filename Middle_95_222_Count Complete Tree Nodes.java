public class Solution {
    public int countNodes(TreeNode root) {
    	if(root == null)
    		return 0;
    	else {
    		int leftHeight = 0,rightHeight = 0;
    		TreeNode left = root,right = root;
    		while(left!=null) {
    			left=left.left;
    			leftHeight++;
    		}
    		while (right!=null) {
				right = right.right;
				rightHeight++;
			}
    		if(leftHeight == rightHeight) // full binary tree
    			//return (int) (Math.pow(2, leftHeight)-1);
    			 return (2<<(leftHeight-1)) - 1;
    		else
    			return 1+countNodes(root.left)+countNodes(root.right);
    	}
    }
}
