public class Solution {
	private final int DEAD = 0;
	private final int ALIVE = 1;
    public void gameOfLife(int[][] board) {
		int m=board.length;
		int n=board[0].length;
		int[][] nextState = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				//Rule 1:Any live cell with fewer than two live neighbors dies, as if caused by under-population.
				if(board[i][j] == ALIVE && getNeighbours(board,i,j) <= 1)  
					nextState[i][j] = DEAD;
				//Rule 3:Any live cell with more than three live neighbors dies, as if by over-population.
				else if(board[i][j] == ALIVE && getNeighbours(board,i,j) > 3)  
					nextState[i][j] = DEAD;
				//Rule 4:Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
				else if(board[i][j] == DEAD && getNeighbours(board,i,j) == 3)
					nextState[i][j] = ALIVE;
				else
					nextState[i][j]=board[i][j];
				//System.out.println("i="+i+",j="+j+",neighbours="+getNeighbours(board,i,j,m,n)+",this state="+board[i][j]+",nextState="+nextState[i][j]);
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=nextState[i][j];
			}
		}
    }
	private int getNeighbours(int[][] board,int i,int j) {
		return getState(board,i-1,j-1) + getState(board,i-1,j) + getState(board,i-1,j+1) + getState(board,i,j-1) + getState(board,i,j+1) + getState(board,i+1,j-1) + getState(board,i+1,j) + getState(board,i+1,j+1);
	}
	private int getState(int[][] board, int i, int j) {
		int m = board.length;
		int n = board[0].length;
		if(i<0 || j<0 || i==m || j==n)
			return 0;
		else 
			return board[i][j];
	}
}
