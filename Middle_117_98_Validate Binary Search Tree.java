public class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inOrderVisit(list,root);
        return isSortedList(list);
    }
    private void inOrderVisit(List<Integer> list, TreeNode node) {
		if(node!=null) {
			inOrderVisit(list, node.left);
			list.add(node.val);
			inOrderVisit(list, node.right);
		}
	}
    private boolean isSortedList(List<Integer> list) {
		if(list.size()<2)
			return true;
		else {
			for(int i = 0;i<list.size()-1;i++) {
				if(list.get(i)>=list.get(i+1))
					return false;
			}
			return true;
		}
	}
}
