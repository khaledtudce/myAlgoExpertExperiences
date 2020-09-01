package algoExpertProblems.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	// Upper bound: O(n*n!) || Space: O(n*n!)
	public List<List<Integer>> getPermutations(List<Integer> array) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		getPermutation(0, array, permutations);
		return permutations;
	}
	
	private void getPermutation(int i, List<Integer> array, List<List<Integer>> permutations) {
		if(i==array.size()-1) 
			permutations.add(new ArrayList<Integer>(array));
		else {
			for (int j = i; j < array.size(); j++) {
				swap(array, i, j);
				getPermutation(i+1, array, permutations);
				swap(array, i, j);
			}
		}
	}
	
	private void swap(List<Integer> array, int i, int j) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}

	
	// Upper bound: O(n^2*n!) || Space: O(n*n!)
	public List<List<Integer>> getPermutations2(List<Integer> array) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		getPermutation2(array, new ArrayList<Integer>(), permutations);
		
		return permutations;
	}
	
	// Its kind of two loops here, one for loop and one recursive call
	private void getPermutation2(List<Integer> array, List<Integer> permutation, List<List<Integer>> permutations) {
		if(array.size()==0 && permutation.size()>0)
			permutations.add(permutation);
		else {
			for (int i = 0; i < array.size(); i++) {
				List<Integer> newArray = new ArrayList<Integer>(array);
				newArray.remove(i);
				List<Integer> newPermutation = new ArrayList<Integer>(permutation);
				newPermutation.add(array.get(i));
				getPermutation2(newArray, newPermutation, permutations);
			}
		}		
	}


	
	// does not work
	public List<List<Integer>> getPermutations1(List<Integer> array) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(array.isEmpty())
			return result;
		
		if(array.size()<2) {
			result.add(array);
			return result;
		}
		
		for (int i = 0; i < array.size(); i++) {
			List<Integer> innerResult = new ArrayList<Integer>();
			innerResult.add(array.get(i));
			for (int j = 0; j < array.size(); j++) {
				if(i==j) continue;
				innerResult.add(array.get(j));
			}
			result.add(innerResult);
			
			if(array.size()==2)
				continue;
			
			innerResult = new ArrayList<Integer>();
			innerResult.add(array.get(i));
			for (int j = array.size()-1; j >= 0; j--) {
				if(i==j) continue;
				innerResult.add(array.get(j));
			}
			result.add(innerResult);
		}
		
		return result;
	}
}
