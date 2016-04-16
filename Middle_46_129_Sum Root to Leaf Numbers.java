public class Solution {
	private int currentTotal = 0;
    public int sumNumbers(TreeNode root) {
       dfs(root,0);
       return currentTotal;
    }
    private void dfs(TreeNode node, int currentSum) {
    	if(node == null)
    		return;
    	else if(isLeaf(node)) {
    		currentSum+=node.val;
    		currentTotal+=currentSum;
    	}
    	else {
    		currentSum+=node.val;
    		dfs(node.left,currentSum*10);
    		dfs(node.right,currentSum*10);
    	}
    }
    private boolean isLeaf(TreeNode node) {
    	return node.left==null && node.right==null;
    }
}
