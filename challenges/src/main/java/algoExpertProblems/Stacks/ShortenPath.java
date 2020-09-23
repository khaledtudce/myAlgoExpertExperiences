package algoExpertProblems.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ShortenPath {
	
	// Time: O(n) || Space: O(n)
	public String shortenPath1(String path) {
		List<String> pathParts = Arrays.asList(path.split("/"));
		pathParts=pathParts.stream().filter(token -> (token.length()>0 && !token.equals(".")))
				.collect(Collectors.toList());
		Stack<String> stack = new Stack<String>();
		if(path.charAt(0)=='/')
			stack.push("");
		for (int i = 0; i < pathParts.size(); i++) {
			if(pathParts.get(i).equals("..")) {
				if(stack.isEmpty() || stack.lastElement().equals(".."))
					stack.push(pathParts.get(i));
				else if(!stack.lastElement().equals(""))
					stack.pop();
			}else
				stack.push(pathParts.get(i));
		}
		if(stack.size()==1 && stack.get(0).equals(""))
			return "/";
		
		return String.join("/", stack);
	}


	// Time: O(n) || Space: O(n)
	public String shortenPath(String path) {
		String[] pathParts = path.split("/");
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < pathParts.length; i++) {
			if(!(pathParts[i].equals(".")||pathParts[i].equals("") || 
					pathParts[i].equals(".."))) {
				stack.push(pathParts[i]);
				continue;
			}
			
			if(pathParts[i].equals("..")) {
				if(!stack.isEmpty() && !stack.lastElement().equals(".."))
					stack.pop();
				else
					stack.push(pathParts[i]);
			}
		}
		
		while(path.charAt(0)=='/' && !stack.isEmpty() && stack.get(0).equals(".."))
			stack.remove(0);
		
		StringBuilder result = new StringBuilder();
		getResultPath(path, stack, result);
		
		return result.length()==0 ? "/" : result.toString();
	}

	private void getResultPath(String path, Stack<String> stack, StringBuilder result) {
		if(!stack.isEmpty() && path.charAt(0)!='/') {
			result.append(stack.get(0));
			stack.remove(0);
		}
		for (String string : stack) {
			result.append("/" + string);
		}
	}
}
