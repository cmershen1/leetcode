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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		Queue<Integer> levelqueue=new LinkedList<Integer>();

		queue.add(root);
		levelqueue.add(1);
		boolean isReverse = true;
		List<List<Integer>> result=new ArrayList();
		List<Integer> temp=new ArrayList<Integer>();
//		temp.add(root.val);
//		result.add(temp);
		if(root==null)
		    return result;
		while(!queue.isEmpty())
		{
			TreeNode current=queue.remove();
			int curLevel=levelqueue.remove();
			//System.out.println(current.val+" level="+curLevel);
			
			if(curLevel==result.size())
			{
				temp.add(current.val);
			}
			else
			{
				if(isReverse)
					Collections.reverse(temp);
				result.add(temp);				
				isReverse = !isReverse;
				temp=new ArrayList<Integer>();
				temp.add(current.val);	
			}
			if(current.left!=null)
			{
				queue.add(current.left);
				levelqueue.add(curLevel+1);
			}
			if(current.right!=null)
			{
				queue.add(current.right);
				levelqueue.add(curLevel+1);
			}
		}
		if(isReverse)
			Collections.reverse(temp);
		result.add(temp);
		result.remove(0);
	//	Collections.reverse(result);
		return result;        
    }
}
