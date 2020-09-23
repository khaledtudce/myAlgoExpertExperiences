package algoExpertProblems.famousAlgorithm;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import algoExpertProblems.famousAlgorithm.KadaneAlgorithm;

public class KadaneAlgorithmTest {

	@Test
	public void test() {
		KadaneAlgorithm obj = new KadaneAlgorithm();
		assertThat(obj.kadanesAlgorithm(new int[] {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4}))
		.isEqualTo(19);
	}

}
