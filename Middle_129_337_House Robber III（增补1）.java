public class Solution {
    public int rob(TreeNode root) {
        int[] profit = dfs(root);
        return Math.max(profit[0], profit[1]);
    }
    private int[] dfs(TreeNode root) {
        int[] profit = new int[2];
        // profit[0] stands for the maximum profit with robbing root, while profit[1] stands for the maximum profit without robbing root.
        if(root!=null) {
            int[] leftProfit = dfs(root.left);
            int[] rightProfit = dfs(root.right);
            profit[0] = leftProfit[1] + rightProfit[1] + root.val;
            profit[1] = Math.max(leftProfit[0],leftProfit[1]) + Math.max(rightProfit[0], rightProfit[1]);
            return profit;
        }
        return new int[2];
    }
}
