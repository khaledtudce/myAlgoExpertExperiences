package algoExpertProblems.Strings;

public class CaesarCypherEncryptor {
	
	// Time: O(n) || Space: O(n)
	public String caesarCypherEncryptor(String str, int key) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			key = key % 26;
			int totalAscii = (int) str.charAt(i) + key;
			if(totalAscii<=122)
				builder = builder.append((char)(totalAscii));
			else {
				int diff = totalAscii - 122;
				builder = builder.append((char)(96+diff));
			}
		}
		
		return builder.toString();
	}
	
	// Time: O(n+k) || Space: O(n) where k is key of mulpliable by 26 
	public String caesarCypherEncryptor2(String str, int key) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int totalAscii = (int) str.charAt(i) + key;
			if(totalAscii<=122)
				builder = builder.append((char)(totalAscii));
			else {
				int diff = totalAscii - 122;
				while(diff>26) diff = diff - 26;
				builder = builder.append((char)(96+diff));
			}
		}
		
		return builder.toString();
	}
	
	// Time: O(n^2) || Space: O(n)
	public String caesarCypherEncryptor1(String str, int key) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int totalAscii = (int) str.charAt(i)+key;
			if(totalAscii<=122)
				result = result + (char)(totalAscii);
			else {
				int diff = totalAscii - 122;
				while(diff>26) diff = diff - 26;
				result = result + (char)(96+diff);
			}
		}
		return result;
	}
}
