public class Solution {
    public void connect(TreeLinkNode root) {
    	if(root==null)
    		return;
        else if(root.left == null && root.right == null && root.next == null) { // root is a leaf node
        	root.next=null;
        	return;
        } 
        else {
        	if(root.left != null)
        		root.left.next = root.right;
        	if(root.right != null && root.next != null)
        		root.right.next = root.next.left;
        	if(root.right != null && root.next == null)
        		root.right.next = null;        	
        	connect(root.left);
        	connect(root.right);
        }
    }
}
