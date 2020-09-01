package algoExpertProblems.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Powerset {
	
	// Time: O(n*2^n) || Space: O(n*2^n)
	public static List<List<Integer>> powerset(List<Integer> array) {
		return powersets(array, array.size()-1);
	}
	
	private static List<List<Integer>> powersets(List<Integer> array, int i) {
		if(i<0) { 
			List<List<Integer>> emptySet = new ArrayList<List<Integer>>();
			emptySet.add(new ArrayList<Integer>());
			return emptySet; 
		}
			
		int element = array.get(i);
		List<List<Integer>> powersets = powersets(array, i-1);
		int powersetSize = powersets.size();
		for (int j=0; j<powersetSize; j++) {
			List<Integer> powerset = new ArrayList<Integer>(powersets.get(j));
			powerset.add(element);
			powersets.add(powerset);
		}
		
		return powersets;
	}



	// Time: O(n*2^n) || Space: O(n*2^n)
	public static List<List<Integer>> powerset2(List<Integer> array) {
		List<List<Integer>> powersets = new ArrayList<List<Integer>>();
		powersets.add(new ArrayList<Integer>());
		
		for (int element : array) {
			int powersetSize = powersets.size();
			for (int i = 0; i < powersetSize; i++) {
				List<Integer> powerset = new ArrayList<Integer>(powersets.get(i));
				powerset.add(element);
				powersets.add(powerset);
			}
		}
		
		return powersets;
	}
	
	// Time: O(n^2*n!) || Space: O(n*n!)
	public static List<List<Integer>> powerset1(List<Integer> array) {
		List<List<Integer>> powersets = new ArrayList<List<Integer>>();
		getRecursivePowersets(array, powersets);
		return powersets;
	}

	private static void getRecursivePowersets(List<Integer> array, List<List<Integer>> powersets) {
		if(!powersets.contains(array))
			powersets.add(array);
		for (int i = 0; i < array.size(); i++) {
			List<Integer> newArray = new ArrayList<Integer>(array);
			newArray.remove(i);
			getRecursivePowersets(newArray, powersets);
		}
	}
}
