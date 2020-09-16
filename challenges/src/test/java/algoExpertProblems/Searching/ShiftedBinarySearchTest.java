package algoExpertProblems.Searching;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ShiftedBinarySearchTest {

	@Test
	public void test() {
		ShiftedBinarySearch obj = new ShiftedBinarySearch();
		assertThat(obj.shiftedBinarySearch(
				new int [] {45,61,71,72,73,0,1,21,33,37}, 33))
		.isEqualTo(8);
	}

	@Test
	public void test1() {
		ShiftedBinarySearch obj = new ShiftedBinarySearch();
		assertThat(obj.shiftedBinarySearch(
				new int [] {72, 73, 0, 1, 21, 33, 37, 45, 61, 71}, 72))
		.isEqualTo(0);
	}
}
