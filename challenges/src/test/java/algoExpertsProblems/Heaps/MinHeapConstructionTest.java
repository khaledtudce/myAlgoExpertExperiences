package algoExpertsProblems.Heaps;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MinHeapConstructionTest {

	 @Test
	  public void TestCase1() {
		 MinHeapConstruction.MinHeap minHeap =
	        new MinHeapConstruction.MinHeap(
	            new ArrayList<Integer>(
				    Arrays.asList(-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8)));
		 assertTrue(minHeap.remove() == -10);
		 assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	     assertTrue(minHeap.peek() == -10);
	     assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	     minHeap.insert(-8);
	     assertTrue(minHeap.peek() == -10);
	     assertTrue(minHeap.remove() == -10);
	     assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	     assertTrue(minHeap.peek() == -9);
	     minHeap.insert(8);
	     assertTrue(minHeap.peek() == -9);
	     assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	  }
	
	 @Test
	  public void TestCase2() {
		 MinHeapConstruction.MinHeap minHeap =
	        new MinHeapConstruction.MinHeap(
	            new ArrayList<Integer>(
				    Arrays.asList(2, 3, 1)));
	
	    assertTrue(minHeap.peek() == 1);
	    assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	    assertTrue(minHeap.remove() == 1);
	    assertTrue(minHeap.peek() == 2);
	    assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	  }
	 
	 @Test
	  public void TestCase3() {
		 MinHeapConstruction.MinHeap minHeap =
	        new MinHeapConstruction.MinHeap(
	            new ArrayList<Integer>(
				    Arrays.asList(48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41)));
	    minHeap.insert(76);
	    assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	    assertTrue(minHeap.peek() == -5);
	    assertTrue(minHeap.remove() == -5);
	    assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	    assertTrue(minHeap.peek() == 2);
	    assertTrue(minHeap.remove() == 2);
	    assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	    assertTrue(minHeap.peek() == 6);
	    minHeap.insert(87);
	    assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
	  }

	  boolean isMinHeapPropertySatisfied(List<Integer> array) {
	    for (int currentIdx = 1; currentIdx < array.size(); currentIdx++) {
	      int parentIdx = (currentIdx - 1) / 2;
	      if (parentIdx < 0) {
	        return true;
	      }
	      if (array.get(parentIdx) > array.get(currentIdx)) {
	        return false;
	      }
	    }

	    return true;
	  }

}
