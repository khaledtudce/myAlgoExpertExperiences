package algoExpertProblems.sorting;

public class InsertionSort {
	
	// Best O(n) time | O(1) space
	// Average O(n^2) time | O(1) space
	// Worst O(n^2) time | O(1) space
	public int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1])
			{
				int j = i+1;
				while(j!=0 && array[j]<array[j-1]) {
					swap(j, j-1, array);
					j--;
				}
			}
		}
	    
		return array;
	 }
	
	private void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j]= array[i];
		array[i] = temp;
	}
}
