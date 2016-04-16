public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int min = prices[0];
        int profit = 0;
        for(int price:prices) {
            if(price < min)
                min = price;
            if(price - min > profit)
                profit = price - min;
        }
        return profit;
    }
}
