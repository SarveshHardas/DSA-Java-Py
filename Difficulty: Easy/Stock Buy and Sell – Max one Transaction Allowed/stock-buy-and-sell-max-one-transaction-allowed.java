class Solution {
	public int maxProfit(int[] prices) {
		// Code here
		int i = 0;
		int j = i + 1;
		int profit = 0;
		while (j < prices.length) {
			if (prices[i] < prices[j]) {
				profit = Math.max(profit,prices[j] - prices[i]);
				j++;
			}
			else {
				i = j;
				j++;
			}
		}
		
		return profit;
	}
}
