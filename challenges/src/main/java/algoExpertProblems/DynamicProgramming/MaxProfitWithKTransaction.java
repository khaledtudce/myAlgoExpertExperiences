package algoExpertProblems.DynamicProgramming;

public class MaxProfitWithKTransaction {
	
	 // O(nk) time | O(nk) space
	 public int maxProfitWithKTransactions2(int[] prices, int k) {
		 if (prices.length == 0) 
			 return 0;
		 
		 int[][] profits = new int[k + 1][prices.length];
		 for (int sellNo = 1; sellNo < k + 1; sellNo++) {
			 int maxThusFar = Integer.MIN_VALUE;
			 for (int day = 1; day < prices.length; day++) {
				 maxThusFar = Math.max(maxThusFar, profits[sellNo - 1][day - 1] - prices[day-1]);
				 profits[sellNo][day] = Math.max(profits[sellNo][day - 1], maxThusFar + prices[day]);
			 }
		 }
		 return profits[k][prices.length - 1];
	 }
	

	// O(nk) time | O(n) space
	public int maxProfitWithKTransactions1(int[] prices, int k) {
		 if (prices.length == 0) 
			 return 0;
		 
		 int[] evenProfits = new int[prices.length];
		 int[] oddProfits = new int[prices.length];
		 int[] currentProfits;
		 int[] previousProfits;
		 for (int t = 1; t < k + 1; t++) {
			 int maxThusFar = Integer.MIN_VALUE;
			 if (t % 2 == 1) {
				 currentProfits = oddProfits;
				 previousProfits = evenProfits;
			 } else {
				 currentProfits = evenProfits;
				 previousProfits = oddProfits;
			 }
			 for (int d = 1; d < prices.length; d++) {
				 maxThusFar = Math.max(maxThusFar, previousProfits[d - 1] - prices[d-1]);
				 currentProfits[d] = Math.max(currentProfits[d - 1], maxThusFar + prices[d]); 
			 }
		 } 
		 return k%2 == 0 ? evenProfits[prices.length-1]: oddProfits[prices.length-1];
	}

	// O(nk) time | O(nk) space
	public int maxProfitWithKTransaction(int[] prices, int k) {
		 if (prices.length == 0) 
			 return 0;
	 	 
		 int[][] profits = new int[k][prices.length];
		 for (int sellCount = 0; sellCount < k; sellCount++) {
			 for (int d = 0; d < prices.length; d++) {
				 profits[sellCount][d] = findMaxProfitFrom(prices, d, sellCount, profits);
			 }
		 }
		 
		 return profits[k-1][prices.length - 1];
	}

	private int findMaxProfitFrom(int[] prices, int day, int sellCount, int[][] profits) {
		int max = 0;
		if(sellCount>=1)
		{
			for (int i = 0; i < day; i++) {
				int profit = prices[day] + (profits[sellCount-1][i] - prices[i]);
				if(max<profit)
					max = profit;
			}
		}else
			for (int i = 0; i < day; i++) {
				int profit = prices[day] - prices[i];
				if(max<profit)
					max = profit;
			}
	
		for (int i = 0; i < day; i++) {
			if(profits[sellCount][day-i]>max)
				max = profits[sellCount][day-i];
		}
		return max;
	}
}

