package algoExpertProblems.Searching;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.Searching.SearchInSortedMatrix;

public class SearchInSortedMatrixTest {

	@Test
	public void test() {
		SearchInSortedMatrix obj = new SearchInSortedMatrix();
		int[][] matrix = {
				{1, 4, 7, 12, 15, 1000},
				{2, 5, 19, 31, 32, 1001},
				{3, 8, 24, 33, 35, 1002},
				{40, 41, 42, 44, 45, 1003},
				{99, 100, 103, 106, 128, 1004},
		};
		
		assertThat(obj.searchInSortedMatrix(matrix, 44))
		.isEqualTo(new int [] {3,3});
	}
	
	@Test
	public void test1() {
		SearchInSortedMatrix obj = new SearchInSortedMatrix();
		int[][] matrix = {
				{1, 4, 7, 12, 15, 1000},
			    {2, 5, 19, 31, 32, 1001},
			    {3, 8, 24, 33, 35, 1002},
			    {40, 41, 42, 44, 45, 1003},
			    {99, 100, 103, 106, 128, 1004}
		};
		
		assertThat(obj.searchInSortedMatrix(matrix, 128))
		.isEqualTo(new int [] {4,4});
	}

	@Test
	public void test2() {
		SearchInSortedMatrix obj = new SearchInSortedMatrix();
		int[][] matrix = {
				{1, 4, 7, 12, 15, 1000},
			    {2, 5, 19, 31, 32, 1001},
			    {3, 8, 24, 33, 35, 1002},
			    {40, 41, 42, 44, 45, 1003},
			    {99, 100, 103, 106, 128, 1004}
		};
		
		assertThat(obj.searchInSortedMatrix(matrix, 97))
		.isEqualTo(new int [] {-1,-1});
	}

}
