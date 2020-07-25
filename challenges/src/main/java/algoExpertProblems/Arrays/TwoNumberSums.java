package algoExpertProblems.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSums {
	
	//Time: O(n^2) || Space: O(1)
	public int[] twoNumberSum(int[] array, int targetSum) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(i==j)
					continue;
				
				if(array[i]+array[j]==targetSum)
					return new int[] {array[j], array[i]};
			}
		}
		
		return new int[0];
	}
	
	
	//Time: O(n) || Space: O(logn)
	public int[] twoNumberSum3(int[] array, int targetSum) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0; i < array.length; i++) {
			int diff = targetSum - array[i];
			if(map.containsKey(diff))
				return new int[] {array[i], diff};
			else
				map.put(array[i], true);
		}
		
	    return new int[0];
	}
	
	//Time: O(n) || Space: O(n)
	public int[] twoNumberSum1(int[] array, int targetSum) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < array.length; i++) 
			map.put(array[i], i);
		
	    for (int i = 0; i < array.length; i++) {
			int diff = targetSum - array[i];
			if(map.containsKey(diff) && map.get(diff) != i)
				return new int[] {diff, array[i]};
		}
		
	    return new int[0];
	}
	
	//Time: O(nlogn) || Space: O(n)
	public int[] twoNumberSum2(int[] array, int targetSum) {
	    Arrays.sort(array);
	    int left=0, right=array.length-1;
	    while(left<right) {
	    	int sum = array[left] + array[right];
	    	if(sum<targetSum)
	    		left++;
	    	else if(sum>targetSum)
	    		right--;
	    	else if(sum == targetSum)
	    		return new int[] {array[left], array[right]};
	    }
		
	    return new int[0];
	}
	
}
