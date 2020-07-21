package algoExpertProblems.sorting;

public class SelectionSort {
	
	// Best O(n^2) time | O(1) space
	// Average O(n^2) time | O(1) space
	// Worst O(n^2) time | O(1) space
	public int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int smallestIndex = i;
			for (int j = i+1; j < array.length; j++) {
				if(array[smallestIndex]>array[j]){
					smallestIndex = j;
				}
			}
			swap(i, smallestIndex, array);
		}
		return array;
	}
	
	private void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j]= array[i];
		array[i] = temp;
	}
}
