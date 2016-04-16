public class Solution {
	private  final int RIGHT = 1;
	private  final int DOWN = 2;
	private  final int LEFT = 3;
	private  final int UP = 4;
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int row = matrix.length;
        if(row==0)
        	return list;
        int col = matrix[0].length;
        boolean[][] visited = new boolean[row][col];
        int count = 0,direction = RIGHT,i=0,j=0;
        while (count < row * col) {
        	list.add(matrix[i][j]);
        	visited[i][j] = true;
        	switch (direction) {
				case RIGHT:
					if (j==col-1 || visited[i][j+1]) {
						direction=DOWN;
						i++;
					}
					else 
						j++;
					break;
				case DOWN:
					if (i==row-1 || visited[i+1][j]) {
						direction = LEFT;
						j--;
					}
					else
						i++;
					break;
				case LEFT:
					if (j==0 || visited[i][j-1]) {
						direction = UP;
						i--;
					}
					else
						j--;
					break;
				case UP:
					if (visited[i-1][j]) {
						direction = RIGHT;
						j++;
					}
					else
						i--;
					break;
				default:
					break;
			}
        	count++;
        }
        return list;
    }
}
