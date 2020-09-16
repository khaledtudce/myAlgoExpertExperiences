package algoExpertProblems.Searching;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class SearchForRangeTest {

	@Test
	public void test() {
		SearchForRange obj = new SearchForRange();
		assertThat(obj.searchForRange(new int [] 
				{0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73}, 45))
		.isEqualTo(new int[] {4,9});
	}

	@Test
	public void test1() {
		SearchForRange obj = new SearchForRange();
		assertThat(obj.searchForRange(new int [] 
				{5, 7, 7, 8, 8, 10}, 5))
		.isEqualTo(new int[] {0,0});
	}
}
