public class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int l=prices.length-1;
        for(int i=0;i<l;i++) {
        	if(prices[i+1]>=prices[i])	
        		profit+=prices[i+1]-prices[i];
        }
        return profit; 
    }
}
