public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    	int size = triangle.size();
    	if(size == 1)
    	    return triangle.get(0).get(0);
        int[][] dp = new int[size][size];
        dp[0][0] = triangle.get(0).get(0);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < size; i++) {
        	for(int j = 0 ; j <= i ; j++) {
        		if(j == 0)
        			dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
        		else if(j == i)
        			dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
        		else
        			dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i-1][j], dp[i-1][j-1]);
        		if(i == size-1)
        			min = Math.min(min, dp[i][j]);
        	}
        }
        return min;
    }
}
