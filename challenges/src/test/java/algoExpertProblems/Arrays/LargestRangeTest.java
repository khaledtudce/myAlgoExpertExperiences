package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

import algoExpertProblems.Arrays.LargestRange;

public class LargestRangeTest {

	@Test
	public void test() {
		LargestRange obj = new LargestRange();
		assertThat(obj.largestRange(new int[] {1,11,3,0,15,5,2,4,10,7,12,6}))
		.isEqualTo(new int[] {0,7});
	}
	
	@Test
	public void test1() {
		LargestRange obj = new LargestRange();
		assertThat(obj.largestRange(new int[] {8, 4, 2, 10, 3, 6, 7, 9, 1}))
		.isEqualTo(new int[] {6,10});
	}
	
	@Test
	public void test2() {
		LargestRange obj = new LargestRange();
		assertThat(obj.largestRange(new int[] {1,2}))
		.isEqualTo(new int[] {1,2});
	}
	
	@Test
	public void test3() {
		LargestRange obj = new LargestRange();
		assertThat(obj.largestRange(new int[] {19,-1,18,17,2,10,3,12,5,16,4,11,
			    8,7,6,15,12,12,2,1,6,13,14}))
		.isEqualTo(new int[] {10,19});
	}
	
	@Test
	public void test4() {
		LargestRange obj = new LargestRange();
		assertThat(obj.largestRange(new int[] {1, 1, 1, 3, 4}))
		.isEqualTo(new int[] {3, 4});
	}
	
	@Test
	public void test5() {
		LargestRange obj = new LargestRange();
		assertThat(obj.largestRange(new int[] {1}))
		.isEqualTo(new int[] {1, 1});
	}


}
