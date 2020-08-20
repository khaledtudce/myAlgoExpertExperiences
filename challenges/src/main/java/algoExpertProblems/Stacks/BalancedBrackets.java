package algoExpertProblems.Stacks;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
	
	// Time: O(n) || Space: O(n)
	public boolean balancedBrackets2(String str) {
		Stack<Character> charStack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char curChar = str.charAt(i);
			if(curChar=='(')
				charStack.push(')');
			else if(curChar=='{')
				charStack.push('}');
			else if(curChar=='[')
				charStack.push(']');
			
			if(curChar==')' || curChar=='}' || curChar==']') {
				if(!charStack.isEmpty() && curChar==charStack.pop()) {
					// do nothing
				}else
					return false;
			}		
		}
		
		return charStack.isEmpty();
	}
	
	// Time: O(n) || Space: O(n)
	public boolean balancedBrackets1(String str) {
		LinkedList<Character> list = new LinkedList<Character>();
		for (int i = 0; i < str.length(); i++) {
			char curChar = str.charAt(i);
			if(curChar=='(')
				list.addFirst(')');
			else if(curChar=='{')
				list.addFirst('}');
			else if(curChar=='[')
				list.addFirst(']');
			
			if(curChar==')' || curChar=='}' || curChar==']') {
				if(!list.isEmpty() && list.get(0)==curChar)
					list.removeFirst();
				else
					return false;
			}
		}
		
		return list.isEmpty();
	}
	
	// Time: O(n) || Space: O(n)
	public boolean balancedBrackets(String str) {
		String openBrackets = "({[";
		String closeBrackets = ")}]";
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char sign = str.charAt(i);
			if(openBrackets.indexOf(sign)!=-1)
				stack.push(sign);
			else if(closeBrackets.indexOf(sign)!=-1) {
				if(!stack.isEmpty() && stack.pop() == map.get(sign)) {
					//do nothing
				}
				else
					return false;
			}	
		}
		
		return stack.isEmpty();
	}
}































