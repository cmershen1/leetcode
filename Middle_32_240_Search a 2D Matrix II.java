public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
			return false;
		int rows=matrix.length,cols=matrix[0].length;
		int i=0,j=cols-1;
		while(j>=0 && i<=rows-1) {
			if(matrix[i][j] == target)
				return true;
			else if(matrix[i][j] < target)
				i++;
			else
				j--;
		}
		return false;
    }
}
