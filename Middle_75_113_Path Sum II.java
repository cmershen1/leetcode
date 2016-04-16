public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root!=null)
            backtrack(list, new ArrayList<Integer>(), root, sum);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> sublist, TreeNode root, int sum) {

			sublist.add(root.val);	
			if(sum-root.val == 0 && root.left == null && root.right == null)
				list.add(new ArrayList<Integer>(sublist));
			if(root.left!=null)
			    backtrack(list, sublist, root.left, sum-root.val);
			if(root.right!=null)
			    backtrack(list, sublist, root.right, sum-root.val);
			sublist.remove(sublist.size()-1);
			
	}
}
