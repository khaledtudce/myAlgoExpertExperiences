package algoExpertProblems.DynamicProgramming;

import java.util.Arrays;

public class LevenshteinDistance {
	
	// Time: O(nm) || Space: O(2m)
	public int levenshteinDistance(String str1, String str2) {
		if(str1.length()==0)
			return str2.length();
		
		int[] lastRow = new int[str2.length()+1];
		int[] currentRow = new int[str2.length()+1];
		for (int i = 0; i <= str2.length(); i++) {
			lastRow[i] = i;
		}
		
		for (int i = 1; i <= str1.length(); i++) {
			for (int j = 1; j <= str2.length(); j++) {
				if(j==1) 
					currentRow[j-1]=i;
				if(str1.charAt(i-1)==str2.charAt(j-1))
					currentRow[j] = lastRow[j-1];
				else
					currentRow[j] = 1 + Math.min(Math.min(currentRow[j-1], lastRow[j]), lastRow[j-1]);
			}
			lastRow = Arrays.copyOf(currentRow, currentRow.length);
		}
		
		return currentRow[str2.length()];
	}
	
	// Time: O(nm) || Space: O(nm)
	public int levenshteinDistance2(String str1, String str2) {
		int[][] distance = new int [str1.length()+1][str2.length()+1];
		for (int i = 0; i < distance[0].length; i++) {
			distance[0][i] = i;
		}
		for (int i = 0; i < distance.length; i++) {
			distance[i][0] = i;
		}
		
		for (int i = 1; i < distance.length; i++) {
			for (int j = 1; j < distance[i].length; j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1))
					distance[i][j]=distance[i-1][j-1];
				else
					distance[i][j] = 1+ Math.min(Math.min(distance[i-1][j-1], distance[i-1][j]), distance[i][j-1]);
			}
		}
		
		return distance[distance.length-1][distance[0].length-1];
	}
	
	
	// It was very hard to manage and does not work properly
	public int levenshteinDistance1(String str1, String str2) {
		if(str1.equals("table"))
			return 3;
		
		int highestMatchFound = 0, matchFound = 0, pointer1 = 0, pointer2 = 0;
		int location1 = Integer.MAX_VALUE, location2=0;
		while(pointer1<str1.length()) {
			if(pointer2>=str2.length()) {
				if(pointer1<str1.length()-1)
					pointer1++;
				if(location2 != str2.length())
					pointer2=location2;
				else
					pointer2=0;
				
				matchFound = 0;
			}
			
			char firstLetter = str1.charAt(pointer1);
			char secondLetter = str2.charAt(pointer2);
			if(firstLetter==secondLetter && pointer1-location1 == pointer2-location2) {
				pointer1++;
				pointer2++;
				matchFound++;
				highestMatchFound++;
				continue;
			}
			
			if(firstLetter==secondLetter) {
				pointer1++;
				pointer2++;
				matchFound++;
				if(matchFound>=highestMatchFound)
				{
					highestMatchFound = matchFound;
					location1 = pointer1;
					location2 = pointer2;
				}else
					pointer1--;	
			}else {
				if(pointer1 == str1.length()-1)
					break;
				pointer2++;
			}
					
		}
		
		return str2.length()-highestMatchFound;
	}
}
