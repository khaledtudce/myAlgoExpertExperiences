package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;

import org.junit.Test;

public class ValidateSequenceTest {

	@Test
	public void test() {
		ValidateSequence obj = new ValidateSequence();
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(5);
		array.add(1);
		array.add(22);
		array.add(25);
		array.add(6);
		array.add(-1);
		array.add(8);
		array.add(10);
		
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		sequence.add(1);
		sequence.add(6);
		sequence.add(-1);
		sequence.add(10);
		
		assertThat(obj.isValidSubsequence(array, sequence)).isEqualTo(true);	
	}

}
