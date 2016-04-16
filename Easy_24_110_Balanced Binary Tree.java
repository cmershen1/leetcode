public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        else if(Math.abs(getHeight(root.left)-getHeight(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		else
			return false;
    }
	private int getHeight(TreeNode root)
	{
		if(root==null)
			return 0;
		else
			return Math.max(getHeight(root.left),getHeight(root.right))+1;
	}
}
