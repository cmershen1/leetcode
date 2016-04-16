public class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        if(row == 0)
        	return 0;
        int col = matrix[0].length;
        int maxSquare = 0;
        int[][] dp = new int[row][col];
        for(int i = 0 ;i<col;i++) {
        	dp[0][i]=matrix[0][i]-'0';
        	if(matrix[0][i] == '1')
        	    maxSquare = 1;
        }
        for(int i = 0;i<row;i++) {
        	dp[i][0]=matrix[i][0]-'0';
        	if(matrix[i][0] == '1')
        	    maxSquare = 1;
        }
        for(int i = 1;i<row;i++) {
        	for(int j=1;j<col;j++) {
        		if(matrix[i][j] == '1') 
        			dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]))+1;
        		if(dp[i][j] > maxSquare)
        		    maxSquare = dp[i][j];
        	}
        }
        return maxSquare*maxSquare;
    }
}
