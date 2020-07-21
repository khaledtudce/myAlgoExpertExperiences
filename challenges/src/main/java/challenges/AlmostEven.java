package challenges;

import java.util.ArrayList;
import java.util.List;

public class AlmostEven {

	public List<Integer> splitInteger(int i, int j) {
		
		if(i%j == 0)
			return equalResult(i, j);
		else 
			return dynamicResult(i, j);
	}

	private List<Integer> dynamicResult(int i, int j) {
		List<Integer> result = new ArrayList<Integer>();
		int divide = i/j;
		int modResultLeft = i%j;
		
		for(int p=0; p<j; p++) {
			int whatToAdd = divide;
			if(p>= (j-modResultLeft))
				whatToAdd++;
			
			result.add(whatToAdd);
		}
		
		return result;
	}

	private List<Integer> equalResult(int i, int j) {
		List<Integer> result = new ArrayList<Integer>();
		int divide = i/j;
		
		for(int p=0; p<j; p++) {
			result.add(divide);
		}
		
		return result;
	}

}
