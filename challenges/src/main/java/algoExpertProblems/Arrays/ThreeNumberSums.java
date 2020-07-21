package algoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeNumberSums {

	//Time: O(n^2) || Space: O(n)
	public List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		List<Integer[]> finalResult = new ArrayList<Integer[]>();
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			int left = i+1, right = array.length-1;
			while(left<right) {
				int sum = array[i]+array[left]+array[right];
				if(sum<targetSum) 
					left++;
				else if(sum>targetSum)
					right--;
				else if(sum==targetSum) {
					finalResult.add(new Integer[] {array[i], array[left], array[right]});
					left++;
					right--;
				}
			}
		}
		
		return finalResult;
	}
	
	//Time: O(n^2) || Space: O(n)
	public List<Integer[]> threeNumberSum3(int[] array, int targetSum) {
		List<Integer[]> finalResult = new ArrayList<Integer[]>();
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) 
			inputMap.put(array[i], i);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				int twoSum = array[i] + array[j];
				int diff = targetSum - twoSum;
				if(inputMap.containsKey(diff) && inputMap.get(diff) != i && inputMap.get(diff) != j){
					Integer[] newTriplet =  new Integer[] {array[i], array[j], diff};
					Arrays.sort(newTriplet);
					if(!finalResult.stream().anyMatch(item -> Arrays.equals(item, newTriplet)))
						finalResult.add(newTriplet);
				}
			}
		}
		
		return finalResult;
	}
	
	
	
	//Time: O(n^3) || Space: O(1)
	public List<Integer[]> threeNumberSum2(int[] array, int targetSum) {
		List<Integer[]> finalResult = new ArrayList<Integer[]>();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(i==j)
					continue;
				for (int k = 0; k < array.length; k++) {
					if(i==j || j==k || i == k)
						continue;
					if((array[i]+array[j]+array[k])==targetSum ) {
						Integer[] newTripet = new Integer[] {array[i], array[j], array[k]};
						Arrays.sort(newTripet);
						if(!finalResult.stream().anyMatch(item -> Arrays.equals(item, newTripet)))
							finalResult.add(newTripet);
					}
				}
			}
		}
		
		return finalResult;
	}
	
	
	
	//Time: O(n^2) || Space: O(nlogn) 
	public List<Integer[]> threeNumberSum1(int[] array, int targetSum) {
		Map<Integer, List<Integer[]>> pairMap = new HashMap<Integer, List<Integer[]>>();
		List<Integer[]> finalResult = new ArrayList<Integer[]>();
		
		for (int i = 0; i < array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				int key = array[j]+ array[i];
				List<Integer[]> valuePairList = new ArrayList<Integer[]>();
				Integer[] newValuePair = new Integer[] {array[j], array[i]};
				valuePairList.add(newValuePair);
				if(pairMap.containsKey(key)) {
					pairMap.get(key).add(newValuePair);
				}else {
					pairMap.put(key, valuePairList);
				}
			}
			
			int diffTarget =  targetSum - array[i];
			if(pairMap.containsKey(diffTarget)) {
				List<Integer[]> pairLists = pairMap.get(diffTarget);
				for (Integer[] pair : pairLists) {
					if(!Arrays.asList(pair).contains(array[i])) {
						Integer[] newResult = new Integer[] {array[i], pair[0], pair[1]};
						Arrays.sort(newResult);
						if(!finalResult.stream().anyMatch(a -> Arrays.equals(a, newResult)))
							finalResult.add(newResult);
					}
				}
			}
			
		} 
		
		return finalResult;
	}
}
