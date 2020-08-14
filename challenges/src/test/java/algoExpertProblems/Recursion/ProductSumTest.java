package algoExpertProblems.Recursion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ProductSumTest {

	@Test
	public void TestCase1() {
		// [5, 2, [7, -1], 3, [6, [-13, 8], 4]]		
		List<Object> complexList = new ArrayList<Object>(
	    	Arrays.asList(5,2,new ArrayList<Object>(Arrays.asList(7, -1)),3,
	        new ArrayList<Object>(Arrays.asList(6, new ArrayList<Object>(
	        		Arrays.asList(-13, 8)), 4))));
	    
	    assertTrue(ProductSum.productSum(complexList) == 12);
	}

}
