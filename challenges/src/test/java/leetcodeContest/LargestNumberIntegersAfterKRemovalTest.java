package leetcodeContest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LargestNumberIntegersAfterKRemovalTest {
	
	@Test
	public void test() {
		LargestNumberIntegersAfterKRemoval obj = new LargestNumberIntegersAfterKRemoval();
		assertThat(obj.findLeastNumOfUniqueInts(new int[] {5,5,4}, 1))
		.isEqualTo(1);
	}

	@Test
	public void test1() {
		LargestNumberIntegersAfterKRemoval obj = new LargestNumberIntegersAfterKRemoval();
		assertThat(obj.findLeastNumOfUniqueInts(new int[] {4,3,1,1,3,3,2}, 3))
		.isEqualTo(2);
	}
	
	@Test
	public void test2() {
		LargestNumberIntegersAfterKRemoval obj = new LargestNumberIntegersAfterKRemoval();
		assertThat(obj.findLeastNumOfUniqueInts(new int[] {2,1,1,3,3,3}, 3))
		.isEqualTo(1);
	}

}
