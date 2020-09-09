package algoExpertProblems.DynamicProgramming;

import java.util.Arrays;

public class MinNumberOfCoinForChange {
	
	// Time: O(nd) || Space: O(n) where d is denoms size 
	public int minNumberOfCoinsForChange(int n, int[] denoms) {		
		if(n==0) return 0;
		Arrays.sort(denoms);
		int[] minCoins = new int[n+1];
		Arrays.fill(minCoins, Integer.MAX_VALUE);
		for (int i = 0; i < denoms.length; i++) {
			for (int j = 1; j < minCoins.length; j++) {
				if(j%denoms[i]==0)
					minCoins[j]=Math.min(minCoins[j], j/denoms[i]);
				else if(j>=denoms[i] && minCoins[j-denoms[i]]!=Integer.MAX_VALUE)
					minCoins[j]=Math.min(minCoins[j], 1+minCoins[j-denoms[i]]);
			}
		}
		
		return (minCoins[n]==Integer.MAX_VALUE) ? -1 : minCoins[n];
	}
	
	
	public int minNumberOfCoinsForChange1(int n, int[] denoms) {
		Arrays.sort(denoms);
		int minCoins=0;
		int singleCoins=0;
		
		for (int i = 0; i < denoms.length; i++) {
			if(n%denoms[i]==0)
				singleCoins = n/denoms[i];
		}
		
		int i=denoms.length-1;
		while(n>=0 && i>=0) {
			while(n>=denoms[i]) {
				n=n-denoms[i];
				minCoins++;
			}
			i--;
		}
		
		if(n==0)
			return minCoins;
		
		if(singleCoins !=0)
			return singleCoins;
		
		return -1;
	}
}
