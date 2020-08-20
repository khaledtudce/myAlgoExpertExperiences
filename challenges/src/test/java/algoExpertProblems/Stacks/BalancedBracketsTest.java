package algoExpertProblems.Stacks;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class BalancedBracketsTest {

	@Test
	public void test() {
		BalancedBrackets obj = new BalancedBrackets();
		assertThat(obj.balancedBrackets("([])(){}(())()()"))
		.isEqualTo(true);
	}
	
	@Test
	public void test1() {
		BalancedBrackets obj = new BalancedBrackets();
		assertThat(obj.balancedBrackets("()()[{()})]"))
		.isEqualTo(false);
	}

	@Test
	public void test2() {
		BalancedBrackets obj = new BalancedBrackets();
		assertThat(obj.balancedBrackets("()[]{}{"))
		.isEqualTo(false);
	}
	
	@Test
	public void test3() {
		BalancedBrackets obj = new BalancedBrackets();
		assertThat(obj.balancedBrackets(")[]}"))
		.isEqualTo(false);
	}
}
