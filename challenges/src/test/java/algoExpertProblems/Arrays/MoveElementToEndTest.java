package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;

import org.junit.Test;

public class MoveElementToEndTest {

	@Test
	public void test() {
		MoveElementToEnd obj = new MoveElementToEnd();
		assertThat(obj.moveElementToEnd(Arrays.asList(2,1,2,2,2,3,4,2), 2))
		.isEqualTo(Arrays.asList(1,3,4,2,2,2,2,2));
	}

	@Test
	public void test1() {
		MoveElementToEnd obj = new MoveElementToEnd();
		assertThat(obj.moveElementToEnd(Arrays.asList(3,1,2,4,5), 3))
		.isEqualTo(Arrays.asList(1,2,4,5,3));
	}
	
	@Test
	public void test2() {
		MoveElementToEnd obj = new MoveElementToEnd();
		assertThat(obj.moveElementToEnd(Arrays.asList(1,2,4,5,6), 3))
		.isEqualTo(Arrays.asList(1,2,4,5,6));
	}
	
	@Test
	public void test3() {
		MoveElementToEnd obj = new MoveElementToEnd();
		assertThat(obj.moveElementToEnd(Arrays.asList(1,2,3,4,5), 3))
		.isEqualTo(Arrays.asList(1,2,4,5,3));
	}
}
