package algoExpertProblems.LinkedList;

public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public void setHead(Node node) {
    	if(head == null) {
    		head = node;
    		tail = node;
    		return;
    	}		
    	insertBefore(head, node);
    }

    public void setTail(Node node) {
    	if(tail == null) {
    		head = node;
    		tail = node;
    		return;
    	}
    	insertAfter(tail, node);
    }

    public void insertBefore(Node node, Node nodeToInsert) {
    	if(nodeToInsert == head && nodeToInsert == tail) //if only 1 node and same one
    		return;
    	remove(nodeToInsert); // remove from previous list
    	nodeToInsert.next = node;
    	nodeToInsert.prev = node.prev;
    	if(node.prev == null) 
    		head = nodeToInsert;
    	else
    		node.prev.next = nodeToInsert;
    	
    	node.prev = nodeToInsert; // this must be at the end
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
    	
    	node.next = nodeToInsert; // this must be at the end
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
    	if(position==1) {
    		setHead(nodeToInsert);
    		return;
    	}
    	
    	Node node = head; // to travel all node, get first node
    	int currentPostion = 1;
		while(node != null && currentPostion != position) {
    		node = node.next;
    		currentPostion++;
    	}
    	if(node==null) // that means that position not found and node finished
    		setTail(nodeToInsert);
    	else
    		insertBefore(node, nodeToInsert);
    }

    public void removeNodesWithValue(int value) {
      Node node = head; // to travel all node
      while(node != null) {
    	  Node tempNodeToRemove = node;
    	  node = node.next; // if more node to delete, then still it can work
    	  if(tempNodeToRemove.value == value)
    		  remove(tempNodeToRemove);
      }
    }

    public void remove(Node node) {
    	if(node==head)
    		head = head.next;
    	if(node==tail)
    		tail = tail.prev;
    	
    	removeNodeBindings(node);
    }

    private void removeNodeBindings(Node node) {
    	if(node.prev != null)
    		node.prev.next = node.next;
    	if(node.next != null)
    		node.next.prev = node.prev;
    	
    	node.prev = null;
    	node.next = null;
	}

	public boolean containsNodeWithValue(int value) {
    	Node node = head;
    	while(node != null && node.value != value) {
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

