package algoExpertProblems.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class FindLoop {
	
	// Time: O(n) || Space: O(1)
	public static LinkedList findLoop(LinkedList head) {
		LinkedList singeNext = head.next;
		LinkedList doubleNext = head.next.next;
		while(singeNext!=doubleNext) {
			singeNext=singeNext.next;
			doubleNext=doubleNext.next.next;
		}
		
		LinkedList nextFromStart = head;
		while(nextFromStart!=singeNext) {
			nextFromStart=nextFromStart.next;
			singeNext=singeNext.next;
		}
		
		return nextFromStart;
	}
	
	// Time: O(n) || Space: O(n)
	public static LinkedList findLoop1(LinkedList head) {
		Map<LinkedList, Boolean> memoize = new HashMap<LinkedList, Boolean>();
		LinkedList current = head;
		while(current.next!=null) {
			if(!memoize.containsKey(current))
				memoize.put(current, true);
			else 
				return current;
			current = current.next;
		}
		
		return null;
	}

	static class LinkedList {
		int value;
		LinkedList next = null;

		public LinkedList(int value) {
			this.value = value;
		}
	}
}
