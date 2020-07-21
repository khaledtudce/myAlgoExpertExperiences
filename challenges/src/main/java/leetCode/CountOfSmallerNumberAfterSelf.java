package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfSmallerNumberAfterSelf { //Time: nlogn

	public List<Integer> countNumbers(int[] nums){
		Integer[] result = new Integer[nums.length];
        List<Integer> sortedList = new ArrayList<Integer>();
        for(int i = nums.length - 1; i >= 0; i--){
            int index = findIndex(sortedList, nums[i]);
            result[i] = index;
            sortedList.add(index, nums[i]); 
        }
        return Arrays.asList(result);
	}
	
	private int findIndex(List<Integer> sortedList, int curValue){
        if(sortedList.size() == 0)  return 0; // as it started from last
        int startOfSortedList = 0, endOfSortedList = sortedList.size() - 1;
        if(isCurValueBiggerThanExistingValue(sortedList, curValue, endOfSortedList))   
        	return endOfSortedList + 1;
        if(isCurValueSmallerOrEqualThanExistingValue(sortedList, curValue, startOfSortedList)) 
        	return startOfSortedList;
        
        while(startOfSortedList < endOfSortedList){ //That's an algorithm to sort
            int mid = startOfSortedList + (endOfSortedList - startOfSortedList)/2; // remove half
            if(isCurValueBiggerThanExistingValue(sortedList, curValue, mid)){
                startOfSortedList = mid + 1;
            }else{
                endOfSortedList = mid;
            }
        }
        if (isCurValueSmallerOrEqualThanExistingValue(sortedList, curValue, startOfSortedList)) 
        	return startOfSortedList;
        
        return endOfSortedList;
    }

	private boolean isCurValueSmallerOrEqualThanExistingValue(List<Integer> sortedList, int curValue,
			int startOfSortedList) {
		return sortedList.get(startOfSortedList) >= curValue;
	}

	private boolean isCurValueBiggerThanExistingValue(List<Integer> sortedList, int curValue, int endOfSortedList) {
		return sortedList.get(endOfSortedList) < curValue;
	}


	public List<Integer> countNumbers1(int[] nums){ // Time: n2
		List<Integer> outputList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int smallerElementCount = 0;
			
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) 
					smallerElementCount++;
			}

			outputList.add(smallerElementCount);
		}
		
		return outputList;
	}
	
	public List<Integer> countNumbers2(int[] nums) { // Time: nlogn
		Integer[] result = new Integer[nums.length];
		Integer[] sortedNums = new Integer[nums.length];
		int sortedNumsCurrentLength = 0;
		
		for (int i = nums.length-1; i >= 0; i--) {
			if(i==nums.length-1) { // at case last digit
				result[i]=0;
				sortedNums[0] = nums[i];
				sortedNumsCurrentLength++;
			}
			else if(i==nums.length-2){//at case 2nd last
				if(nums[i]>sortedNums[0]) {
					sortedNums[1]=nums[i];
					sortedNumsCurrentLength++;
					result[i] = 1;
				}else {
					int temp = sortedNums[0];
					sortedNums[0]=nums[i];
					sortedNums[1] = temp;
					sortedNumsCurrentLength++;
					result[i] = 0;
				}	
			}
			else {
				int index = 0;
				boolean duplicateDetected = false;
				if(sortedNums[index]!=null && nums[i]<=sortedNums[index]) {
					int j=sortedNumsCurrentLength; // sorted array te je koyta value ache
					do {
						if(index== sortedNums.length-1) {
							result[i]=index;
							return Arrays.asList(result);
						}
						sortedNums[j] = sortedNums[j-1];
						j--;
					}while(j>0);	
				}else {
					while(sortedNums[index]!= null && nums[i]>=sortedNums[index]) {
						if(nums[i]==sortedNums[index])
							duplicateDetected = true;
						
						index++;		
					}
					int j=sortedNumsCurrentLength;
					do {
						if(index== sortedNums.length-1) {
							result[i]=index;
							return Arrays.asList(result);
						}
						sortedNums[j] = sortedNums[j-1];
						j--;
					}while(j>index && sortedNums[j]!=null);
				}
				
				sortedNums[index]=nums[i];
				sortedNumsCurrentLength++;
				
				if(duplicateDetected==true) 
					result[i]=index-1;
				else
					result[i]=index;
			}
		}
		
		return Arrays.asList(result);
    }
}
