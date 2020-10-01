package algoExpertProblems.LinkedList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ShiftLinkedListTest {

	@Test
	public void TestCase1() {
	    var head = new ShiftLinkedList.LinkedList(0);
	    head.next = new ShiftLinkedList.LinkedList(1);
	    head.next.next = new ShiftLinkedList.LinkedList(2);
	    head.next.next.next = new ShiftLinkedList.LinkedList(3);
	    head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
	    head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
	    var result = ShiftLinkedList.shiftLinkedList(head, 2);
	    var array = this.linkedListToArray(result);

	    var expected = Arrays.asList(new Integer[] {4, 5, 0, 1, 2, 3});
	    assertTrue(expected.equals(array));
	}
	
	@Test
	public void TestCase2() {
	    var head = new ShiftLinkedList.LinkedList(0);
	    head.next = new ShiftLinkedList.LinkedList(1);
	    head.next.next = new ShiftLinkedList.LinkedList(2);
	    head.next.next.next = new ShiftLinkedList.LinkedList(3);
	    head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
	    head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
	    var result = ShiftLinkedList.shiftLinkedList(head, 6);
	    var array = this.linkedListToArray(result);

	    var expected = Arrays.asList(new Integer[] { 0, 1, 2, 3, 4, 5});
	    assertTrue(expected.equals(array));
	}
	
	@Test
	public void TestCase3() {
	    var head = new ShiftLinkedList.LinkedList(0);
	    head.next = new ShiftLinkedList.LinkedList(1);
	    head.next.next = new ShiftLinkedList.LinkedList(2);
	    head.next.next.next = new ShiftLinkedList.LinkedList(3);
	    head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
	    head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
	    var result = ShiftLinkedList.shiftLinkedList(head, 0);
	    var array = this.linkedListToArray(result);

	    var expected = Arrays.asList(new Integer[] { 0, 1, 2, 3, 4, 5});
	    assertTrue(expected.equals(array));
	}
	
	public List<Integer> linkedListToArray(ShiftLinkedList.LinkedList head) {
	    var array = new ArrayList<Integer>();
	    var current = head;
	    while (current != null) {
	      array.add(current.value);
	      current = current.next;
	    }
	    return array;
	}
}
