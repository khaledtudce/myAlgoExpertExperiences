package algoExpertProblems.Arrays;

public class LongestPeak {

	// Time: O(n) || Space: O(1)
	public int longestPeak(int[] array) {
		int longestPeak = 0;
		for (int peak = 1; peak < array.length-1; peak++) {
			int L=peak-1, R=peak+1;
			if((array[L]<array[L+1]) && (array[R-1]>array[R])) {
				while(L>0 && array[L-1]<array[L]) L--;
				while(R<array.length-1 && array[R]>array[R+1]) R++;
				if(longestPeak<(R-L)+1)
					longestPeak = (R-L)+1;
			}
		}
		
		return longestPeak;
	}
	
	// Time: O(n) || Space: O(1)
	public int longestPeak1(int[] array) {
		int longestPeak = 0;
		for (int peak = 1; peak < array.length-1; peak++) {
			int L=peak-1, R=peak+1;
			if((array[L]<array[L+1]) && (array[R-1]>array[R])) {
				boolean isLeftSmaller = true, isRightSmaller=true;
				while(isLeftSmaller || isRightSmaller) {
					if(longestPeak<(R-L)+1)
						longestPeak = (R-L)+1;
					
					if(L>0 && array[L-1]<array[L]) { 
						isLeftSmaller = true;
						L--;
					}else
						isLeftSmaller = false;
					
					if(R<array.length-1 && array[R]>array[R+1]) {
						isRightSmaller = true;
						R++;
					}else
						isRightSmaller = false;
				}
			}
		}
		
		return longestPeak;
	}
}
