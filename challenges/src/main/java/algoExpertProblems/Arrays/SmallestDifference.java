package algoExpertProblems.Arrays;

import java.util.Arrays;

public class SmallestDifference {
    
	// Time: O(nlogn + mlogm) || Space: O(1)	
	public int[] smallestDifference1(int[] arrayOne, int[] arrayTwo) {
	 	Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int lowestDiff = Math.abs(arrayOne[0] - arrayTwo[0]);
		int[] shortestDiffs = new int[2];
		int j=0;
		for(int i=0; i<arrayOne.length;i++) {
			int diff = Math.abs(arrayOne[i] - arrayTwo[j]);
			if(diff<=lowestDiff) {
				lowestDiff = diff;
				shortestDiffs[0]= arrayOne[i];
				shortestDiffs[1]= arrayTwo[j];
			}
			
			if(arrayOne[i]>arrayTwo[j] && j<arrayTwo.length-1) {
				i--;
				j++;
			}
		}
		
	    return shortestDiffs;
	}
	
	// Time: O(nlogn + mlogm) || Space: O(1)	
	public int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int idxOne = 0;
		int idxTwo = 0;
		int smallest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		int[] smallestPair = new int[2];
		
		while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
			int firstNum = arrayOne[idxOne];
			int secondNum = arrayTwo[idxTwo];
			if (firstNum < secondNum) {
				current = secondNum - firstNum;
				idxOne++;
			} else if (secondNum < firstNum) {
				current = firstNum - secondNum;
				idxTwo++;
			} else {// when it is same
				return new int[] {firstNum, secondNum};
			}
			
			if (smallest > current) {
				smallest = current;
				smallestPair = new int[] {firstNum, secondNum};
			}
		}
		
		return smallestPair;
	}
}
