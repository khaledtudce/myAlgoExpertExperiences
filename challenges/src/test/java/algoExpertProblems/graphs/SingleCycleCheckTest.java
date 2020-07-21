package algoExpertProblems.graphs;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class SingleCycleCheckTest {

	@Test
	public void test() {
		SingleCycleCheck obj = new SingleCycleCheck();
		assertThat(obj.hasSingleCycle(new int[] {2,3,1,-4,-4,2}))
		.isEqualTo(true);
	}

	@Test
	public void test1() {
		SingleCycleCheck obj = new SingleCycleCheck();
		assertThat(obj.hasSingleCycle(new int[] {0, 1, 1, 1, 1}))
		.isEqualTo(false);
	}
	
	@Test
	public void test2() {
		SingleCycleCheck obj = new SingleCycleCheck();
		assertThat(obj.hasSingleCycle(new int[] {1, 1, 0, 1, 1}))
		.isEqualTo(false);
	}
	
	@Test
	public void test3() {
		SingleCycleCheck obj = new SingleCycleCheck();
		assertThat(obj.hasSingleCycle(new int[] {3, 5, 5, -5, -2, -5, -12, -2, -1, 2, -6, 1, 1, 2, -5, 2}))
		.isEqualTo(false);
	}
	
	@Test
	public void test4() {
		SingleCycleCheck obj = new SingleCycleCheck();
		assertThat(obj.hasSingleCycle(new int[] {1, 2, 3, 4, -2, 3, 7, 8, -26}))
		.isEqualTo(true);
	}
}
