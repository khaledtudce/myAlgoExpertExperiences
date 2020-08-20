package algoExpertProblems.LinkedList;

public class RemoveNthNodeFromEnd {

	// Time: O(n) || Space O(1)
	public static void removeKthNodeFromEnd1(LinkedList head, int k) {
		LinkedList firstPtr = head;
		LinkedList secondPtr = head;
		while(k != 0) {
			firstPtr = firstPtr.next;
			k--;
		}
		if(firstPtr == null) {
			head.value = head.next.value;
			head.next = head.next.next;
			return;
		}
		while(firstPtr.next != null) {
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
		}
		
		secondPtr.next = secondPtr.next.next;
	}
	
	// Time: O(n) || Space O(1)
	public static void removeKthNodeFromEnd(LinkedList head, int k) {
		LinkedList current = head;
		LinkedList kthNode = head;
		int counter = 0;
		while(current != null) {
			if(counter>k)
				kthNode = kthNode.next;	
			current = current.next;
			counter++;
		}
		
		if(k == counter) {
			head.value = head.next.value;
			head.next = head.next.next;
			return;
		}
		
		kthNode.next = kthNode.next.next;
	}

	static class LinkedList {
		int value;
		LinkedList next = null;
	
		public LinkedList(int value) {
			this.value = value;
	    }
	}
}
