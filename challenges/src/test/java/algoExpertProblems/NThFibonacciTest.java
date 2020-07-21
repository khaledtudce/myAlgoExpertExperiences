package algoExpertProblems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NThFibonacciTest {

	@Test
	public void test() {
		NThFibonacci obj = new NThFibonacci();
		
//		0 1 1 2 3 5 8 13 21 34
//		1 2 3 4 5 6 7 8  9	10

		assertThat(obj.getNthFib3(1)).isEqualTo(0);
		assertThat(obj.getNthFib3(2)).isEqualTo(1);
		assertThat(obj.getNthFib3(3)).isEqualTo(1);
		assertThat(obj.getNthFib3(4)).isEqualTo(2);
		assertThat(obj.getNthFib3(5)).isEqualTo(3);
		assertThat(obj.getNthFib3(6)).isEqualTo(5);
		assertThat(obj.getNthFib3(8)).isEqualTo(13);
		
		assertThat(obj.getNthFib2(6)).isEqualTo(5);
		assertThat(obj.getNthFib2(7)).isEqualTo(8);
		
		assertThat(obj.getNthFib(6)).isEqualTo(5);
		assertThat(obj.getNthFib(7)).isEqualTo(8);
	}
}
