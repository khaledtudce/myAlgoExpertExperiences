package algoExpertProblems.LinkedList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DoublyLinkedListTest {

	  private List<Integer> getNodeValuesHeadToTail(DoublyLinkedList linkedList) {
	    List<Integer> values = new ArrayList<Integer>();
	    DoublyLinkedList.Node node = linkedList.head;
	    while (node != null) {
	      values.add(node.value);
	      node = node.next;
	    }
	    return values;
	  }

	  private List<Integer> getNodeValuesTailToHead(DoublyLinkedList linkedList) {
	    List<Integer> values = new ArrayList<Integer>();
	    DoublyLinkedList.Node node = linkedList.tail;
	    while (node != null) {
	      values.add(node.value);
	      node = node.prev;
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
	  
	  DoublyLinkedList linkedList = new DoublyLinkedList();
	  DoublyLinkedList.Node one = new DoublyLinkedList.Node(1);
	  DoublyLinkedList.Node two = new DoublyLinkedList.Node(2);
	  DoublyLinkedList.Node three = new DoublyLinkedList.Node(3);
	  DoublyLinkedList.Node three2 = new DoublyLinkedList.Node(3);
	  DoublyLinkedList.Node three3 = new DoublyLinkedList.Node(3);
	  DoublyLinkedList.Node four = new DoublyLinkedList.Node(4);
	  DoublyLinkedList.Node five = new DoublyLinkedList.Node(5);
	  DoublyLinkedList.Node six = new DoublyLinkedList.Node(6);
	    
	  private void bindNodes(DoublyLinkedList.Node nodeOne, DoublyLinkedList.Node nodeTwo) {
		  nodeOne.next = nodeTwo;
		  nodeTwo.prev = nodeOne;
	  }

	  private DoublyLinkedList getInitialList() {
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
		  DoublyLinkedList linkedList = getInitialList();
		  linkedList.setHead(four);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 3, 5}));
	  }
	  
	  @Test
	  public void Test_Set_Tail() {
		  DoublyLinkedList linkedList = getInitialList(); // 1 2 3 4 5
		  linkedList.setTail(six);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 4, 5, 6}));
	  }
	  
	  @Test
	  public void Test_InsertBefore() {
		  DoublyLinkedList linkedList = getInitialList();
		  linkedList.insertBefore(four, two);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 2, 4, 5}));
	  }

	  @Test
	  public void Test_InsertAfter() {
		  DoublyLinkedList linkedList = getInitialList();
		  linkedList.insertAfter(three, five);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 5, 4}));
	  }
	  
	  @Test
	  public void Test_InsertAt() {
		  DoublyLinkedList linkedList = getInitialList();
		  linkedList.insertAtPosition(1, three2);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 1, 2, 3, 4, 5}));
	  }
	  
	  @Test
	  public void Test_RemoveNodeWithValue() {
		  DoublyLinkedList linkedList = getInitialList();
		  linkedList.removeNodesWithValue(3);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 4, 5}));
	  }
	  
	  @Test
	  public void Test_Remove() {
		  DoublyLinkedList linkedList = getInitialList();
		  linkedList.remove(two);
		  assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 4, 5}));
	  }
	  
	  @Test
	  public void Test_IsContainsNodeWithValue() {
		  DoublyLinkedList linkedList = getInitialList(); // 1 2 3 4 5
		  assertTrue(linkedList.containsNodeWithValue(5));
	  }
	  
	  
	  @Test
	  public void TestCase1() {
	    bindNodes(one, two);
	    bindNodes(two, three);
	    bindNodes(three, four);
	    bindNodes(four, five);
	    linkedList.head = one;
	    linkedList.tail = five;

	    linkedList.setHead(four);
	    assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 3, 5}));
	    assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 3, 2, 1, 4}));
	    
	    linkedList.setTail(six);
	    assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 3, 5, 6}));
	    assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 3, 2, 1, 4}));
	    
	    linkedList.insertBefore(six, three);
	    assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 5, 3, 6}));
	    assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 3, 5, 2, 1, 4}));
	    
	    linkedList.insertAfter(six, three2);
	    assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 5, 3, 6, 3}));
	    assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 6, 3, 5, 2, 1, 4}));
	    
	    linkedList.insertAtPosition(1, three3);
	    assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 4, 1, 2, 5, 3, 6, 3}));
	    assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 6, 3, 5, 2, 1, 4, 3}));
	    
	    linkedList.removeNodesWithValue(3);
	    assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 5, 6}));
	    assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 2, 1, 4}));
	    
	    linkedList.remove(two);
	    assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 5, 6}));
	    assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 1, 4}));

	    assertTrue(linkedList.containsNodeWithValue(5));
	  }
}
