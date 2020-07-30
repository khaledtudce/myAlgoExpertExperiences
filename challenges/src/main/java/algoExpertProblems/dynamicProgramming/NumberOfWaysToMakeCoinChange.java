package algoExpertProblems.dynamicProgramming;

public class NumberOfWaysToMakeCoinChange {
	
	// Time: O(nd) || Space: O(n) where d is denoms size 
	public int numberOfWaysToMakeChange(int n, int[] denoms) {
		int[] ways = new int[n+1];
		ways[0]=1;
		for (int i = 0; i < denoms.length; i++) {
			for (int j = 0; j < ways.length; j++) {
				if(j>=denoms[i])
					ways[j]=ways[j]+ways[j-denoms[i]];
			}
		}
		
		return ways[n];
	}
	
}
