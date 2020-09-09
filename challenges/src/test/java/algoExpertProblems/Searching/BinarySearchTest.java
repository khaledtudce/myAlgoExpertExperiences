package algoExpertProblems.Searching;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.Searching.BinarySearch;

public class BinarySearchTest {

	@Test
	public void test() {
		BinarySearch obj = new BinarySearch();
		assertThat(obj.binarySearch(new int [] 
		{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33)).isEqualTo(3);	
	}
	
	@Test
	public void test1() {
		BinarySearch obj = new BinarySearch();
		assertThat(obj.binarySearch(new int [] 
		{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 35)).isEqualTo(-1);	
	}

}
