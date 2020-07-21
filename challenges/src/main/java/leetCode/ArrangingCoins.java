package leetCode;

public class ArrangingCoins {

	public int arrangeCoins(int n) { // Time: logn
		int i;
		for (i = 1; i <= n; i++) {
			n = cutStairAndReduceLimit(n, i); 
		}
		
		return i-1;
	}

	private int cutStairAndReduceLimit(int n, int i) {
		return n-i;
	}
	
	public int arrangeCoins1(int n) { // Time: n
		int stairsNumber = 0; 
		long totalUsedNumber = 0;
		for(int i=1; i<=n; i++) {
			totalUsedNumber+=i;
			if(totalUsedNumber <= n)
				stairsNumber++;
			else 
				break;
		}
		
		return stairsNumber;
	}
}
