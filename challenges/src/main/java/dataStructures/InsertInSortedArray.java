package dataStructures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertInSortedArray {
	List<Integer> sortedArray = new ArrayList<Integer>() {{
									add(1);
									add(2);
									add(3);
									add(5);
									add(6);
		 						}};

	public int[] insert1(int number) {// log(n) time, log(n) space
		int index = Collections.binarySearch(sortedArray, number);
	    if (index < 0) {
	        index = -index - 1;
	    }
	    sortedArray.add(index, number);
		return sortedArray.stream().mapToInt(k->k).toArray();
	}
		 						
	public int[] insert(int number) {
		for(int i=0; i<sortedArray.size(); i++) { // O(n) time, O(n) space
			if(number >= sortedArray.get(sortedArray.size()-1)) {
				sortedArray.add(number);
				return sortedArray.stream().mapToInt(k->k).toArray();
			}
			if(number<=sortedArray.get(i)){
				sortedArray.add(i, number);
				return sortedArray.stream().mapToInt(k->k).toArray();
			}
			if(number>=sortedArray.get(i) && number<=sortedArray.get(i+1)) {
				sortedArray.add(i+1, number);
				return sortedArray.stream().mapToInt(k->k).toArray();
			}	
		}
		return sortedArray.stream().mapToInt(k->k).toArray();
	}
	
	
}
