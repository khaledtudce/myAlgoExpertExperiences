package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class LongestPeakTest {

	@Test
	public void test() {
		LongestPeak obj = new LongestPeak();
		assertThat(obj.longestPeak(new int[] {1,2,3,3,4,0,10,6,5,-1,-3,2,3}))
		.isEqualTo(6);
	}

}
