package leetcodeContest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class LargestNumberIntegersAfterKRemoval {
	public int findLeastNumOfUniqueInts(int[] arr, int k) { // 226ms 108MB 
		
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int numberOfOccurence = 0;
			
			if(numberMap.containsKey(arr[i]))
				numberMap.put(arr[i], numberMap.get(arr[i])+1);
			else
				numberMap.put(arr[i], ++numberOfOccurence);
		}
		
		Map<Integer, Integer> sortedMap = numberMap
				.entrySet()
                .stream()
                .sorted((Map.Entry.<Integer, Integer>comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
                
        for (int key : sortedMap.keySet()) {
			if(k!=0) {
				Integer length = sortedMap.get(key);
				for(int i=0; i<length; i++) {
					sortedMap.put(key, sortedMap.get(key)-1);
					k--;
					if(k==0)
						break;
				}
			}
		}
        
        sortedMap.values().removeIf(f -> f == 0);
                
		return sortedMap.size();
    }
	
	public int findLeastNumOfUniqueInts1(int[] arr, int k) { // 141ms 85MB 
		if(arr==null || arr.length==0)
            return 0;
        
		// base case as it will remove all elements
        if(k>= arr.length)
            return 0;
		
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
			numberMap.put(arr[i], numberMap.getOrDefault(arr[i],0)+1);
		
                
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));   
        pq.addAll(numberMap.entrySet()); //it makes faster but takes more memory
                
        // keep removing the minimum frequency element until k becmoes 0
        while(k>0)
        {
            Map.Entry<Integer,Integer> entry = pq.poll();
            if(entry.getValue()>k)
            {
                entry.setValue(entry.getValue()-k);
                k= entry.getValue()-k;
                pq.offer(entry);
            }
            else{
                k = k - entry.getValue();
            }
            
        }           
        return pq.size();        
    }
	
	public int findLeastNumOfUniqueInts2(int[] arr, int k) { // O(n) 110ms and 96MB
        if(k==1 && arr.length==1) return 0; 
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr) map.put(a,map.getOrDefault(a,0)+1);
        List<Integer>[] bucket = new List[arr.length+1];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(bucket[entry.getValue()] == null) bucket[entry.getValue()]=new ArrayList<>();
            bucket[entry.getValue()].add(entry.getKey());
        }
        int count=map.size();
        for(int i=0;i<bucket.length && k>0;i++){
            if(bucket[i]==null) continue;
            if(k - bucket[i].size()*i >=0){
                k -= bucket[i].size()*i;
                count -= bucket[i].size();
            }
            else{
                count -= k / i;
                break;
            }
        }
        return count;
    }
	
	public int findLeastNumOfUniqueInts3(int[] arr, int k) { // O(n) 77ms and 56MB, top solution
        if(arr.length == 0 || arr == null) return -1;
        Map<Integer,Integer> numberMap = new HashMap<>();
        
        int size = 0;
	    for(int i = 0; i < arr.length; i++){
	        if(!numberMap.containsKey(arr[i])) size++; //  getting the size (count) of distinct integer
	        numberMap.put(arr[i],numberMap.getOrDefault(arr[i],0)+1);
	    }
	    
	    List<Map.Entry<Integer,Integer>> listOfMapEntry = new LinkedList<>(numberMap.entrySet());
	    Collections.sort(listOfMapEntry,(a,b) -> a.getValue() - b.getValue());  // sorting in increasing order on the basis of values
	   
	    for(Map.Entry<Integer,Integer> entry : listOfMapEntry){
	        if(entry.getValue() <= k){ // if an integer has a count which is less than or equal to k then we will reduce the size of the 
		         size--;               // distinct integers as it will be removed and update k. 
	             k -= entry.getValue();
	        }
	    }
	    
	    return size;
    }
}
