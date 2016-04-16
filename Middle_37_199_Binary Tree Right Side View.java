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
    public List<Integer> rightSideView(TreeNode root) {
       
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
		Queue<Integer> levelqueue=new LinkedList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		 if(root == null)
            return list;
		queue.add(root);
		levelqueue.add(1);
		//list.add(root.val);
		
		while(!queue.isEmpty()) {
			TreeNode current = queue.remove();
			int curLevel=levelqueue.remove();
			
			if(current.left!=null) {
				queue.add(current.left);
				levelqueue.add(curLevel+1);
			}
			if(current.right!=null) {
				queue.add(current.right);
				levelqueue.add(curLevel+1);
			}
			if(levelqueue.isEmpty() == true || levelqueue.peek() == curLevel + 1)
				list.add(current.val);
		}
		return list;
    }
}
