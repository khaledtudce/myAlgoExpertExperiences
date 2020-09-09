package algoExpertProblems.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	static class Node {
	    String name;
	    List<Node> children = new ArrayList<Node>();

	    public Node(String name) {
	    	this.name = name;
	    }

	    public Node addChild(String name) {
	    	Node child = new Node(name);
	    	children.add(child);
	    	return this;
	    }
	    
	    // Time: O (v+e) || Space: O (v)
	    public List<String> breadthFirstSearch(List<String> array) {
	    	Queue<Node> queue = new LinkedList<Node>(); 
	    	queue.add(this);
	    	while(!queue.isEmpty()) {
	    		Node currentNode = queue.poll();
	    		array.add(currentNode.name);
	    		for (int i = 0; i < currentNode.children.size(); i++) {
	    			queue.add(currentNode.children.get(i));
				}
	    	}
	    	return array;
	    }
	 }
}
