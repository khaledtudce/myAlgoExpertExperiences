package algoExpertProblems.LinkedList;

public class ConstructLinkedList {
	  public Node head;
	  public Node tail;

	  public void setHead(Node node) {
	      if(head==null) {
	    	  head = node;
	    	  tail = node;
	    	  return;
	      }
	      insertBefore(head, node);
	  }

	  public void setTail(Node node) {
		  if(tail==null) {
	    	  head = node;
	    	  tail = node;
	    	  return;
	      }
		  insertAfter(tail, node);
	  }

	 // 1 nodeToInsert(2) 3 Node(4) 5
	  public void insertBefore(Node node, Node nodeToInsert) {
		  if(nodeToInsert == head && nodeToInsert == tail)
			  return;
		  remove(nodeToInsert);
		  nodeToInsert.next = node;
		  nodeToInsert.prev = node.prev;
		  
		  if(node.prev == null)
			  head = nodeToInsert;
		  else 
			  node.prev.next = nodeToInsert;
		  
		  node.prev = nodeToInsert; // at the end
	  }

	  public void insertAfter(Node node, Node nodeToInsert) {
		  if(nodeToInsert == head && nodeToInsert == tail)
			  return;
		  remove(nodeToInsert);
		  nodeToInsert.prev = node;
		  nodeToInsert.next = node.next;
		  
		  if(node.next == null)
			  tail = nodeToInsert;
		  else
			  node.next.prev = nodeToInsert;
		  
		  node.next = nodeToInsert;
	  }

	  public void insertAtPosition(int position, Node nodeToInsert) {
		  if(position==1) {
			  setHead(nodeToInsert);
		  	  return;
		  }
		  
		  Node node = head;
		  int currentPositon = 1;
		  while (node!=null && currentPositon!=position) {
			node = node.next;
			currentPositon++;
		  }
		  
		  if(node == null)
			  setTail(nodeToInsert);
		  else
			  insertBefore(node, nodeToInsert);
	  }

	  public void removeNodesWithValue(int value) {
		  Node node = head;
		  while(node!=null) {
			  Node tempNode = node;
			  node = node.next;
			  if(tempNode.value == value)
				  remove(tempNode);
		  }
	  }

	  public void remove(Node node) {
	      if(node==head)
	    	  head = node.next;
	      if(node==tail)
	    	  tail=tail.prev;
	      
	      removeBindings(node);
	  }

	  private void removeBindings(Node node) {
		  if(node.prev != null)
			  node.prev.next = node.next;
		  if(node.next != null)
			  node.next.prev = node.prev;
		  
		  node.next= null;
		  node.prev = null;
	  }

	   public boolean containsNodeWithValue(int value) {
	      Node node = head;
	      while(node!=null && node.value != value) {
	    	  node = node.next;
	      }
		  
	      return node != null;
	  }

	  // Do not edit the class below.
	  static class Node {
	    public int value;
	    public Node prev;
	    public Node next;

	    public Node(int value) {
	      this.value = value;
	    }
	  }
}
