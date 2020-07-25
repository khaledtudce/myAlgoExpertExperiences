package algoExpertProblems.Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiStringSearch {

	// O (b^2 + ns) | (b^2 + n) space
	public List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {	
		List<Boolean> result = new ArrayList<Boolean>();
		SuffixTrie suffixTrie = new SuffixTrie(bigString);
		for (int i = 0; i < smallStrings.length; i++) 
			result.add(suffixTrie.contains(smallStrings[i]));
		
		return result;
	}
	
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
	    	
	    	return true;
	    }
	}
	
	// Time: O(n*s*logb) where b=bigString length, s=size of each smallString
	// Space: O(n) n=length of smallString,
	public List<Boolean> multiStringSearch2(String bigString, String[] smallStrings) {		
		List<Boolean> result = new ArrayList<Boolean>();
		for (int i = 0; i < smallStrings.length; i++) {
			char[] characters = smallStrings[i].toCharArray();
			
			int p = 0;
			boolean stringFound = false;
			for (int j = 0; j < bigString.length(); j++) {
				if(bigString.charAt(j) == characters[p]) {
					if(p==characters.length-1){
						result.add(true);
						stringFound = true;
						break;
					}else
						p++;
				}else
					p=0;
			}
			
			if(!stringFound)
				result.add(false);
		}
		
	    return result;
	}
	

	// Time: O(n) || Space: O(n), but you are not allowed to use it
	public List<Boolean> multiStringSearch1(String bigString, String[] smallStrings) {		
		List<Boolean> result = new ArrayList<Boolean>();
		for (int i = 0; i < smallStrings.length; i++) {
			if(bigString.contains(smallStrings[i]))
				result.add(true);
			else 
				result.add(false);
		}
		
		return result;
	}
}
