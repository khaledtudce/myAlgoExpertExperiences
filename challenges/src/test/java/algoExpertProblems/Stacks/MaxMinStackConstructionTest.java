package algoExpertProblems.Stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxMinStackConstructionTest {

	public void testMinMaxPeek(int min, int max, int peek, 
			MaxMinStackConstruction.MinMaxStack stack) {
	    assertTrue(stack.getMin() == min);
	    assertTrue(stack.getMax() == max);
	    assertTrue(stack.peek() == peek);
	  }

	@Test
	public void TestCase1() {
		MaxMinStackConstruction.MinMaxStack stack = 
				new MaxMinStackConstruction.MinMaxStack();
	    stack.push(5);
	    testMinMaxPeek(5, 5, 5, stack);
	    stack.push(7);
	    testMinMaxPeek(5, 7, 7, stack);
	    stack.push(2);
	    testMinMaxPeek(2, 7, 2, stack);
	    assertTrue(stack.pop() == 2);
	    assertTrue(stack.pop() == 7);
	    testMinMaxPeek(5, 5, 5, stack);
	}
}
