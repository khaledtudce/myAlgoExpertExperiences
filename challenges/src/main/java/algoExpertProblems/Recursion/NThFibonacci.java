package algoExpertProblems.Recursion;

import java.util.HashMap;
import java.util.Map;

public class NThFibonacci {
	
	//	O(n) time | O(1) space
	public int getNthFib3(int n) {
		int[] holder = {0, 1};
		int counter = 3;
		while(counter<=n) {
			int next = holder[0] + holder[1];
			holder[0] = holder[1];
			holder[1] = next;
			counter++;
		}
		
		return n > 1 ? holder[1] : holder[0];
	}
	
	
	//	O(n) time | O(n) space
	public int getNthFib2(int n) {
		Map<Integer, Integer> memorize = new HashMap<Integer, Integer>();
		
		if(n==2) {
			return 1;
		}
		
		if(n==1) {
			return 0;
		}
		
		if(memorize.containsKey(n))
			return memorize.get(n);
		else{
			memorize.put(n, getNthFib(n-1) + getNthFib(n-2));
			return memorize.get(n);
		}
	}
	
	//	O(2^n) time | O(n) space
	public int getNthFib(int n) {
		if(n==2) {
			return 1;
		}
		
		if(n==1) {
			return 0;
		}
		
		return getNthFib(n-1) + getNthFib(n-2);
	}
}
