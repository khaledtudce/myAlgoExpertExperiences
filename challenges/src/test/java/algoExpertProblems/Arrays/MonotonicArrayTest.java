package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MonotonicArrayTest {

	@Test
	public void test() {
		MonotonicArray obj = new MonotonicArray();
		assertThat(obj.isMonotonic(new int[] {-1,-5,-10,-1100,-1101,-1102,-9001 }))
		.isEqualTo(true);	
	}

	@Test
	public void test1() {
		MonotonicArray obj = new MonotonicArray();
		assertThat(obj.isMonotonic(new int[] {-1, 5,-10,-1100,-1101,-1102,-9001 }))
		.isEqualTo(false);	
	}
}
