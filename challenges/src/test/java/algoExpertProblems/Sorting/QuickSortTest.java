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

}
