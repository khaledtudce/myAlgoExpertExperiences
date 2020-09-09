package algoExpertProblems.Searching;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.Searching.FindThreeLargestNumbers;

public class FindThreeLargestNumbersTest {

	@Test
	public void test() {
		FindThreeLargestNumbers obj =  new FindThreeLargestNumbers();
		assertThat(obj.findThreeLargestNumbers(new int [] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}))
		.isEqualTo(new int [] {18,141,541});
	}

	@Test
	public void test1() {
		FindThreeLargestNumbers obj =  new FindThreeLargestNumbers();
		assertThat(obj.findThreeLargestNumbers(new int [] {-2, -1, 7}))
		.isEqualTo(new int [] {-2,-1,7});
	}
}
