package algoExpertProblems.Arrays;

public class SubarraySort {

	// Time: O(n) || Space: O(1)
	public int[] subarraySort(int[] array) {
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(theCondition(i, array)) {
				max=Math.max(max, array[i]);
				min=Math.min(min, array[i]); 
			}
		}
		if(min==Integer.MAX_VALUE)
			return new int[] {-1, -1};
		
		int leftP=0, rightP=array.length-1;
		while(leftP<array.length-1 && array[leftP]<=min) leftP++;
		while(rightP>0 && array[rightP]>=max) rightP--;
		
		return new int[] {leftP, rightP};
	}

	private boolean theCondition(int i, int[] array) {
		if(i==0)
			return array[i]>array[i+1];
		else if(i==array.length-1)
			return array[i-1]>array[i];
		else
			return array[i-1]>array[i] || array[i]>array[i+1];
	}
	
	// Time: O(n) || Space: O(1)
	public int[] subarraySort1(int[] array) {
		int defaultLeftP = -2;
		int leftP=defaultLeftP, rightP=-1, highestValue = array[0];
		for (int i = 1; i < array.length; i++) {
			int currentValue = array[i];
			if(currentValue<highestValue && currentValue<array[leftP>0 ? leftP:i-1]) {
				if(leftP==defaultLeftP || currentValue<array[leftP+1]) {
					int tempLeftP=i-1;
		 			while(tempLeftP>=0 && array[tempLeftP]>currentValue) tempLeftP--;
					if(leftP==defaultLeftP || tempLeftP<leftP) 
						leftP=tempLeftP;
				}
			}
			if(leftP!=defaultLeftP && (currentValue<highestValue || 
					(i!=array.length-1 && currentValue>array[i+1])))
				rightP=i;
			
			highestValue = Math.max(highestValue, currentValue);
		}
		
		return new int[] {++leftP, rightP};
	}
}
