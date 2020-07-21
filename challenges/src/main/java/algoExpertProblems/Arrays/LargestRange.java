package algoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestRange {

	public int[] largestRange(int[] array) {
		//Time: O(n), Space: O(n) 
		int logestRange = 0;
		int[] bigRange = new int[2];
		Map<Integer, Boolean> numMap = new HashMap<Integer, Boolean>();
		for (int i : array) numMap.put(i, true); // it makes automatic sorting
		
		for (int i : array) {
			int left = i-1;
			int right = i+1;
			int currentRange = 1;
			numMap.put(i, false);
			
			while(numMap.containsKey(left)==true) {
				numMap.put(left, false);
				currentRange++;
				left--;
			}
			
			while(numMap.containsKey(right)==true) {
				numMap.put(right, false);
				currentRange++;
				right++;
			}
			
			if(currentRange>logestRange) {
				logestRange = currentRange;
				bigRange = new int[] {left+1, right-1};
			}
		}
		return bigRange; 
	}
	
	
	public int[] largestRange1(int[] array) { //Time: O(nlogn) because it has sorting
		Arrays.sort(array);
		int firstItem = 0;
		List<List<Integer>> ranges = new ArrayList<List<Integer>>();
		List<Integer> range =  new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if(i==0) {
				firstItem = array[i];
				range.add(firstItem);
				continue;
			}
			
			if(array[i]==firstItem || array[i]==++firstItem) {
				if(!range.contains(array[i]))
					range.add(array[i]);
			}else {
				ranges.add(range);
				range=new ArrayList<Integer>();
				range.add(array[i]);
				firstItem = array[i];
			}
		}
		
		ranges.add(range);
		
		ranges.sort((x, y) -> Integer.compare(x.size(), y.size()));
		
		int lastArray = ranges.size()-1;
		int sizeOfLastArray = ranges.get(lastArray).size()-1;
		return new int[] {ranges.get(lastArray).get(0), ranges.get(lastArray).get(sizeOfLastArray) };
	}

}
