package challenges;

public class StringSimpleRevarsal {
	
	// Time: O(n) || Space: O(n)
	public String getStringReversal(String str) {
		StringBuilder result = new StringBuilder();
		String trimStr = str.replaceAll(" ","");
		int trimPtr = trimStr.length()-1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				result.append(" ");
			else {
				result.append(trimStr.charAt(trimPtr));
				trimPtr--;
			}
		}
		
		return result.toString();
	}
}
