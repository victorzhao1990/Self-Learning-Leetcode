// http://fisherlei.blogspot.com/2013/01/leetcode-best-time-to-buy-and-sell.html
public class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minVal) {
                minVal = prices[i];
            }
            int diff = prices[i] - minVal;
            if (diff > maxProfit) {
                maxProfit = diff;
            }
        }
        return maxProfit;
    }
}
