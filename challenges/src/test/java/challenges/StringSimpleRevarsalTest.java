package challenges;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class StringSimpleRevarsalTest {

	@Test
	public void test() {
		StringSimpleRevarsal obj = new StringSimpleRevarsal();
		assertThat(obj.getStringReversal("your code rocks"))
		.isEqualTo("skco redo cruoy");
	}

}
