package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.Test;

public class ThreeNumberSumsTest {

	@Test
	public void test() {
		ThreeNumberSums obj = new ThreeNumberSums();
		List<Integer[]> result = obj.threeNumberSum(
				new int[] {12,3,1,2,-6,5,-8,6}, 0);
		
		assertThat(result.get(0)).isEqualTo(new Integer [] {-8, 2, 6});
		assertThat(result.get(1)).isEqualTo(new Integer [] {-8, 3, 5});
		assertThat(result.get(2)).isEqualTo(new Integer [] {-6, 1, 5});
	}
	
	@Test
	public void test1() {
		ThreeNumberSums obj = new ThreeNumberSums();
		List<Integer[]> result = obj.threeNumberSum3(
				new int[] {12,3,1,2,-6,5,-8,6}, 0);
		
		assertThat(result.get(0)).isEqualTo(new Integer [] {-8, 3, 5});
		assertThat(result.get(1)).isEqualTo(new Integer [] {-6, 1, 5});
		assertThat(result.get(2)).isEqualTo(new Integer [] {-8, 2, 6});
	}
}
