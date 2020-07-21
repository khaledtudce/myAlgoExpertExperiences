package algoExpertProblems.sorting;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void test() {
		MergeSort obj= new MergeSort();
		assertThat(obj.mergeSort(new int [] {8, 5, 2, 9, 5, 6, 3}))
		.isEqualTo(new int [] {2, 3, 5, 5, 6, 8, 9});	
	}

	@Test
	public void test1() {
		MergeSort obj= new MergeSort();
		assertThat(obj.mergeSort(new int [] {1}))
		.isEqualTo(new int [] {1});	
	}
}
