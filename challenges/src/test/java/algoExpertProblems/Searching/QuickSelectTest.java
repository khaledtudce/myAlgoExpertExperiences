package algoExpertProblems.Searching;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class QuickSelectTest {

	@Test
	public void test() {
		QuickSelect obj = new QuickSelect();
		assertThat(obj.quickselect1(new int [] 
				{8, 5, 2, 9, 7, 6, 3}, 3)).isEqualTo(5);
	}

	@Test
	public void test1() {
		QuickSelect obj = new QuickSelect();
		assertThat(obj.quickselect(new int [] 
				{8, 3, 2, 5, 1, 7, 4, 6}, 2))
		.isEqualTo(2);
	}
	
	@Test
	public void test2() {
		QuickSelect obj = new QuickSelect();
		assertThat(obj.quickselect(new int [] 
				{8, 3, 2, 5, 1, 7, 4, 6}, 3))
		.isEqualTo(3);
	}
	
	@Test
	public void test3() {
		QuickSelect obj = new QuickSelect();
		assertThat(obj.quickselect(new int [] 
				{1}, 1))
		.isEqualTo(1);
	}
	
	@Test
	public void test4() {
		QuickSelect obj = new QuickSelect();
		assertThat(obj.quickselect(new int [] 
				{-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8}, 9))
		.isEqualTo(2);
	}
}
