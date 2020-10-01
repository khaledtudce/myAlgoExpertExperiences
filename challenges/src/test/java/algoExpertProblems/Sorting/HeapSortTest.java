package algoExpertProblems.Sorting;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HeapSortTest {

	@Test
	public void test() {
		HeapSort obj = new HeapSort();
		assertThat(obj.heapSort(new int[] {8, 5, 2, 9, 5, 6, 3}))
		.isEqualTo(new int[] {2, 3, 5, 5, 6, 8, 9});
	}

}
