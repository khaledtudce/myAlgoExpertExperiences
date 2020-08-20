package algoExpertProblems.Strings;

public class LongestPalindromeSubstring {
	
	// Time: O(n^2) || Space: O(1)
	public String longestPalindromicSubstring1(String str) {
		String biggestPalindrome = Character.toString(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i-1)==str.charAt(i)) 
				biggestPalindrome = getLongestPalindrome(str, biggestPalindrome, i-1, i);	
			
			if(i<str.length()-1 && str.charAt(i-1)==str.charAt(i+1)) 
				biggestPalindrome = getLongestPalindrome(str, biggestPalindrome, i-1, i+1);	
		}
		
		return biggestPalindrome;
	}

	private String getLongestPalindrome(String str, String biggestPalindrome, int leftP, int rightP) {
		while(leftP>=0 && rightP<str.length() && str.charAt(leftP)==str.charAt(rightP)) {
			leftP--;
			rightP++;
		}
		if(biggestPalindrome.length()<rightP-(leftP+1))
			biggestPalindrome = str.substring(leftP+1, rightP);
		
		return biggestPalindrome;
	}
	
	
	// Time: O(n^3) || Space: O(1)
	public String longestPalindromicSubstring(String str) {
		String biggestPalindrome = Character.toString(str.charAt(0));
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String subStr = str.substring(i,j);
				if(isPalindrome(subStr) && subStr.length()>biggestPalindrome.length())
					biggestPalindrome=subStr;
			}
		}
		
		return biggestPalindrome;
	}

	private boolean isPalindrome(String str) {
		int j=str.length()-1;
		for(int i=0;i<j; i++){
			if(str.charAt(i)!=str.charAt(j))
				return false;
			j--;
		}
	    return true;
	}
}
