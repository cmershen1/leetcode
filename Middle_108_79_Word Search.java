public class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        if(row==0)
        	return false;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i = 0;i<row;i++) {
        	for(int j=0;j<col;j++) {      		
				if(word.charAt(0) == board[i][j]) {
					if(dfs(board, i, j, visited, word, 0))
						return true;  
				}
        	}
        }
        return false;
    }
    
    private boolean dfs(char[][] board, int i, int j, boolean[][] visited, String word, int index) {
		if(index == word.length())
			return true;
		else if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1 || word.charAt(index)!=board[i][j] || visited[i][j])
			return false;
		else {
			visited[i][j]=true;
			boolean result = dfs(board, i-1, j, visited, word, index+1) || dfs(board, i+1, j, visited, word, index+1) || dfs(board, i, j-1, visited, word, index+1) || dfs(board, i, j+1, visited, word, index+1);
			visited[i][j] = false;
			return result;
		}
		
	}
}
