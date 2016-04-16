方法一略。
方法二：
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0,end = matrix.length - 1,mid;
		if(start == end) // the matrix has only 1 line
			return binarySeach(matrix[0],target);
		while(start <= end) {
			mid = (start + end) / 2;
			if(matrix[mid][0] == target) 
				return true;
			else if(matrix[mid][0] < target && (mid == matrix.length-1 || matrix[mid+1][0] > target)) // target may be at line of mid
				return binarySeach(matrix[mid],target);
			else if(matrix[mid+1][0] <= target)   //target lies after line of mid
				start = mid + 1;
			else
				end = mid-1;
        }
		return false;
    }
	private  boolean binarySeach(int[] nums, int target) {
		int start = 0, end = nums.length-1, mid;
		while(start <= end) {
			mid = (start + end) / 2;
			if(nums[mid] == target)
				return true;
			else if(nums[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return false;
	}
}
