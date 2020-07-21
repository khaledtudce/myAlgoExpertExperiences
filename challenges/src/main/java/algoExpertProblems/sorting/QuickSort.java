package algoExpertProblems.sorting;

public class QuickSort {
	
	// Best O(nlogn) time | O(logn) space because of recursive call stack
	// Average O(nlogn) time | O(logn) space
	// Worst O(n^2) time | O(logn) space
	public int[] quickSort(int[] array) {
		recursiveQuickSort(array, 0, array.length-1);
		return array;
	}

	private void recursiveQuickSort(int[] array, int startIndex, int endIndex) {
		if(startIndex>=endIndex)
			return;
		int pivot = startIndex;
		int left = startIndex+1;
		int right = endIndex;
		while(left<=right) {
			if(array[left]>array[pivot] && array[right]<array[pivot])
				swap(left, right, array);
			if(array[left]<=array[pivot])
				left++;
			if(array[right]>=array[pivot])
				right--;
		}
		swap(pivot, right, array);
		recursiveQuickSort(array, startIndex, right-1);
		recursiveQuickSort(array, right+1, endIndex);
	}
	
	private void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j]= array[i];
		array[i] = temp;
	}
}
