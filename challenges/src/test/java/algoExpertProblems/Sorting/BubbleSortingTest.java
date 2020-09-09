package algoExpertProblems.Sorting;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.Sorting.BubbleSorting;

public class BubbleSortingTest {

	@Test
	public void test() {
		BubbleSorting obj= new BubbleSorting();
		assertThat(obj.bubbleSort(new int [] {8, 5, 2, 9, 5, 6, 3}))
		.isEqualTo(new int [] {2, 3, 5, 5, 6, 8, 9});	
	}

	@Test
	public void test1() {
		BubbleSorting obj= new BubbleSorting();
		assertThat(obj.bubbleSort(new int [] {1}))
		.isEqualTo(new int [] {1});	
	}
	
	@Test
	public void test2() {
		BubbleSorting obj= new BubbleSorting();
		assertThat(obj.bubbleSort(new int [] {-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8}))
		.isEqualTo(new int [] {-10, -10, -9, -7, -7, -6, -5, -2, 2, 2, 3, 3, 4, 5, 8, 8, 9, 10});	
	}
}
