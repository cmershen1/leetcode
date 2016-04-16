int minPathSum(int** grid, int gridRowSize, int gridColSize) {
    int dp[gridRowSize][gridColSize];
    dp[0][0] = grid[0][0];
    for(int i = 1;i<gridColSize;i++)
        dp[0][i] = dp[0][i-1]+grid[0][i];
    for(int i = 1;i<gridRowSize;i++)
        dp[i][0] = dp[i-1][0]+grid[i][0];
    for(int i = 1;i<gridRowSize;i++)
        for(int j = 1;j<gridColSize;j++)
            dp[i][j] = min(dp[i-1][j],dp[i][j-1])+grid[i][j];
    return dp[gridRowSize-1][gridColSize-1];
}
int min(int a,int b) {
    return a<b?a:b;
}
