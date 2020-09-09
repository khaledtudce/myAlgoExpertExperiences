package algoExpertProblems.Graphs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Test;

import algoExpertProblems.Graphs.RiverSizes;
import algoExpertProblems.Graphs.RiverSizesOptimized;

public class RiverSizesTest {
	@Test
	public void test() {
		RiverSizes riverSizes = new RiverSizes();
		int[][] matrix = {{1,0,0,1,0},
						  {1,0,1,0,0},
						  {0,0,1,0,1},
						  {1,0,1,0,1},
						  {1,0,1,1,0}};
		
		assertThat(riverSizes.riverSizes(matrix))
		.isEqualTo(new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(2);
				add(2);
				add(5);
			}
		});
	}
	
	@Test
	public void test1() {
		RiverSizesOptimized riverSizes = new RiverSizesOptimized();
		int[][] matrix = {{1,0,0,1,0,1,0,0,1,1,1,0},
						  {1,0,1,0,0,1,1,1,1,0,1,0},
						  {0,0,1,0,1,1,0,1,0,1,1,1},
						  {1,0,1,0,1,1,0,0,0,1,0,0},
						  {1,0,1,1,0,0,0,1,1,1,0,1}};
		
		assertThat(riverSizes.riverSizes(matrix))
		.isEqualTo(new ArrayList<Integer>() {
			{
				add(1);
				add(1);
				add(2);
				add(2);
				add(5);
				add(21);
			}
		});

	}
}
