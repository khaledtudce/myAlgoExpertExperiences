package algoExpertProblems.Sorting;

public class BubbleSorting {
	
	// Best O(n) time | O(1) space
	// Average O(n^2) time | O(1) space
	// Worst O(n^2) time | O(1) space
	public int[] bubbleSort(int[] array) {
		boolean isSorted = false;
		int indexToEliminate = 0;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length-1-indexToEliminate; i++) {
				if(array[i]>array[i+1]) {
					swap(i, i+1, array);
					isSorted = false;
				}
			}
			indexToEliminate++;
		}
		return array;
	}
	
	private void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j]= array[i];
		array[i] = temp;
	}
	
	
	

	public int[] bubbleSort1(int[] array) {
		int i=0;
		int j=array.length-1;
		int loopLength = array.length>2 ? array.length-3 : array.length/2; 
		while(j>loopLength) {
			if(array[i]>array[j]) {
				int temp = array[j];
				moveNext(i, j, array);
				array[i]= temp;
			}else
				i = i+1;
			
			if(i==j) {
				j=j-1;
				i=0;
			}
		}
		return array;
	}

	private void moveNext(int i, int j, int[] array) {
		while (i<j) {
			array[j]=array[j-1];
			j--;
		}
	}
}
