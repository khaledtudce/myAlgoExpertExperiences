package algoExpertProblems.DynamicProgramming;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.DynamicProgramming.NumberOfWaysToMakeCoinChange;

public class NumberOfWaysToMakeCoinChangeTest {

	@Test
	public void test() {
		NumberOfWaysToMakeCoinChange obj = new NumberOfWaysToMakeCoinChange();
		assertThat(obj.numberOfWaysToMakeChange(10, new int [] 
				{1, 5, 10, 25})).isEqualTo(4);	
	}
}
