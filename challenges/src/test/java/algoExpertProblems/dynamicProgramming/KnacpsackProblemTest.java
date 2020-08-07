package algoExpertProblems.dynamicProgramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class KnacpsackProblemTest {

	@Test
	public void test() {
		KnacpsackProblem obj = new KnacpsackProblem();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(Arrays.asList(10));
		List<Integer> finalItems = Arrays.asList(1,3);
	    result.add(finalItems);
	    
		assertThat(obj.knapsackProblem(new int [][]{ 
		{1,2},{4,3},{5,6},{6,7}}, 10)).isEqualTo(result);	
	}
	
	@Test
	public void test1() {
		KnacpsackProblem obj = new KnacpsackProblem();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(Arrays.asList(1500));
		List<Integer> finalItems = Arrays.asList(3,12,14);
	    result.add(finalItems);
	    
		assertThat(obj.knapsackProblem(new int [][]{ 
		{465, 100},//0
	    {400, 85},//1
	    {255, 55},//2
	    {350, 45},//3 
	    {650, 130},//4
	    {1000, 190},//5
	    {455, 100},//6
	    {100, 25},//7 
	    {1200, 190},//8
	    {320, 65},//9
	    {750, 100},//10
	    {50, 45},//11
	    {550, 65},//12
	    {100, 50},//13
	    {600, 70},//14
	    {240, 40}}, 200)).isEqualTo(result);//16	
	}

}
