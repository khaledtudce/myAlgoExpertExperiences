package algoExpertProblems.Strings;

import java.util.ArrayList;
import java.util.List;

public class UnderscorifySubstring {
	
	// Time: O(n) || Space: O(n)
	public String underscorifySubstring(String str, String subStr) {
		return getUnderScorified(getPrecizedLocations(getLocations(str, subStr)), str);
	}
	
	private List<Integer[]> getLocations(String str, String subStr){
		List<Integer[]> locations = new ArrayList<Integer[]>();
		for (int i = 0; i < str.length(); i++) {
			int occur = str.indexOf(subStr, i);
			if(occur==-1)
				break;
			locations.add(new Integer[] {occur, occur+subStr.length()});
			i=occur;
		}
		return locations;
	}
	
	private List<Integer> getPrecizedLocations(List<Integer[]> locations){
		List<Integer> precizedLocations = new ArrayList<Integer>();
		if(!locations.isEmpty()) {
			precizedLocations.add(locations.get(0)[0]);
			precizedLocations.add(locations.get(0)[1]);
			for (int i = 1; i < locations.size(); i++) {
				if(locations.get(i)[0]<=precizedLocations.get(precizedLocations.size()-1))
					precizedLocations.set(precizedLocations.size()-1, locations.get(i)[1]);
				else {
					precizedLocations.add(locations.get(i)[0]);
					precizedLocations.add(locations.get(i)[1]);
				}
			}
		}
		return precizedLocations;
	}
	
	private String getUnderScorified(List<Integer> precizedLocations, String str) {
		StringBuilder finalString = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(precizedLocations.contains(i)) 
				finalString.append("_" + str.charAt(i));
			else
				finalString.append(str.charAt(i));
		}
		if(!precizedLocations.isEmpty() && str.length()==precizedLocations.get(precizedLocations.size()-1))
			finalString.append("_"); 
		
		return finalString.toString();
	}

	
	// Time: O(n) || Space: O(n)
	public String underscorifySubstring1(String str, String subStr) {
		StringBuilder finalString = new StringBuilder();
		int endIdxUnderScore = Integer.MIN_VALUE;
		int strLengthDiff = str.length()-subStr.length();
		
		for(int i=0; i<=strLengthDiff; i++) {
			int startIdxSubStr = 0, endIdxSubStr = subStr.length()-1;
			int curIdx = i, subStrLengthIdx = i+endIdxSubStr;
			boolean matchFound = false;
			if(str.charAt(curIdx)==subStr.charAt(startIdxSubStr) && 
					str.charAt(subStrLengthIdx)==subStr.charAt(endIdxSubStr)) {
				matchFound = true;
				while(curIdx+1<subStrLengthIdx) {
					if(str.charAt(++curIdx)==subStr.charAt(++startIdxSubStr) &&
							str.charAt(--subStrLengthIdx)==subStr.charAt(--endIdxSubStr)) {
						matchFound = true;
					}else {
						matchFound = false;
						if(endIdxUnderScore<i)
							finalString.append(str.charAt(i));
						break;
					}
				}
				if(matchFound) {
					endIdxUnderScore = writeSubStrBasedOnLocation(str, subStr, finalString, endIdxUnderScore, i);
				}
			}else if(endIdxUnderScore<i) {
				finalString.append(str.charAt(i));
			}
		}
		writeRestPartIfExists(str, finalString, endIdxUnderScore, strLengthDiff);
		
		return finalString.toString();
	}

	private void writeRestPartIfExists(String str, StringBuilder finalString, int endIdxUnderScore, int strLengthDiff) {
		if(endIdxUnderScore<str.length()-1) {
			int restLetters = strLengthDiff>endIdxUnderScore ? strLengthDiff : endIdxUnderScore;
			for (int i = restLetters+1; i < str.length(); i++) 
				finalString.append(str.charAt(i));
		}
	}

	private int writeSubStrBasedOnLocation(String str, String subStr, StringBuilder finalString, int endIdxUnderScore, int i) {
		if (i-endIdxUnderScore==1 || endIdxUnderScore>=i) {
			for (int j = 0; j <= (endIdxUnderScore-i)+1; j++) 
				finalString.deleteCharAt(finalString.length()-1);
			endIdxUnderScore = i+(subStr.length()-1);
			writeSubStringWithUnderScore(str, finalString, endIdxUnderScore, i);
		}else {
			endIdxUnderScore = i+(subStr.length()-1);
			finalString.append("_");
			writeSubStringWithUnderScore(str, finalString, endIdxUnderScore, i);
		}
		return endIdxUnderScore;
	}

	private void writeSubStringWithUnderScore(String str, StringBuilder finalString, int endIdxUnderScore, int i) {
		for (int j = i; j <= endIdxUnderScore; j++) {
			finalString.append(str.charAt(j));
		}
		finalString.append("_");
	}
}
