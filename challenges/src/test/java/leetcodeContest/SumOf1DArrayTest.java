package leetcodeContest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

import algoExpertProblems.Arrays.LargestRange;

public class SumOf1DArrayTest {

	@Test
	public void test() {
		SumOf1DArray obj = new SumOf1DArray();
		assertThat(obj.runningSum(new int[] {1,2,3,4}))
		.isEqualTo(new int[] {1,3,6,10});
	}
	
	@Test
	public void test1() {
		SumOf1DArray obj = new SumOf1DArray();
		assertThat(obj.runningSum(new int[] {1,1,1,1,1}))
		.isEqualTo(new int[] {1,2,3,4,5});
	}
	
	@Test
	public void test2() {
		SumOf1DArray obj = new SumOf1DArray();
		assertThat(obj.runningSum(new int[] {3,1,2,10,1}))
		.isEqualTo(new int[] {3,4,6,16,17});
	}

}
