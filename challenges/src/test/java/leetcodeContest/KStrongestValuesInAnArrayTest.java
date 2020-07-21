package leetcodeContest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class KStrongestValuesInAnArrayTest {
//	1470. Shuffle the Array
//	5429. The k Strongest Values in an Array
//	5430. Design Browser History
//	5431. Paint House III
	KStrongestValuesInAnArray obj = new KStrongestValuesInAnArray();
	
	@Test
	public void test() {
		assertThat(obj.getStrongest(new int[] {1,2,3,4,5}, 2))
		.isEqualTo(new int[] {5,1});
	}
	
	@Test
	public void test1() {  
		assertThat(obj.getStrongest(new int[] {1,1,3,5,5}, 2))
		.isEqualTo(new int[] {5,5});
	}
	
	@Test
	public void test2() {  
		assertThat(obj.getStrongest(new int[] {6,7,11,7,6,8}, 5))
		.isEqualTo(new int[] {11,8,6,6,7});
	}

}
