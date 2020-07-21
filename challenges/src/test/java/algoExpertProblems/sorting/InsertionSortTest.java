package algoExpertProblems.sorting;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void test() {
		InsertionSort obj= new InsertionSort();
		assertThat(obj.insertionSort(new int [] {8, 5, 2, 9, 5, 6, 3}))
		.isEqualTo(new int [] {2, 3, 5, 5, 6, 8, 9});	
	}

	@Test
	public void test1() {
		InsertionSort obj= new InsertionSort();
		assertThat(obj.insertionSort(new int [] {1}))
		.isEqualTo(new int [] {1});	
	}

}
