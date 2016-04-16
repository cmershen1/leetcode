public class Solution {
    public void connect(TreeLinkNode root) {
        if(root!=null) 
        	dfs(root,root.left,root.right);
        
    }
	private void dfs(TreeLinkNode parent, TreeLinkNode leftchild, TreeLinkNode rightchild) { // asserted that parent isn't null
		TreeLinkNode p = parent;
		while (p.next!=null && (p==parent || (p.left==null&&p.right==null)))
			p=p.next;
		if(leftchild!=null) {
			if(rightchild!=null)
				leftchild.next = rightchild;
			else {
			    if(p!=parent)
				    leftchild.next = p.left!=null?p.left:p.right;
			}
			
		}
		if(rightchild!=null) {
		    if(p!=parent)
		    	rightchild.next = p.left!=null?p.left:p.right;
			
		}
		if(rightchild!=null)
			dfs(rightchild, rightchild.left, rightchild.right);
		if(leftchild!=null)
			dfs(leftchild, leftchild.left, leftchild.right);
		
	}		
}
