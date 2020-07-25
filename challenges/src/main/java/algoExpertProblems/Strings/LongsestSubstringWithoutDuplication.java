package algoExpertProblems.Strings;

import java.util.HashMap;
import java.util.Map;

public class LongsestSubstringWithoutDuplication {
	
	// Time: O(n) || Space: O(n-d) where d is duplicate
	public String longestSubstringWithoutDuplication(String str) {
		int[] longStrLenth = new int[] {0, 0};
		int startIdx = 0;
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(charMap.containsKey(c)) {
				startIdx = Math.max(startIdx, charMap.get(c)+1);
			}
			charMap.put(c, i);
			if((i+1)-startIdx>longStrLenth[1]-longStrLenth[0])
				longStrLenth = new int[] {startIdx, i+1};
		}
		
		return str.substring(longStrLenth[0], longStrLenth[1]);
	}
	
	// Time: O(n) || Space: O(n)
	public String longestSubstringWithoutDuplication2(String str) {
		String longStr = "";
		int L=0, R=0, lastL = 0, mapIdx = 0;
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		while(R<str.length()) {
			if(!charMap.containsKey(str.charAt(R))) {
				charMap.put(str.charAt(R++), mapIdx++);
				if(R==str.length() && R-L>longStr.length())
						longStr = str.substring(L, R);
			}else {
				if(R-L>longStr.length())
					longStr = str.substring(L, R);
				L=charMap.get(str.charAt(R))+ 1 +lastL;
				lastL=L;
				R=L;
				charMap.clear();
				mapIdx=0;
			}
		}
		
		return longStr;
	}
	
	// Time: O(n) || Space: O(n)
	public String longestSubstringWithoutDuplication1(String str) {
		String biggestStr = "";
		String foundNewStr = "";
		int mapIdx = 0;
		int lastStartLoc = 0;
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!charMap.containsKey(c)) {
				charMap.put(c, mapIdx++);
				if(i==str.length()-1) {		
					foundNewStr = str.substring(lastStartLoc, i+1);
					if(foundNewStr.length()>biggestStr.length())
						biggestStr = foundNewStr;
				}
			}else {
				foundNewStr = str.substring(lastStartLoc, i);
				if(foundNewStr.length()>biggestStr.length())
					biggestStr = foundNewStr;
				i= i - (i-(charMap.get(c)+lastStartLoc));
				lastStartLoc = i+1;
				charMap.clear();
				foundNewStr="";
				mapIdx = 0;
			}
		}	
		return biggestStr;
	}
}
