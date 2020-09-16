package algoExpertProblems.Sorting;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.Sorting.QuickSort;

public class QuickSortTest {

	@Test
	public void test() {
		QuickSort obj= new QuickSort();
		assertThat(obj.quickSort(new int [] {8, 5, 2, 9, 5, 6, 3}))
		.isEqualTo(new int [] {2, 3, 5, 5, 6, 8, 9});	
	}

	@Test
	public void test1() {
		QuickSort obj= new QuickSort();
		assertThat(obj.quickSort(new int [] {1}))
		.isEqualTo(new int [] {1});	
	}
	
	@Test
	public void test2() {
		QuickSort obj= new QuickSort();
		assertThat(obj.quickSort(new int [] {2,1}))
		.isEqualTo(new int [] {1,2});	
	}
	
	@Test
	public void test3() {
		QuickSort obj= new QuickSort();
		assertThat(obj.quickSort(new int [] {-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8}))
		.isEqualTo(new int [] {-10, -10, -9, -7, -7, -6, -5, -2, 2, 2, 3, 3, 4, 5, 8, 8, 9, 10});	
	}
}
