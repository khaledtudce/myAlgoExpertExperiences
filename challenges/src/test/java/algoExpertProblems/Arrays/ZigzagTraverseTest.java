package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ZigzagTraverseTest {

	@Test
	public void test() {
		ZigzagTraverse obj = new ZigzagTraverse();
		List<List<Integer>> test = new ArrayList<List<Integer>>();
	    test.add(new ArrayList<Integer>(Arrays.asList(1, 3, 4, 10)));
	    test.add(new ArrayList<Integer>(Arrays.asList(2, 5, 9, 11)));
	    test.add(new ArrayList<Integer>(Arrays.asList(6, 8, 12, 15)));
	    test.add(new ArrayList<Integer>(Arrays.asList(7, 13, 14, 16)));
	    List<Integer> expected =
	        new ArrayList<Integer>(
	            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
	    assertThat(obj.zigzagTraverse(test)).isEqualTo(expected);	
	}
	
	@Test
	public void test1() {
		ZigzagTraverse obj = new ZigzagTraverse();
		List<List<Integer>> test = new ArrayList<List<Integer>>();
	    test.add(new ArrayList<Integer>(Arrays.asList(1, 3, 4, 10, 11)));
	    test.add(new ArrayList<Integer>(Arrays.asList(2, 5, 9, 12, 19)));
	    test.add(new ArrayList<Integer>(Arrays.asList(6, 8, 13, 18, 20)));
	    test.add(new ArrayList<Integer>(Arrays.asList(7, 14, 17, 21, 24)));
	    test.add(new ArrayList<Integer>(Arrays.asList(15, 16, 22, 23, 25)));
	    List<Integer> expected =
	        new ArrayList<Integer>(
	            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
	            	13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));
	    assertThat(obj.zigzagTraverse(test)).isEqualTo(expected);	
	}
	
	@Test
	public void test2() {
		ZigzagTraverse obj = new ZigzagTraverse();
		List<List<Integer>> test = new ArrayList<List<Integer>>();
	    test.add(new ArrayList<Integer>(Arrays.asList(1)));
	    test.add(new ArrayList<Integer>(Arrays.asList(2)));
	    test.add(new ArrayList<Integer>(Arrays.asList(3)));
	    test.add(new ArrayList<Integer>(Arrays.asList(4)));
	    List<Integer> expected =
	        new ArrayList<Integer>(
	            Arrays.asList(1, 2, 3, 4));
	    assertThat(obj.zigzagTraverse(test)).isEqualTo(expected);	
	}

	@Test
	public void test3() {
		ZigzagTraverse obj = new ZigzagTraverse();
		List<List<Integer>> test = new ArrayList<List<Integer>>();
	    test.add(new ArrayList<Integer>(Arrays.asList(1)));
	    List<Integer> expected =
	        new ArrayList<Integer>(
	            Arrays.asList(1));
	    assertThat(obj.zigzagTraverse(test)).isEqualTo(expected);	
	}
	
	@Test
	public void test4() {
		ZigzagTraverse obj = new ZigzagTraverse();
		List<List<Integer>> test = new ArrayList<List<Integer>>();
	    test.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
	    List<Integer> expected =
	        new ArrayList<Integer>(
	            Arrays.asList(1,2,3,4,5));
	    assertThat(obj.zigzagTraverse(test)).isEqualTo(expected);	
	}
}
