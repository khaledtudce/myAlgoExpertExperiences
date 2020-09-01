package dataStructures;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class NFactorialTest {

	@Test
	public void test() {
		NFactorial obj = new NFactorial();
		assertThat(obj.nFactorial(3)).isEqualTo(6);
	}
	
	@Test
	public void test1() {
		NFactorial obj = new NFactorial();
		assertThat(obj.nFactorial(5)).isEqualTo(120);
	}

}
