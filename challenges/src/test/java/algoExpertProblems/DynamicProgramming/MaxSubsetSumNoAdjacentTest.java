package algoExpertProblems.DynamicProgramming;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.DynamicProgramming.MaxSubsetSumNoAdjacent;

public class MaxSubsetSumNoAdjacentTest {

	@Test
	public void test() {
		MaxSubsetSumNoAdjacent obj = new MaxSubsetSumNoAdjacent();
		assertThat(obj.maxSubsetSumNoAdjacent(
				new int[] {7, 10, 12, 7, 9, 14})).isEqualTo(33);
	}
	
	@Test
	public void test1() {
		MaxSubsetSumNoAdjacent obj = new MaxSubsetSumNoAdjacent();
		assertThat(obj.maxSubsetSumNoAdjacent(
				new int[] {1})).isEqualTo(1);
	}


}
