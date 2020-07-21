package algoExpertProblems.Arrays;

import java.util.List;

public class MoveElementToEnd {
	
	//	Time: O(n) || Space: O(1)
	public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		int j = array.size()-1;
		for (int i = 0; i < array.size(); i++) {
			if(i>=j)
				break;
			
			if(array.get(i)== toMove) {
				while(array.get(j)==toMove && i<j) j--;
				
				if(array.get(j)!=toMove)
					swap(i, j, array);
			}		
		}
		
		return array;
	}
	
	
    //	Time: O(n) || Space: O(1)
	public List<Integer> moveElementToEnd1(List<Integer> array, int toMove) {
		int firstLocation = -1;
		for (int i = 0; i < array.size(); i++) {
			if(firstLocation==-1 && array.get(i)==toMove) {
				firstLocation = i;
				continue;
			}
			if(firstLocation!=-1 && array.get(i)!=toMove) {
				swap(firstLocation, i, array);
				firstLocation = firstLocation+1;
			}	
		}
		
		return array;
	}

	private void swap(Integer a, Integer b, List<Integer> array) {
		int temp = array.get(a);
		array.set(a, array.get(b));
		array.set(b, temp);
	}
}
