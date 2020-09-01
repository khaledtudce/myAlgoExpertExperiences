package dataStructures;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		Fibonacci obj = new Fibonacci();
		assertThat(obj.fibonacci(10)).isEqualTo(Arrays.asList(0,1,1,2,3,5,8));
	}
	
	@Test
	public void test1() {
		Fibonacci obj = new Fibonacci();
		assertThat(obj.fibonacci(25)).isEqualTo(Arrays.asList(0,1,1,2,3,5,8,13,21));
	}

}
