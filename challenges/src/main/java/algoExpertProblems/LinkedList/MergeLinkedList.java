package algoExpertProblems.LinkedList;

public class MergeLinkedList {

	// Time: O(n) || Space: O(1)
	public static LinkedList mergeLinkedLists3(LinkedList headOne, LinkedList headTwo) {
		LinkedList p1 = headOne;
		LinkedList p2 = headTwo;
		LinkedList temp = null;
		
		while(p1!=null && p2!=null) {
			if(p1.value<p2.value) {
				temp=p1;
				p1=p1.next;
			}else {
				if(temp!=null) // only change this pointer when no more p1<p2
					temp.next=p2;
				
				temp=p2;
				p2=p2.next;
				temp.next=p1;
			}
		}
		if(p1==null)
			temp.next=p2;
		
		return headOne.value<headTwo.value ? headOne : headTwo;
	}
	
	// Time: O(n) || Space: O(n)
	public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
		LinkedList p1 = headOne;
		LinkedList p2 = headTwo;
		LinkedList temp = null;
		getMergedList(p1, p2, temp);
		return headOne.value<headTwo.value ? headOne : headTwo;
	}
	
	private static void getMergedList(LinkedList p1, LinkedList p2, LinkedList temp) {
		if(p1==null) {
			temp.next=p2;
			return;
		}
		if(p2==null) 
			return;
		
		if(p1.value<p2.value) {
			getMergedList(p1.next, p2, p1);
		}else {
			if(temp!=null) // only change this pointer when no more p1<p2
				temp.next=p2;
			
			temp=p2.next;
			p2.next=p1;
			getMergedList(p1, temp, p2);
		}
	}
	
	// Time: O(n) || Space: O(n) but it created a new LinkedList which was not recommended
	public static LinkedList mergeLinkedLists2(LinkedList headOne, LinkedList headTwo) {
		LinkedList p1 = headOne;
		LinkedList p2 = headTwo;
		LinkedList result = null;
		if(p1.value<p2.value) {
			result = new LinkedList(p1.value);
			p1 = p1.next;
		} else {
			result = new LinkedList(p2.value);
			p2 = p2.next;
		}
		
		LinkedList cur = result;
		while(p1!=null && p2!=null) {
			if(p1.value<p2.value) {
				cur.next = new LinkedList(p1.value);
				cur = cur.next;
				p1 = p1.next;
			}else { 
				cur.next = new LinkedList(p2.value);
				cur = cur.next;
				p2 = p2.next;
			}
		}
		
		while(p1!=null) {
			cur.next = new LinkedList(p1.value);
			cur = cur.next;
			p1 = p1.next;
		}
		while(p2!=null) {
			cur.next = new LinkedList(p2.value);
			cur = cur.next;
			p2 = p2.next;
		}
		
		return result;
	}
	
	// Time: O(n) || Space: O(n) but it created a new LinkedList which was not recommended
	public static LinkedList mergeLinkedLists1(LinkedList headOne, LinkedList headTwo) {
		LinkedList p1 = headOne;
		LinkedList p2 = headTwo;
		LinkedList result = null;
		if(p1.value<p2.value) {
			result = new LinkedList(p1.value);
			p1 = p1.next;
		} else {
			result = new LinkedList(p2.value);
			p2 = p2.next;
		}
		
		LinkedList cur = result;
		while(p1!=null || p2!=null) {
			if(p1!=null && p2!=null) {
				if(p1.value<p2.value) {
					cur.next = new LinkedList(p1.value);
					cur = cur.next;
					p1 = p1.next;
				}else { 
					cur.next = new LinkedList(p2.value);
					cur = cur.next;
					p2 = p2.next;
				}
			}else if(p2!=null && p1==null) { 
				cur.next = new LinkedList(p2.value);
				cur = cur.next;
				p2 = p2.next;
			}else if(p1!=null && p2==null) { 
				cur.next = new LinkedList(p1.value);
				cur = cur.next;
				p1 = p1.next;
			}
		}
		
		return result;
	}
	
	// This is an input class. Do not edit.
	public static class LinkedList {
	    int value;
	    LinkedList next;

	    LinkedList(int value) {
	      this.value = value;
	      this.next = null;
	    }
	}
}
