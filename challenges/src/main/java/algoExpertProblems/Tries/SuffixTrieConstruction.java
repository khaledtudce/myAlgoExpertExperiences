package algoExpertProblems.Tries;

import java.util.HashMap;
import java.util.Map;

public class SuffixTrieConstruction {
	
	static class TrieNode {
	    Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	}

	static class SuffixTrie {
		TrieNode root = new TrieNode();
	    char endSymbol = '*';

	    public SuffixTrie(String str) {
	      populateSuffixTrieFrom(str);
	    }

	    // Time: O(n^2) || Space: O(n^2) 
	    public void populateSuffixTrieFrom(String str) {
	    	for (int i = 0; i < str.length(); i++) {
				TrieNode currentNode = root;
				for (int j = i; j < str.length(); j++) {
					if(!currentNode.children.containsKey(str.charAt(j))) {
						TrieNode newNode = new TrieNode();
						currentNode.children.put(str.charAt(j), newNode);
					}
					currentNode = currentNode.children.get(str.charAt(j)); //next node
				}
				currentNode.children.put(endSymbol, null);
			}
	    }

	    // Time: O(m) || Space: O(1) 
	    public boolean contains(String str) {
	    	TrieNode currentNode = root;
	    	for (int i = 0; i < str.length(); i++) {
	    		if(!currentNode.children.containsKey(str.charAt(i)))
	    			return false;
	    		currentNode = currentNode.children.get(str.charAt(i)); // next node
	    	}
	    	
	    	return currentNode.children.containsKey(endSymbol);
	    }
	}
}
