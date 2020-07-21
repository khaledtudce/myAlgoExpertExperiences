package algoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSums {
	
    //	Time: O(n^2) || Space: O(n^2)
	public List<Integer[]> fourNumberSum(int[] array, int targetSum) {
		List<Integer[]> result = new ArrayList<Integer[]>();
		Map<Integer, List<Integer[]>> pairMap = new HashMap<Integer, List<Integer[]>>();
		for (int i = 0; i < array.length; i++) {
			//calculate distance and if pair exists, insert on result
			for (int j = i+1; j < array.length; j++) {
				int pairSum = array[i]+array[j];
				int diffTarget = targetSum - pairSum;
				if(pairMap.containsKey(diffTarget)) {
					for (Integer[] pair : pairMap.get(diffTarget)) {
						result.add(new Integer[] { pair[0], pair[1], array[i], array[j] });
					}
				}
			}
			//to eliminate duplicate quadrad value consider only before value from current index i, 
			//then insert it into Hashmap
			for (int k = 0; k < i; k++) {
				List<Integer[]> valuePair = new ArrayList<Integer[]>();
				Integer[] newValuePair = new Integer[] {array[k], array[i]};
				valuePair.add(newValuePair);
				int key = array[i]+array[k];
				
				if(!pairMap.containsKey(key))
					pairMap.put(key, valuePair);
				else {
					pairMap.get(key).add(newValuePair);
				}
			}
		}
		
		return result; 
	}
	
	
	
	//	Time: O(n^4) || Space: O(n)
	public List<Integer[]> fourNumberSum1(int[] array, int targetSum) {
		List<Integer[]> finalResult = new ArrayList<Integer[]>();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(i==j)
					continue;
				for (int k = 0; k < array.length; k++) {
					if(i==j || j ==k || i == k)
						continue;
					for (int l = 0; l < array.length; l++) {
						int sum = 0;
						if(i==j || j==k || i==k || k==l || j==l || i==l)
							continue;
						sum = sum + array[i] + array[j] + array[k] + array[l];
						if(sum==targetSum) {
							Integer[] foundSum= {array[i],array[j],array[k],array[l]};
							Arrays.sort(foundSum);
							if(!finalResult.stream().anyMatch(a -> Arrays.equals(a, foundSum)))
								finalResult.add(foundSum);
						}	
					}
				}
			}
		}
		
		return finalResult;
	}
}
