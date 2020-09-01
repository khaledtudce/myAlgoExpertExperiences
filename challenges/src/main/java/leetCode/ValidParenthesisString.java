package leetCode;

import java.util.Stack;

public class ValidParenthesisString {
	
	public boolean checkValidString(String s) {
        Stack<Character> chars = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if(letter == '*') {
				if(chars.get(chars.size()-1)=='(')
					chars.pop();
				else
					chars.push(letter);
			}
			if(letter=='(') {
				chars.push(letter);
				break;
			}
			if(letter==')') {
				if(chars.isEmpty())
					return false;
				char topChar = chars.pop();
				if(!(topChar=='(' || topChar=='*'))
					return false;
			}
		}
		
		return true;
    }
}
