package leetCode;

public class ReverseString {

	
	public char[] reverseString(char[] input) {
		for (int i=input.length-1; i>=input.length/2; i--) {
			char temp = input[(input.length-1)-i];
			input[(input.length-1)-i] = input[i];
			input[i] = temp;
		}
		
		return input;
	}

	public char[] reverseString1(char[] input) {
		char[] output = new char[input.length];
		for (int i=input.length-1; i>=0; i--) {
			output[(input.length-1)-i] = input[i];
		}
		
		return output;
	}
}
