package algoExpertProblems.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	// Time: O(wnlogn+wn^2) || Space: O(w*n) where w is the number of words
	public List<List<String>> groupAnagrams(List<String> words) {
		List<String> sortedWords = new ArrayList<String>();
		for (String word : words) {
			char wordArray[] = word.toCharArray();
			Arrays.sort(wordArray);
			sortedWords.add(new String(wordArray)); 
		}
		
		List<String> seen = new ArrayList<String>();
		List<List<String>> result = new ArrayList<List<String>>();
		for (int i = 0; i < words.size(); i++) {
			if(!seen.contains(sortedWords.get(i))) {
				seen.add(sortedWords.get(i));
				List<String> sameWords = new ArrayList<String>();
				sameWords.add(words.get(i));
				for (int j = i+1; j < words.size(); j++) {
					if(sortedWords.get(i).equals(sortedWords.get(j)))
						sameWords.add(words.get(j));
				}
				result.add(sameWords);
			}
		}
		
		return result;
	}
	
	
	
	// Time: O(w*nlogn) || Space: O(w*n) where w is the number of words
	public List<List<String>> groupAnagrams1(List<String> words) {
		Map<String, List<String>> wordMap = new HashMap<String, List<String>>();
		for (String word : words) {
			char wordArray[] = word.toCharArray();
			Arrays.sort(wordArray);
			String sortedWord = new String(wordArray); 
			if(!wordMap.containsKey(sortedWord))
				wordMap.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
			else {
				wordMap.get(sortedWord).add(word);
			}
		}
		
		List<List<String>> result = new ArrayList<List<String>>();
		// is there any way to one line convert by stream?
		for (Map.Entry<String, List<String>> entry : wordMap.entrySet()) {
		    result.add(entry.getValue());
		}
		
		return result;
	}
}
