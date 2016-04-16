public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
    	TreeNode bst=createBST(nums,0,nums.length-1);
        return bst;
    }
    public TreeNode createBST(int[] nums,int start,int end) {
    	int mid = (start + end) / 2;
    	TreeNode root = new TreeNode(nums[mid]);
    	if(start < mid ) 
    		root.left = createBST(nums,start,mid-1);
    	if(mid  < end) 
    		root.right = createBST(nums,mid+1,end); 
    	return root;
    }
}
