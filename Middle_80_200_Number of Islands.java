public class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length==0 || grid[0].length==0) 
            return 0;
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j]=='1' && !visited[i][j]) { 
                    count++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, boolean[][] visited, int row, int col) {
        if (row<0 || row>=grid.length || col<0 || col>=grid[0].length || visited[row][col] || grid[row][col]=='0') // grid[i][j] is out of range
            return; 
        visited[row][col] = true;
        dfs(grid, visited, row-1, col);
        dfs(grid, visited, row+1, col);
        dfs(grid, visited, row, col-1);
        dfs(grid, visited, row, col+1);
    }
}
