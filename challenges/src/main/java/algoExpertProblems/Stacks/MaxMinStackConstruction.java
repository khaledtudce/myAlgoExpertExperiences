package algoExpertProblems.Stacks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMinStackConstruction {
	
	// Time: O(1) || Space: O(1)
	static class MinMaxStack {
	    List<Integer> list = new ArrayList<Integer>();
		public int peek() {
	      return list.get(0);
	    }

	    public int pop() {	      
	      return list.remove(0);
	    }

	    public void push(Integer number) {
	      list.add(0, number);
	    }

	    public int getMin() {
	      return list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	    }

	    public int getMax() {
	      return list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	    }
	}
}
