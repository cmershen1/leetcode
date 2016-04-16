/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
		traverse(root,result);
		return result;
    }
	public void traverse(TreeNode node,List<Integer> list) {
		if(node!=null) {
			
			traverse(node.left,list);
			traverse(node.right,list);
			list.add(node.val);
		}
		return;
	}
}
