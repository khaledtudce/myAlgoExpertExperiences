package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class TwoNumberSumsTest {

	@Test
	public void test() {
		TwoNumberSums obj = new TwoNumberSums();
		
		assertThat(obj.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10))
		.isEqualTo(new Integer [] {-1, 11});
	}
}
