package algoExpertProblems.LinkedList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RemoveNthNodeFromEndTest {

	  @Test
	  public void TestCase1() {
	    TestLinkedList test = new TestLinkedList(0);
	    test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
	    int[] expected = {0, 1, 2, 3, 4, 5, 7, 8, 9};
	    RemoveNthNodeFromEnd.removeKthNodeFromEnd(test, 4);
	    List<Integer> nodesInArray = test.getNodesInArray();
		assertTrue(compare(nodesInArray, expected));
	  }
	  
	  @Test
	  public void TestCase2() {
	    TestLinkedList test = new TestLinkedList(0);
	    test.addMany(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9});
	    int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	    RemoveNthNodeFromEnd.removeKthNodeFromEnd(test, 10);
	    List<Integer> nodesInArray = test.getNodesInArray();
		assertTrue(compare(nodesInArray, expected));
	  }
	  
	  @Test
	  public void TestCase3() {
	    TestLinkedList test = new TestLinkedList(0);
	    test.addMany(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9});
	    int[] expected = {0, 2, 3, 4, 5, 6, 7, 8, 9 };
	    RemoveNthNodeFromEnd.removeKthNodeFromEnd(test, 9);
	    List<Integer> nodesInArray = test.getNodesInArray();
		assertTrue(compare(nodesInArray, expected));
	  }

	  public boolean compare(List<Integer> arr1, int[] arr2) {
	    if (arr1.size() != arr2.length) {
	      return false;
	    }
	    for (int i = 0; i < arr1.size(); i++) {
	      if (arr1.get(i) != arr2[i]) {
	        return false;
	      }
	    }
	    return true;
	  }

	  class TestLinkedList extends RemoveNthNodeFromEnd.LinkedList {

	    public TestLinkedList(int value) {
	      super(value);
	    }

	    public void addMany(int[] values) {
	      RemoveNthNodeFromEnd.LinkedList current = this;
	      while (current.next != null) {
	        current = current.next;
	      }
	      for (int value : values) {
	        current.next = new RemoveNthNodeFromEnd.LinkedList(value);
	        current = current.next;
	      }
	    }

	    public List<Integer> getNodesInArray() {
	      List<Integer> nodes = new ArrayList<Integer>();
	      RemoveNthNodeFromEnd.LinkedList current = this;
	      while (current != null) {
	        nodes.add(current.value);
	        current = current.next;
	      }
	      return nodes;
	    }
	  }
}
