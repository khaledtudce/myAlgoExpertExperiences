package leetcodeContest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KStrongestValuesInAnArray {
	public int[] getStrongest(int[] arr, int k) {
		Arrays.sort(arr);
		int m = arr[(arr.length-1)/2];
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i==j)
					continue;
				
				int left = arr[i]-m;
				int right = arr[j]-m;
				if(left > right) {
					if(!result.contains(arr[i]))
						result.add(arr[i]);
				}
				
				if(left == right)
					if(arr[i] > arr[j])
						if(!result.contains(arr[i]))
							result.add(arr[i]);
					
			}
		}
		
		return result.stream().mapToInt(i->i).toArray();
    }
}
