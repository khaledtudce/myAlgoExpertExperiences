package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class MinRewardsTest {

	@Test
	public void test() {
		MinRewards obj = new MinRewards();
		assertThat(obj.minRewards(
				new int [] {8, 4, 2, 1, 3, 6, 7, 9, 5}))
		.isEqualTo(25);	
	}

	@Test
	public void test1() {
		MinRewards obj = new MinRewards();
		assertThat(obj.minRewards(
				new int [] {0, 4, 2, 1, 3}))
		.isEqualTo(9);	
	}
	
	@Test
	public void test2() {
		MinRewards obj = new MinRewards();
		assertThat(obj.minRewards(
				new int [] {5, 10}))
		.isEqualTo(3);	
	}
	
	@Test
	public void test3() {
		MinRewards obj = new MinRewards();
		assertThat(obj.minRewards(
				new int [] {10, 5}))
		.isEqualTo(3);	
	}
	
	@Test
	public void test4() {
		MinRewards obj = new MinRewards();
		assertThat(obj.minRewards(
		new int [] {800,400,20,10,30,61,70,90,
		17,21,22,13,12,11,8,4,2,1,3,6,7,9,0,
		68,55,67,57,60,51,661,50,65,53}))
		.isEqualTo(93);	
	}
	
}
