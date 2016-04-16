public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
		traverse(root,result);
		return result;
    }
	public void traverse(TreeNode node,List<Integer> list) {
		if(node!=null) {
			
			traverse(node.left,list);
			list.add(node.val);
			traverse(node.right,list);
		}
		return;
	}
}
