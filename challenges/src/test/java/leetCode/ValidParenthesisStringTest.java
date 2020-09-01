package leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ValidParenthesisStringTest {

	@Test
	public void test() {
		ValidParenthesisString obj = new ValidParenthesisString();
		assertThat(obj.checkValidString("()"))
		.isEqualTo(true);
	}

	@Test
	public void test1() {
		ValidParenthesisString obj = new ValidParenthesisString();
		assertThat(obj.checkValidString("(*)"))
		.isEqualTo(true);
	}
	
	@Test
	public void test2() {
		ValidParenthesisString obj = new ValidParenthesisString();
		assertThat(obj.checkValidString("(*))"))
		.isEqualTo(true);
	}
	
	@Test
	public void test4() {
		ValidParenthesisString obj = new ValidParenthesisString();
		assertThat(obj.checkValidString("((*)"))
		.isEqualTo(true);
	}
}
