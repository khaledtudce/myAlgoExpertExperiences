package challenges;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;

import org.junit.Test;

public class FindIslandSizesTest {

	@Test
	public void test() {
		FindIslandSizes islandSize = new FindIslandSizes();
		int[][] matrix = {{1,0,0,1,0},
						  {1,0,1,0,0},
						  {0,0,1,0,1},
						  {1,0,1,0,1},
						  {1,0,1,1,0}};
		
		assertThat(islandSize.getIslandSizeFor(matrix))
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
		FindIslandSizes isLandSize = new FindIslandSizes();
		int[][] matrix = {{1,0,0,1,0,1,0,0,1,1,1,0},
						  {1,0,1,0,0,1,1,1,1,0,1,0},
						  {0,0,1,0,1,1,0,1,0,1,1,1},
						  {1,0,1,0,1,1,0,0,0,1,0,0},
						  {1,0,1,1,0,0,0,1,1,1,0,1}};
		
		assertThat(isLandSize.getIslandSizeFor(matrix))
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
