package algoExpertProblems.LinkedList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ConstructLinkedListTest {

	ConstructLinkedList linkedList = new ConstructLinkedList();
	ConstructLinkedList.Node one = new ConstructLinkedList.Node(1);
	ConstructLinkedList.Node two = new ConstructLinkedList.Node(2);
	ConstructLinkedList.Node three = new ConstructLinkedList.Node(3);
	ConstructLinkedList.Node three2 = new ConstructLinkedList.Node(3);
	ConstructLinkedList.Node four = new ConstructLinkedList.Node(4);
	ConstructLinkedList.Node five = new ConstructLinkedList.Node(5);
	ConstructLinkedList.Node six = new ConstructLinkedList.Node(6);
	    
	private void bindNodes(ConstructLinkedList.Node nodeOne, ConstructLinkedList.Node nodeTwo) {
		nodeOne.next = nodeTwo;
		nodeTwo.prev = nodeOne;
	}

	private ConstructLinkedList getInitialList() {
		bindNodes(one, two);
		bindNodes(two, three);
		bindNodes(three, four);
		bindNodes(four, five);
		linkedList.head = one;
		linkedList.tail = five;
    
		return linkedList;
	}
	
	  //Initial Linkedlist: <- 1 <-> 2 <-> 3 <-> 4 <-> 5 ->	  
	  @Test
	  public void Test_Set_Head() {
		  ConstructLinkedList linkedList = getInitialList();
		  linkedList.setHead(four);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 3, 5}));
	  }
	  
	  @Test
	  public void Test_Set_Tail() {
		  ConstructLinkedList linkedList = getInitialList(); // 1 2 3 4 5
		  linkedList.setTail(six);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 4, 5, 6}));
	  }
	  
	  @Test
	  public void Test_InsertBefore() {
		  ConstructLinkedList linkedList = getInitialList(); // 1 2 3 4 5
		  linkedList.insertBefore(four, two);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 2, 4, 5}));
	  }

	  @Test
	  public void Test_InsertAfter() {
		  ConstructLinkedList linkedList = getInitialList(); // 1 2 3 4 5
		  linkedList.insertAfter(three, five);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 5, 4}));
	  }
	  
	  @Test
	  public void Test_InsertAt() {
		  ConstructLinkedList linkedList = getInitialList();
		  linkedList.insertAtPosition(3, three2);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] { 1, 2, 3, 3, 4, 5}));
	  }
	  
	  @Test
	  public void Test_RemoveNodeWithValue() {
		  ConstructLinkedList linkedList = getInitialList();// 1 2 3 4 5 
		  linkedList.removeNodesWithValue(3);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 4, 5}));
	  }
	  
	  @Test
	  public void Test_Remove() {
		  ConstructLinkedList linkedList = getInitialList(); // 1 2 3 4 5 
		  linkedList.remove(two);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 4, 5}));
		  linkedList.remove(three);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 4, 5}));
	  }
	  
	  @Test
	  public void Test_IsContainsNodeWithValue() {
		  ConstructLinkedList linkedList = getInitialList(); // 1 2 3 4 5
		  assertTrue(linkedList.containsNodeWithValue(5));
	  }

	private List<Integer> getNodeValuesHeadToTail(ConstructLinkedList linkedList) {
		List<Integer> values = new ArrayList<Integer>();
		ConstructLinkedList.Node node = linkedList.head;
		while (node != null) {
			values.add(node.value);
			node = node.next;
		}
		return values;
	}
	
	private boolean compare(List<Integer> array1, int[] array2) {
	    if (array1.size() != array2.length) {
	      return false;
	    }
	    for (int i = 0; i < array1.size(); i++) {
	      if (array1.get(i) != array2[i]) {
	        return false;
	      }
	    }
	    return true;
	}
}
