public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		Queue<Integer> levelqueue=new LinkedList<Integer>();

		queue.add(root);
		levelqueue.add(1);
		List<List<Integer>> result=new ArrayList();
		List<Integer> temp=new ArrayList<Integer>();
		if(root==null)
		    return result;
		while(!queue.isEmpty()) {
			TreeNode current=queue.remove();
			int curLevel=levelqueue.remove();
			if(curLevel==result.size())
				temp.add(current.val);
			else {
				result.add(temp);	
				temp=new ArrayList<Integer>();
				temp.add(current.val);	
			}
			if(current.left!=null) {
				queue.add(current.left);
				levelqueue.add(curLevel+1);
			}
			if(current.right!=null) {
				queue.add(current.right);
				levelqueue.add(curLevel+1);
			}
		}
		result.add(temp);
		result.remove(0);
		return result;        
    }
}
