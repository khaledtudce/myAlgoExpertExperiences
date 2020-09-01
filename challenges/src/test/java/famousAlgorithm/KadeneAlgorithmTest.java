package famousAlgorithm;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class KadeneAlgorithmTest {

	@Test
	public void test() {
		KadeneAlgorithm obj = new KadeneAlgorithm();
		assertThat(obj.kadanesAlgorithm(new int[] {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4}))
		.isEqualTo(19);
	}

}
