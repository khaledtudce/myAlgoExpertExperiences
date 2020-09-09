package algoExpertProblems.DynamicProgramming;

public class MaxSubsetSumNoAdjacent {

	// Time: O(n) || Space: O(1)
	public int maxSubsetSumNoAdjacent(int[] array) {
		if(array.length==0)
			return 0;
		
	    int beforeLast=0, last=array[0], finalResult = array[0];
	    for (int i = 1; i < array.length; i++) {
	    	finalResult = Math.max(last, array[i]+beforeLast);
	    	beforeLast = last;
	    	last = finalResult;
		}
		
		return finalResult;
	}
	
	// Time: O(n) || Space: O(n)
	public int maxSubsetSumNoAdjacent1(int[] array) {
		if(array.length==0)
			return 0;
		
	    int[] adjSum = new int[array.length+1];
	    adjSum[0]=0; adjSum[1]=array[0];
	    
	    for (int i = 1; i < array.length; i++) {
			adjSum[i+1] = Math.max(adjSum[i], array[i]+adjSum[i-1]);
		}
		
		return adjSum[adjSum.length-1];
	}
}
