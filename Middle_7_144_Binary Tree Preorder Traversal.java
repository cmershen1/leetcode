public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
		traverse(root,result);
		return result;
    }
	public void traverse(TreeNode node,List<Integer> list) {
		if(node!=null) {
			list.add(node.val);
			traverse(node.left,list);
			traverse(node.right,list);
		}
		return;
	}

}
