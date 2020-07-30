package algoExpertProblems.dynamicProgramming;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class MinNumberOfCoinForChangeTest {

	@Test
	public void test5() {
		MinNumberOfCoinForChange obj = new MinNumberOfCoinForChange();
		assertThat(obj.minNumberOfCoinsForChange(10, new int [] 
				{1, 3, 4})).isEqualTo(3);	
	}
	
	@Test
	public void test4() {
		MinNumberOfCoinForChange obj = new MinNumberOfCoinForChange();
		assertThat(obj.minNumberOfCoinsForChange(135, new int [] 
				{39, 45, 130, 40, 4, 1, 60, 75})).isEqualTo(2);	
	}
	
	@Test
	public void test() {
		MinNumberOfCoinForChange obj = new MinNumberOfCoinForChange();
		assertThat(obj.minNumberOfCoinsForChange(7, new int [] 
				{1,5,10})).isEqualTo(3);	
	}

	@Test
	public void test1() {
		MinNumberOfCoinForChange obj = new MinNumberOfCoinForChange();
		assertThat(obj.minNumberOfCoinsForChange(0, new int [] 
				{1, 2, 3})).isEqualTo(0);	
	}
	
	
	@Test
	public void test2() {
		MinNumberOfCoinForChange obj = new MinNumberOfCoinForChange();
		assertThat(obj.minNumberOfCoinsForChange(7, new int [] 
				{2, 4})).isEqualTo(-1);	
	}
	
	@Test
	public void test3() {
		MinNumberOfCoinForChange obj = new MinNumberOfCoinForChange();
		assertThat(obj.minNumberOfCoinsForChange(9, new int [] 
				{3, 5})).isEqualTo(3);	
	}
}
