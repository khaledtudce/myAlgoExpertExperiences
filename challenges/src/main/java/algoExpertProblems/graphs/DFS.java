package algoExpertProblems.graphs;

import java.util.ArrayList;
import java.util.List;

class DFS {
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
	    public List<String> depthFirstSearch(List<String> array) {
	    	array.add(name);
	    	for (int i = 0; i < children.size(); i++) {
	    		children.get(i).depthFirstSearch(array);
	    	}
	    	return array;
	    }
	  }
	}
