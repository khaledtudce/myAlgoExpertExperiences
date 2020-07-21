package algoExpertProblems.searching;

public class FindThreeLargestNumbers {
	
	// Time: O(n) || Space: O(1)
	public int[] findThreeLargestNumbers(int[] array) {
	    int[] output = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		for (int i = 0; i < array.length; i++) {
			if(array[i]>output[2]) {
				ShiftAndUpdate(output, array[i], 2);
			}else if(array[i]>output[1]) {
				ShiftAndUpdate(output, array[i], 1);
			}else if(array[i]>output[0])
				ShiftAndUpdate(output, array[i], 0);
		}
		
		return output;
	}
	
	private void ShiftAndUpdate(int[] output, int num, int index) {
		for (int i = 0; i <= index; i++) {
			if(i==index)
				output[i] = num;
			else
				output[i] = output[i+1]; 
		}
	}
	
	// Time: O(n) || Space: O(1) because we don't need to store all the array value
	// Its a constant space algorithm
	public int[] findThreeLargestNumbers1(int[] array) {
	    int[] output = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		for (int i = 0; i < array.length; i++) {
			if(array[i]>output[2]) {
				output[0]=output[1];
				output[1]=output[2];
				output[2]=array[i];
			}else if(array[i]>output[1]) {
				output[0]=output[1];
				output[1]=array[i];
			}else if(array[i]>output[0])
				output[0]=array[i];	
		}
		
		return output;
	}
}
