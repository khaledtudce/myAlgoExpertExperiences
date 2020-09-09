package algoExpertProblems.DynamicProgramming;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.DynamicProgramming.MinNumberOfJumps;

public class MinNumberOfJumpsTest {
	
	@Test
	public void test() {
		MinNumberOfJumps obj = new MinNumberOfJumps();
		assertThat(obj.minNumberOfJumps(new int [] 
		{3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3})).isEqualTo(4);	
	}

	@Test
	public void test1() {
		MinNumberOfJumps obj = new MinNumberOfJumps();
		assertThat(obj.minNumberOfJumps(new int [] 
		{1, 1})).isEqualTo(1);	
	}
	
	@Test
	public void test2() {
		MinNumberOfJumps obj = new MinNumberOfJumps();
		assertThat(obj.minNumberOfJumps(new int [] 
		{1})).isEqualTo(0);	
	}
	
	@Test
	public void test3() {
		MinNumberOfJumps obj = new MinNumberOfJumps();
		assertThat(obj.minNumberOfJumps(new int [] 
		{2, 1, 2, 3, 1})).isEqualTo(2);	
	}
}
