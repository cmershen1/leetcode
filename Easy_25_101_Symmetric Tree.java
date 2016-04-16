public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root== null) 
            return true;
        return isSymmetric(root.left, root.right);        
    }

    public boolean isSymmetric(TreeNode tree1, TreeNode tree2){
        if(tree1==null && tree2==null)
            return true;
        else if(tree1 == null || tree2 == null || tree1.val != tree2.val)
            return false;
        else
            return isSymmetric(tree1.left, tree2.right) && isSymmetric(tree1.right, tree2.left);
    }
}
