package algoExpertProblems.dynamicProgramming;

import java.util.Arrays;
import java.util.Stack;

public class MinNumberOfJumps {
	
	// Time: O(n) || Space: O(1)
	public int minNumberOfJumps(int[] array) {
		if(array.length==1)
			return 0;
		int jumps=0, maxReach=array[0], steps=array[0];
		for (int i = 1; i < array.length-1; i++) {
			maxReach = Math.max(array[i]+i, maxReach);
			steps--;
			if(steps==0) {
				jumps++;
				steps = maxReach-i;
			}
		}
		
	    return jumps+1;
	}
	
	// Time: O(n^2) || Space: O(n)
	public int minNumberOfJumps2(int[] array) {
		int[] jumps = new int[array.length];
		Arrays.fill(jumps, Integer.MAX_VALUE);
		jumps[0]=0;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if(array[j]+j >= i)
					jumps[i]=Math.min(jumps[i], jumps[j]+1);
			}
		}
		
	    return jumps[jumps.length-1];
	}
	
	// Time: O(n^2) || Space: O (nlogn)
	public int minNumberOfJumps1(int[] array) {
	    Stack<Integer[]> stack = new Stack<Integer[]>();
	    stack.push(new Integer[] { 0, 0}); //location, jumps
	    int minJumpRecorded = Integer.MAX_VALUE;
	    while(!stack.empty()) {
	    	Integer[] curLevel = stack.pop();
	    	int curLocation = curLevel[0];
	    	int curJumps = curLevel[1];
	    	
	    	if(curLocation==array.length-1 && curJumps<minJumpRecorded)
	    		minJumpRecorded = curJumps;
	    	
	    	for (int i = curLocation+1; i <= array[curLocation]+curLocation; i++) {
	    		if(i>=array.length)
					break;
	    		
				stack.push(new Integer[] {i, curJumps+1});
			}
	    }
		
	    return minJumpRecorded;
	}
}
