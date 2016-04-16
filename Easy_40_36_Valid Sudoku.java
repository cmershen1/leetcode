public class Solution {
    public boolean isValidSudoku(char[][] board) {
    	HashSet<Character> set=new HashSet<Character>();
        for(int i=0;i<9;i++) {
        	for(int j=0;j<9;j++) {
        		if(board[i][j]>='0' && board[i][j]<='9') {
        			if(!set.add(board[i][j]))
        				return false;
        		}
        	}
        	set.clear();
        }
        for(int j=0;j<9;j++) {
        	for(int i=0;i<9;i++) {
        		if(board[i][j]>='0' && board[i][j]<='9') {
        			if(!set.add(board[i][j]))
        				return false;
        		}
        	}
        	set.clear();
        }
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		for(int s=0;s<3;s++) {
        			for(int t=0;t<3;t++) {
        				if(board[i*3+s][j*3+t]>='0' && board[i*3+s][j*3+t]<='9') {
        					if(!set.add(board[i*3+s][j*3+t]))
        						return false;
        				}
        			}
        		}
        		set.clear();
        	}
        }
        return true;
    }
}
