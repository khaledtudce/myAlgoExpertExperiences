package algoExpertProblems.Sorting;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.Sorting.SelectionSort;

public class SelectionSortTest {

	@Test
	public void test() {
		SelectionSort obj= new SelectionSort();
		assertThat(obj.selectionSort(new int [] {8, 5, 2, 9, 5, 6, 3}))
		.isEqualTo(new int [] {2, 3, 5, 5, 6, 8, 9});	
	}

	@Test
	public void test1() {
		SelectionSort obj= new SelectionSort();
		assertThat(obj.selectionSort(new int [] {1}))
		.isEqualTo(new int [] {1});	
	}

}
