package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.Test;

public class FourNumberSumsTest {

	@Test
	public void test() {
		FourNumberSums obj = new FourNumberSums();
		List<Integer[]> result = obj.fourNumberSum(
				new int[] {7,6,4,-1,1,2}, 16);
		assertThat(result.get(0)).isEqualTo(new Integer [] {7,6,4,-1});	
		assertThat(result.get(1)).isEqualTo(new Integer [] {7,6,1,2});
		
	}

}
