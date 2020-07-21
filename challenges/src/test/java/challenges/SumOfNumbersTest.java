package challenges;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumOfNumbersTest {

	SumOfNumbers sumOfNumbers;
	
	public SumOfNumbersTest() {
		sumOfNumbers = new SumOfNumbers();
	}
	
	@Test
	public void should_do_sum__when_two_data_given() {
		assertEquals(sumOfNumbers.getSum(1,0), 1, 0);
		assertEquals(sumOfNumbers.getSum(1,2), 3, 0);
		assertEquals(sumOfNumbers.getSum(0,1), 1, 0);
	}

	@Test
	public void should_return_a__when_same_data_given() {
		assertEquals(sumOfNumbers.getSum(1,1), 1, 0);
		assertEquals(sumOfNumbers.getSum(2,2), 2, 0);
		assertEquals(sumOfNumbers.getSum(3,3), 3, 0);
	}
	
	@Test
	public void should_do_a__when_same_data_given() {
		assertEquals(sumOfNumbers.getSum(-1,0), -1, 0);
		assertEquals(sumOfNumbers.getSum(-1,2), 2, 0);
	}
}