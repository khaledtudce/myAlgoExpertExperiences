package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class SubarraySortTest {

	@Test
	public void test() {
		SubarraySort obj= new SubarraySort();
		assertThat(obj.subarraySort(
				new int [] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}))
		.isEqualTo(new int [] {3, 9});	
	}

	@Test
	public void test1() {
		SubarraySort obj= new SubarraySort();
		assertThat(obj.subarraySort(
				new int [] { 1,2,3,4,5,6,7,8,9,
					10,11,12,13,14,15,16,17,18,19,2}))
		.isEqualTo(new int [] {2, 19});	
	}
	
	@Test
	public void test2() {
		SubarraySort obj= new SubarraySort();
		assertThat(obj.subarraySort(
				new int [] {2, 1}))
		.isEqualTo(new int [] {0,1});	
	}
	
	@Test
	public void test3() {
		SubarraySort obj= new SubarraySort();
		assertThat(obj.subarraySort(
				new int [] {4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7}))
		.isEqualTo(new int [] {0,12});	
	}
	
	@Test
	public void test4() {
		SubarraySort obj= new SubarraySort();
		assertThat(obj.subarraySort(
				new int [] {-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7}))
		.isEqualTo(new int [] {1,12});	
	}
}
