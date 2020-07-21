package dataStructures;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class InsertInSortedArrayTest {

	@Test
	public void test() {
		InsertInSortedArray obj = new InsertInSortedArray();
		assertThat(obj.insert1(4)).isEqualTo(new int[] {1,2,3,4,5,6});
		assertThat(obj.insert1(0)).isEqualTo(new int[] {0,1,2,3,4,5,6});
		assertThat(obj.insert1(10)).isEqualTo(new int[] {0,1,2,3,4,5,6,10});
	}

}
