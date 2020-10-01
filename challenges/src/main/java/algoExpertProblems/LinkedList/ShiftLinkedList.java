package algoExpertProblems.LinkedList;

public class ShiftLinkedList {

	// Time: O(n) || Space: O(1)
	public static LinkedList shiftLinkedList(LinkedList head, int k) {
		LinkedList oldTail = head;
		int length = 1;
		while(oldTail.next!=null) {
			oldTail = oldTail.next;
			length++;
		}
		int roundedK = Math.abs(k) % length;
		if(roundedK==0)
			return head;
		int tailLocation = k>0 ? length-roundedK : roundedK;
		LinkedList newTail = head;
		for (int i = 1; i < tailLocation; i++) {
			newTail = newTail.next;
		}
		LinkedList newHead = newTail.next;
		newTail.next = null;
		oldTail.next = head;
		
		return newHead;
	}
	
	
	// Time: O(n) || Space: O(1)
	public static LinkedList shiftLinkedList1(LinkedList head, int k) {
		int length=1;
		LinkedList givenTail = head;
		while(givenTail.next!=null) {
			givenTail=givenTail.next;
			length++;
		}
		
		int roundedValue = Math.abs(k) % length;
		if(roundedValue==0) 
			return head;
		int newTailPos = k>0 ? length-roundedValue : roundedValue;
		
		LinkedList newTail = head;
		int counter = 1;
		while(counter!=newTailPos) {
			newTail = newTail.next;
			counter++;
		}
		
		LinkedList newHead = newTail.next;
		newTail.next=null;
		givenTail.next = head;
		
		return newHead;
	}

	static class LinkedList {
		public int value;
		public LinkedList next;

	    public LinkedList(int value) {
	      this.value = value;
	      next = null;
	    }
	}
}
