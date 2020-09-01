package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public List<Integer> fibonacci(int length) {
		List<Integer> result = new ArrayList<Integer>();
		result.add(0);
		result.add(1);
		return getFibonacci(length, result);
	}

	private List<Integer> getFibonacci(int length, List<Integer> result) {
		if(result.get(result.size()-1)>length)
			return result;
		
		result.add(result.get(result.size()-1)+result.get(result.size()-2));
		return getFibonacci(length-1, result);
	}
}
