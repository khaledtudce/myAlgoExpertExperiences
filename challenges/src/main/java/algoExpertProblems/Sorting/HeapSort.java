package algoExpertProblems.Sorting;

public class HeapSort {
	
	// best sorting technique
	// Best Case: Time: O(nlogn) || Space: O(1)
	// Average Case: Time: O(nlogn) || Space: O(1)
	// Worse Case: Time: O(nlogn) || Space: O(1)
	public int[] heapSort(int[] array) {
		createMaxHeap(array); // Time: O(logn)
		for (int unsortedLength = array.length-1; unsortedLength>0; unsortedLength--) {
			swap(0, unsortedLength, array);
			siftdown(0, unsortedLength-1, array); // Time: O(logn)
		}
		return array;
	}

	private void createMaxHeap(int[] heap) {
		int lastParent = (heap.length-2)/2; 
		for(int i=lastParent; i>=0; i--) {
			siftdown(i, heap.length-1, heap);
		}
	}

	private void siftdown(int current, int heapLength, int[] heap) { 
		int leftChild = 2*current + 1;
		while(leftChild<=heapLength) {
			int rightChild = 2*current + 2;
			int idxToSwap = 0;
			if(rightChild<=heapLength && heap[rightChild]>heap[leftChild])
				idxToSwap = rightChild;
			else 
				idxToSwap = leftChild;
			
			if(heap[current]<heap[idxToSwap]) {
				swap(current, idxToSwap, heap);
				current = idxToSwap;
				leftChild = 2*current + 1;
			}else 
				break;
		}
	}

	private void swap(int current, int idxToSwap, int[] array) {
		int temp = array[current];
		array[current] = array[idxToSwap];
		array[idxToSwap] = temp;
	}
}
