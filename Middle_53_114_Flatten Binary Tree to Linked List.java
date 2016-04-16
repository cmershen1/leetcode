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
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        flatten(root.left);
        flatten(root.right);

        TreeNode ptr = root.left;
        if(ptr!=null){
            while(ptr.right!=null){
                ptr = ptr.right;
            }
            ptr.right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }
}
