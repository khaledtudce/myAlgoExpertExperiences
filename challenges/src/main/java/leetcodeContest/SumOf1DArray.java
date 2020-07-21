package leetcodeContest;

public class SumOf1DArray {

	public int[] runningSum(int[] nums) {
		
		int[] result = new int[nums.length];
		int currentIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			currentIndex+=nums[i];
			result[i]= currentIndex;
		}
        
		return result;
    }
}
