package leetcodeContest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class SuffleTheArrayTest {

	@Test
	public void test() {
		SuffleTheArray suffleTheArray = new SuffleTheArray();
		
		assertThat(suffleTheArray.shuffle(new int[] {2,5,1,3,4,7}, 3))
		.isEqualTo(new int[] {2,3,5,4,1,7});
	}

}
