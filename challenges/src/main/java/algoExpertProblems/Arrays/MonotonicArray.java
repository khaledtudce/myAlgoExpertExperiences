package algoExpertProblems.Arrays;

public class MonotonicArray {
	
	// Time: O(n) || Space: O(1)
	public boolean isMonotonic(int[] array) {			
		boolean isIncreasing = true;
		boolean isDecreasing = true;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1])
				isIncreasing = false;
			if(array[i]<array[i+1])
				isDecreasing = false;
		}
		
		return isIncreasing || isDecreasing;
	}
	
	// Time: O(n) || Space: O(1)
	public boolean isMonotonic2(int[] array) {			
		boolean trendingDecided = false;
		boolean isIncreasing = true;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]==array[i+1])
				continue;
			if(!trendingDecided && array[i]>array[i+1]) 
				isIncreasing = false;
			trendingDecided = true;
			
			if(!isIncreasing && array[i]<array[i+1])
				return false;
			else if(isIncreasing && array[i]>array[i+1])
				return false;
		}
		
		return true;
	}
	
	// Time: O(n) || Space: O(1)
	public boolean isMonotonic1(int[] array) {			
		int numInc = 0;
		int numDec = 0;
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]<array[i+1]) 
				numInc++;
			else
				numDec++;
		}
		boolean increasing = numInc>numDec ? true : false;
		for (int i = 0; i < array.length-1; i++) {
			if(!increasing && array[i]<array[i+1])
				return false;
			else if(increasing && array[i]>array[i+1])
				return false;
		}
		
		return true;
	}
}
