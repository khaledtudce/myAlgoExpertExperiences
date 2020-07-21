package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class SmallestDifferenceTest {

	@Test
	public void test() {
		SmallestDifference obj = new SmallestDifference();
		assertThat(obj.smallestDifference(new int[] {-1,5,10,20,28,3},
				new int[] {26,134,135,15,17})).isEqualTo(new int[] {28,26});
	}
	
	@Test
	public void test1() {
		SmallestDifference obj = new SmallestDifference();
		assertThat(obj.smallestDifference(new int[] {10,0,20,25,2200},
				new int[] {1005,1006,1014,1032,1031}))
		.isEqualTo(new int[] {25,1005});
	}

}
