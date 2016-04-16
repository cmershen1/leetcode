public class Solution {
    int max = 1;
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix==null || matrix.length==0 || matrix[0].length==0) 
            return 0; 
        int[][] lenBoard = new int[matrix.length][matrix[0].length];
        int[][] dir = new int[][] { {0,0,1,-1}, {-1,1,0,0} };
        for (int i=0; i<matrix.length; ++i) {
            for (int j=0; j<matrix[0].length; ++j) {
                if (lenBoard[i][j] == 0) {
                    dfs(matrix, lenBoard, dir, i, j, Integer.MIN_VALUE);
                }
            }
        }
        return max;
    }

    private int dfs(int[][] mat, int[][] lenBoard, int[][] dir, int row, int col, int prev) {
        if (row<0 || row>=mat.length || col<0 || col>=mat[0].length || prev>=mat[row][col]) { 
            return 0;  // out of board or path stops incresing
        }
        if (lenBoard[row][col] > 0) { return lenBoard[row][col]; }  // current position already computed
        int neighborMax = 0;
        for (int i=0; i<4; ++i) {  // retrieve the length of lip from its 4 neighbors
            neighborMax = Math.max(neighborMax, dfs(mat, lenBoard, dir, row+dir[0][i], col+dir[1][i], mat[row][col]));
        }
        int localMax = 1 + neighborMax;
        lenBoard[row][col] = localMax;
        max = Math.max(max, localMax);
        return localMax;
    }
}
