public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<Integer>();
		traverse(root,list);
		return list.get(k-1);
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
