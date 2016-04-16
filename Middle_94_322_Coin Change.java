public class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        for (int i = 1; i <= amount; i++) 
            dp[i] = Integer.MAX_VALUE-1;
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i + coins[j] <= amount)
                    dp[i + coins[j]] = Math.min(dp[i + coins[j]], dp[i] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE-1 ? -1 : dp[amount];
    }
}
