package algoExpertProblems.Strings;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GroupAnagramsTest {

	// here docu
	@Test
	public void test() {
		GroupAnagrams obj = new GroupAnagrams();
		List<List<String>> results = obj.groupAnagrams(new ArrayList<String>(
				Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp")));

	    assertTrue(contains(results, new ArrayList<String>(Arrays.asList("yo", "oy"))));
	    assertTrue(contains(results, new ArrayList<String>(Arrays.asList("flop", "olfp"))));
	    assertTrue(contains(results, new ArrayList<String>(Arrays.asList("act", "tac", "cat"))));
	    assertTrue(contains(results, new ArrayList<String>(Arrays.asList("foo"))));
	}

	public boolean contains(List<List<String>> arr1, List<String> arr2) {
		for (List<String> subArray : arr1) {
			if (subArray.equals(arr2)) {
				return true;
			}
		}
		return false;
	}
}
