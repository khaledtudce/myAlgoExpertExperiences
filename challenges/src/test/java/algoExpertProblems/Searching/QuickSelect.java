package algoExpertProblems.Searching;

public class QuickSelect {

	// we just sort one side where target position exist, other side we do not care.
	// Best O(n) time | O(1) space
	// Average O(n) time | O(1) space
	// Worst O(n^2) time | O(1) space
	public int quickselect(int[] array, int k) {
		int position = k-1;
		return quickSelect(array, 0, array.length-1, position);
	}
	
	private int quickSelect(int[] array, int startIdx, int endIdx, int position) {
		while(true) {
			int pivotIdx= startIdx;
			int leftIdx = startIdx+1;
			int rightIdx = endIdx;
			while(leftIdx<=rightIdx) {
				if(array[leftIdx]>array[pivotIdx] && array[rightIdx]<array[pivotIdx])
					swap(array, leftIdx, rightIdx);
				if(array[leftIdx] <= array[pivotIdx])
					leftIdx++;
				if(array[rightIdx]>=array[pivotIdx])
					rightIdx--;
			}
			swap(array, pivotIdx, rightIdx);
			if(rightIdx==position)
				return array[position];
			else if(rightIdx<position) {
				startIdx = rightIdx+1;
			}else
				endIdx = rightIdx-1;
		}
	}

	// we just sort one side where target position exist
	// It does not follow quick sort techniques properly, we don't make half
	// Best O(n) time | O(1) space
	// Average O(logn) time | O(1) space
	// Worst O(n^2) time | O(1) space
	public int quickselect3(int[] array, int k) {
		int right = array.length-1;
		while(true) {
			int pivot = 0, left = pivot+1;
			while(left<=right) {
				int leftNumber = array[left];
				int rightNumber = array[right];
				int pivotNumber = array[pivot];
				if(leftNumber>pivotNumber && rightNumber<pivotNumber)
					swap(array, left, right);
				else if(leftNumber<pivotNumber)
					left++;
				else if(rightNumber>pivotNumber && leftNumber<=rightNumber)
					right--;
				else 
					break;
			}
			swap(array, pivot, right);
			if(right<=1)
				return array[k-1];
		}
	}
	
	private void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}


	// Best O(n) time | O(n) space
	// Average O(n^2) time | O(n^2) space
	// Worst O(n^2) time | O(n^2) space
	// I did it with Insertion sort
	public int quickselect2(int[] array, int k) {
		return getQuickSelect(array, k, 1); 
	}
	
	private int getQuickSelect(int[] array, int k, int i) {
		if(i>=array.length)
			return array[k-1];
		int prev = i-1, current = i;
		while(array[prev]>array[current]) {
			int temp = array[prev];
			array[prev] = array[current];
			array[current] = temp;
			if(prev>0) {
				prev--;
				current--;
			}
		}
		
		return getQuickSelect(array, k, i+1);
	}

	// Best O(n) time | O(1) space
	// Average O(n^2) time | O(1) space
	// Worst O(n^2) time | O(1) space
	// I did it with Insertion sort
	public int quickselect1(int[] array, int k) {
		for (int i = 1; i < array.length; i++) {
			int prev = i-1, current = i;
			while(array[prev]>array[current]) {
				int temp = array[prev];
				array[prev] = array[current];
				array[current] = temp;
				if(prev>0) {
					prev--;
					current--;
				}
			}
		}
		
		return array[k-1];
	}
}
