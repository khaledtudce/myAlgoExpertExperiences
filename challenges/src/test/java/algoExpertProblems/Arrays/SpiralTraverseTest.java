package algoExpertProblems.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class SpiralTraverseTest {

	@Test
	public void test() {
		int[][] array = {{1, 2, 3, 4}, 
						{12, 13, 14, 5}, 
						{11, 16, 15, 6}, 
						{10, 9, 8, 7}};
		SpiralTraverse obj = new SpiralTraverse();
		assertThat(obj.spiralTraverse(array))
		.isEqualTo(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
	}
	
	@Test
	public void test1() {
		int[][] array ={{27, 12, 35, 26}, 
						{25, 21, 94, 11}, 
						{19, 96, 43, 56}, 
						{55, 36, 10, 18}, 
						{96, 83, 31, 94}, 
						{93, 11, 90, 16}};
		SpiralTraverse obj = new SpiralTraverse();
		assertThat(obj.spiralTraverse(array))
		.isEqualTo(Arrays.asList(27,12,35,26,11,56,18,94,16,90,11,
								93,96,55,19,25,21,94,43,10,31,83,36,96));
	}
	
	@Test
	public void test2() {
		int[][] array ={{1}};
		SpiralTraverse obj = new SpiralTraverse();
		assertThat(obj.spiralTraverse(array))
		.isEqualTo(Arrays.asList(1));
	}
	
	@Test
	public void test3() {
		int[][] array ={{4, 2, 3, 6, 7, 8, 1, 9, 5, 10},
				{12, 19, 15, 16, 20, 18, 13, 17, 11, 14}};
		SpiralTraverse obj = new SpiralTraverse();
		assertThat(obj.spiralTraverse(array))
		.isEqualTo(Arrays.asList(4, 2, 3, 6, 7, 8, 1, 9, 5, 10, 
				14,11,17,13,18,20,16,15,19,12));
	}
	
	@Test
	public void test4() {
		int[][] array ={{1,2,3},
						{8,9,4},
						{7,6,5}};
		SpiralTraverse obj = new SpiralTraverse();
		assertThat(obj.spiralTraverse(array))
		.isEqualTo(Arrays.asList(1,2,3,4,5,6,7,8,9));
	}
	
	@Test
	public void test5() {
		int[][] array ={{1,2,3,4},
						{10,11,12,5},
						{9,8,7,6}};
		SpiralTraverse obj = new SpiralTraverse();
		assertThat(obj.spiralTraverse(array))
		.isEqualTo(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
	}
}

















