package algoExpertProblems.Strings;

public class PalindromeCheck {

	// Time: O(n) || O(n) where n is str length 
	public boolean isPalindrome(String str) {		
		if(str.length()<=1)
			return true;
		
	    return str.charAt(0)==str.charAt(str.length()-1) && 
	    		isPalindrome(str.substring(1, str.length()-1));
	}
	
	// Time: O(n) || O(n) where n is str length 
	public boolean isPalindrome5(String str) {
		StringBuilder newStr = new StringBuilder();
		for (int i = str.length()-1; i >= 0; i--) {
			newStr.append(str.charAt(i));
		}
	    return newStr.toString().equals(str);
	}
	
	// Time: O(n^2) || O(n) where n is str length 
	public boolean isPalindrome4(String str) {
		String newStr="";
		for (int i = str.length()-1; i >= 0; i--) {
			newStr+=str.charAt(i);
		}
	    return newStr.equals(str);
	}
	
	// Time: O(n/2) || O(1) where n is length of str
	public boolean isPalindrome3(String str) {
		int i=0, j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
	    return true;
	}
	
	// Time: O(n/2) || O(1) where n is length of str
	public boolean isPalindrome2(String str) {
		int j=str.length()-1;
		for(int i=0;i<j; i++){
			if(str.charAt(i)!=str.charAt(j))
				return false;
			j--;
		}
	    return true;
	}
	
	// Time: O(n/2) || O(1) where n is length of str
	public boolean isPalindrome1(String str) {
	    int length=str.length()%2==0 ? (str.length()/2)-1 : str.length()/2;
			int j=str.length()-1;
			for(int i=0;i<=length; i++){
				if(str.charAt(i)!=str.charAt(j))
					return false;
				j--;
			}
	    return true;
	}
}
