package leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class CountOfSmallerNumberAfterSelfTest {

	CountOfSmallerNumberAfterSelf obj = new CountOfSmallerNumberAfterSelf();
	
	@Test
	public void should_make_count_of_smaller_numbers_after_self() {
				
//		[10,27,10,35,12,22,28,8,19,2,12,2,9,6,12,5,17,
//		 9,19,12,14,6,12,5,12,3,0,10,0,7,8,4,0,0,4,3,2,0,1,0]
				 
		assertThat(obj.countNumbers(new int[] {26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,
				83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41}))		
		.isEqualTo(new ArrayList<Integer>() {{add(10); add(27); add(10); add(35); add(12); add(22);
		add(28); add(8); add(19); add(2); add(12); add(2);add(9); add(6); add(12); add(5); add(17); 
		add(9);add(19); add(12); add(14); add(6); add(12); add(5);add(12); add(3); add(0); add(10); 
		add(0); add(7);add(8);add(4);add(0);add(0);add(4);add(3);add(2);add(0);add(1);add(0);}});
		
		assertThat(obj.countNumbers(new int[] {1,9,7,4,7,5}))
		.isEqualTo(new ArrayList<Integer>() {{add(0); add(4); add(2); add(0); add(1); add(0);}});

		
		assertThat(obj.countNumbers(new int[] {1,9,7,8,5}))
		.isEqualTo(new ArrayList<Integer>() {{add(0); add(3); add(1); add(1); add(0);}});
		
		assertThat(obj.countNumbers(new int[] {2,0,1}))
		.isEqualTo(new ArrayList<Integer>() {{add(2); add(0); add(0);}});
		
		assertThat(obj.countNumbers(new int[] {5,2,1,6}))
		.isEqualTo(new ArrayList<Integer>() {{add(2); add(1); add(0); add(0);}});
		
		assertThat(obj.countNumbers(new int[] {5,2,6,1}))
		.isEqualTo(new ArrayList<Integer>() {{add(2); add(1); add(1); add(0);}});
	}
}
