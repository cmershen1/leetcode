public class Solution {
	private  final int RIGHT = 1;
	private  final int DOWN = 2;
	private  final int LEFT = 3;
	private  final int UP = 4;
    public  int[][] generateMatrix(int n) {
    	int direction = 1;//1,2,3,4 stand for RIGHT,DOWN,LEFT,UP respectively.
    	int row=0,col=0;//current position
    	int[][] matrix = new int[n][n];
    	for(int i=1;i<=n*n;i++) {
    		matrix[row][col] = i;
    		switch (direction) {
    			case RIGHT: {    				
    				if(col+1 == n || matrix[row][col+1] != 0) {
    					direction=DOWN;
    					row++;
    				}
    				else
    					col++;
    				break;
    			}
    			case DOWN: {
    				if(row+1 == n || matrix[row+1][col] != 0) {
    					direction=LEFT;
    					col--;    					
    				}
    				else
    					row++;
    				break;
    			}
    			case LEFT: {
    				if(col == 0 || matrix[row][col-1] != 0) {
    					direction=UP;
    					row--;
    				}
    				else
    					col--;
    				break;
    			}
    			case UP: {
    				if(matrix[row-1][col] != 0) {
    					direction=RIGHT;
    					col++;
    				}
    				else
    					row--;
    			}
    		}
    	}
    	return matrix;
    }
}
