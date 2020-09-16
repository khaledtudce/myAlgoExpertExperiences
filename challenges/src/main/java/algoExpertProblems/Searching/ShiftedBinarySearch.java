package algoExpertProblems.Searching;

public class ShiftedBinarySearch {

	// Time: O(logn) || Space: O(logn) because of callstack
	public int shiftedBinarySearch(int[] array, int target) {
		return recursiveShiftedBinarySearch(array, target, 0, array.length-1);
	}
	
	private int recursiveShiftedBinarySearch(int[] array, int target, int left, int right) {
		if(left>right)
			return -1;
		int middle = (left + right)/2;
		int leftNum = array[left];
		int rightNum = array[right];
		int potentialMatch = array[middle];
		if(target==potentialMatch)
			return middle;
		else {
			if(leftNum<=potentialMatch) {
				if(leftNum<=target && target<potentialMatch)
					return recursiveShiftedBinarySearch(array, target, left, middle-1);
				else 
					return recursiveShiftedBinarySearch(array, target, middle+1, right);
			}else {
				if(potentialMatch<target && target<=rightNum)
					return recursiveShiftedBinarySearch(array, target, middle+1, right);
				else 
					return recursiveShiftedBinarySearch(array, target, left, middle-1);
			}
		}
	}

	// Time: O(logn) || Space: O(1)
	public int shiftedBinarySearch1(int[] array, int target) {
	    int left = 0, right = array.length-1;
		while(left<=right) {
			int middle = (left+right)/2;
			int leftNum = array[left];
			int rightNum = array[right];
			if(target==array[middle]) 
				return middle;
			else if(leftNum<=array[middle]){
				if(target>=leftNum && target<array[middle])
					right = middle-1;
				else 
					left = middle+1;
			}else {
				if(target>array[middle] && target<=rightNum)
					left = middle+1;
				else 
					right = middle-1;
			}
		}
		
	    return -1;
	}
}
