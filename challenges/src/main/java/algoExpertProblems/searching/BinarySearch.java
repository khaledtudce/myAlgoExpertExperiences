package algoExpertProblems.searching;

public class BinarySearch {
	
	// Time: O(logn) || O(1)
	public int binarySearch(int[] array, int target) {
		return getIndex(array, 0, array.length-1, target);
	}
	
	private int getIndex(int[] array, int left, int right, int target) {
		if(left>right)
			return -1;
		int middle = (left+right)/2;
		if(array[middle]==target)
			return middle;
		
		if(target>array[middle])
			return getIndex(array, middle+1, right, target);
		else
			return getIndex(array, left, middle-1, target);
	}
	
	// Time: O(logn) || O(1)
	public int binarySearch2(int[] array, int target) {
	    int i=0;
	    int j=array.length-1;
		while(i<=j) {
			int m=(i+j)/2;
			if(array[m]==target)
				return m;
			
			if(target>array[m])
				i=m+1;
			else
				j=m-1;
		}
		
	    return -1;
	}
	
	// Time: O(n) || O(1)
	public int binarySearch1(int[] array, int target) {
	    for (int i = 0; i < array.length; i++) {
			if(array[i]==target)
				return i;
		}
		
	    return -1;
	}
}
