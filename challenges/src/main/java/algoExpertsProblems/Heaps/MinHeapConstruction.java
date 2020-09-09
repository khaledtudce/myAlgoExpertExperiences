package algoExpertsProblems.Heaps;

import java.util.List;
import java.util.ArrayList;

public class MinHeapConstruction {
	static class MinHeap {
	    List<Integer> heap = new ArrayList<Integer>();

	    public MinHeap(List<Integer> array) {
	      heap = buildHeap(array);
	    }

	    // Time: O(logn) || Space: O(1) 
	    public List<Integer> buildHeap(List<Integer> array) {
	    	int lastParent = (array.size()-2)/2;
	    	for (int i = lastParent; i >= 0; i--) {
				siftDown(i, array.size()-1, array);
			}
	    	return array;
	    }

	    // Time: O(logn) || Space: O(1) 
	    public void siftDown(int currentIdx, int heapSize, List<Integer> heap) {
	    	int leftChildIdx = (currentIdx*2)+1;
			while(leftChildIdx<=heapSize) {
	    		int rightChildIdx = (currentIdx*2)+2, idxToSwap;
	    		if(rightChildIdx<=heapSize && heap.get(rightChildIdx)<heap.get(leftChildIdx))
	    			idxToSwap = rightChildIdx;
	    		else 
	    			idxToSwap = leftChildIdx;
	    			
	    		if(heap.get(currentIdx)>heap.get(idxToSwap)) {
	    			swap(currentIdx, idxToSwap, heap);
	    			currentIdx = idxToSwap;
	    			leftChildIdx = (currentIdx*2)+1;
	    		}else 
	    			break;
	    	}
	    }
	    
	    // Time: O(logn) || Space: O(1)
	    public void siftDown1(int currentIdx, int heapSize, List<Integer> heap) {
		    int leftChildIdx = (currentIdx*2)+1;
			while(leftChildIdx<=heapSize) {
	    		int rightChildIdx = (currentIdx*2)+2;
	    		if(rightChildIdx<=heapSize && heap.get(rightChildIdx)<heap.get(leftChildIdx)){
	    			if(heap.get(currentIdx)>heap.get(rightChildIdx)) {
	    				swap(currentIdx, rightChildIdx, heap);
	    				currentIdx = rightChildIdx;
	    			}else break;
	    		}else if(heap.get(leftChildIdx)<heap.get(currentIdx)) {
	    			swap(currentIdx, leftChildIdx, heap);
	    			currentIdx = leftChildIdx;
	    		}else break;
	    		leftChildIdx = (currentIdx*2)+1; 
	    	}
	    }
	    
	    // Time: O(logn) || Space: O(1) 
	    public void siftUp(int currentIdx, List<Integer> heap) {
	    	int parentNodeIdx = (currentIdx-1)/2;
	    	while(currentIdx>0 && heap.get(currentIdx)<heap.get(parentNodeIdx)) {
	    		swap(currentIdx, parentNodeIdx, heap);
	    		currentIdx = parentNodeIdx;
	    		parentNodeIdx = (currentIdx-1)/2;
	    	}
	    }

	    // Time: O(1) || Space: O(1) 
		public int peek() {
			return heap.get(0);
	    }

		// Time: O(logn) || Space: O(1) 
	    public int remove() {
	    	int valueToRemove = heap.get(0);
	    	swap(0, heap.size()-1, heap);
	    	heap.remove(heap.size()-1);
	    	siftDown(0, heap.size()-1, heap);
	    	return valueToRemove;
	    }

	    // Time: O(logn) || Space: O(1) 
	    public void insert(int value) {
	    	heap.add(value);
	    	siftUp(heap.size()-1, heap);
	    }
	    
	    private void swap(int currentIdx, int parentNodeIdx, List<Integer> heap) {
	    	int leftHand = heap.get(currentIdx);
	    	heap.set(currentIdx, heap.get(parentNodeIdx));
	    	heap.set(parentNodeIdx, leftHand);
		}
	    
	}
}
