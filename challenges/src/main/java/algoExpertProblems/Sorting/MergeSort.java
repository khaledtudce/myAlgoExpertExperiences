package algoExpertProblems.Sorting;

import java.util.Arrays;

public class MergeSort {

	// Best O(nlogn) time | O(logn) space because of recursive call stack
	// Average O(nlogn) time | O(logn) space
	// Worst O(nlogn) time | O(logn) space
	public int[] mergeSort(int[] array) {
		if(array.length<=1)
			return array;
		
		int middle = array.length/2;
		int[] firstHalf = Arrays.copyOfRange(array, 0, middle);
		int[] secondHalf = Arrays.copyOfRange(array, middle, array.length);
		
		return mergeSortedArray(mergeSort(firstHalf), mergeSort(secondHalf));
	}

	private int[] mergeSortedArray(int[] firstHalf, int[] secondHalf) {
		int[] sortedArray = new int[firstHalf.length + secondHalf.length];
		int k = 0, p1 = 0, p2 = 0;
		while(p1<firstHalf.length && p2<secondHalf.length) {
			if(firstHalf[p1]<secondHalf[p2])
				sortedArray[k++] = firstHalf[p1++];
			else 
				sortedArray[k++] = secondHalf[p2++];
		}
		while(p1<firstHalf.length) sortedArray[k++] = firstHalf[p1++];
		while(p2<secondHalf.length) sortedArray[k++] = secondHalf[p2++];
		
		return sortedArray;
	}

}
