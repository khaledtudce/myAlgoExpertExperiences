package challenges;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

public class AlmostEvenTest {
	
	AlmostEven almostEven = new AlmostEven(); 

	@Test
	public void should_do_sum__when_two_data_given() {
		assertEquals(new ArrayList<Integer>() {{ add(4);add(4);add(4);add(4);add(4);}}, almostEven.splitInteger(20,5));
		assertEquals(new ArrayList<Integer>() {{ add(10);}}, almostEven.splitInteger(10,1));
		assertEquals(new ArrayList<Integer>() {{ add(1);add(1);}}, almostEven.splitInteger(2,2));
		assertEquals(new ArrayList<Integer>() {{ add(3);add(3);add(3);add(3);add(4);add(4);}}, almostEven.splitInteger(20,6));
		assertEquals(new ArrayList<Integer>() {{ add(6);add(6);add(7);add(7);add(7);add(7);}}, almostEven.splitInteger(40,6));
	}
}
