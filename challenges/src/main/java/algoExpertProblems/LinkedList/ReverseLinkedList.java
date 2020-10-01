package algoExpertProblems.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseLinkedList {
	
	// Time: O(n) || Space: O(1)
	public static LinkedList reverseLinkedList(LinkedList head) {
		LinkedList previousNode=null;
		LinkedList currentNode=head;
		while(currentNode!=null) {
			LinkedList tempNextNode=currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			
			currentNode=tempNextNode;
		}
		
		return previousNode;
	}
	
	// Time: O(n) || Space: O(n)
	public static LinkedList reverseLinkedList2(LinkedList head) {
		LinkedList current = head;
		List<LinkedList> nodes = new ArrayList<LinkedList>();
		while(current.next!=null) {
			nodes.add(new LinkedList(current.value));
			current = current.next;
		}
		
		Collections.reverse(nodes);
		LinkedList newLinkedList = new LinkedList(current.value);
		LinkedList newCurrent = newLinkedList;
		for (LinkedList reversedNode : nodes) {
			newCurrent.next = reversedNode;
			newCurrent = newCurrent.next;
		}
		
		return newLinkedList;
	}
	
	// Time: O(n) || Space: O(n)
	public static LinkedList reverseLinkedList1(LinkedList head) {
		LinkedList current = head;
		List<Integer> nodesValues = new ArrayList<Integer>();
		while(current.next!=null) {
			nodesValues.add(current.value);
			current = current.next;
		}
		
		LinkedList newLinkedList = new LinkedList(current.value);
		LinkedList newCurrent = newLinkedList; // something to note
		for (int i = nodesValues.size()-1; i >= 0; i--) {
			newCurrent.next = new LinkedList(nodesValues.get(i));
			newCurrent = newCurrent.next;
		}
		
		return newLinkedList;
	}

	static class LinkedList {
		int value;
		LinkedList next = null;

		public LinkedList(int value) {
			this.value = value;
		}
	}
}
