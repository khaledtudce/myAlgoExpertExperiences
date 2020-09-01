package algoExpertProblems.Recursion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PermutationTest {

	// need to write a documents for this new interesting things for test writing
	@Test
	public void test() {
		Permutation obj =  new Permutation();
		List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
	    List<List<Integer>> perms = obj.getPermutations(input);
	    assertTrue(perms.size() == 6);
	    
	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2, 3))));
	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 3, 2))));
	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1, 3))));
	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 3, 1))));
	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 1, 2))));
	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 2, 1))));
	}
	
	@Test
	public void test1() {
		Permutation obj =  new Permutation();
		List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
	    List<List<Integer>> perms = obj.getPermutations(input);
	    assertTrue(perms.size() == 16);
	    
//	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2))));
//	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1))));
	}
	
	@Test
	public void test2() {
		Permutation obj =  new Permutation();
		List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2));
	    List<List<Integer>> perms = obj.getPermutations(input);
	    assertTrue(perms.size() == 2);
	    
	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2))));
	    assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1))));
	}
	
	public boolean contains(List<List<Integer>> arr1, List<Integer> arr2) {
		for (List<Integer> subArray : arr1) {
			if (subArray.equals(arr2)) {
				return true;
			}
		}
		return false;
	}

}
