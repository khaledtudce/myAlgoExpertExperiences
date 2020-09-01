package famousAlgorithm;

public class KadaneAlgorithm {
	
	//Time: O(n) || Space: O(1)
	public int kadanesAlgorithm(int[] array) {
		int sum = 0;
		int maxSum = array[0];
		for (int i = 0; i < array.length; i++) {
			sum = Math.max(sum+array[i], array[i]);
			maxSum = Math.max(sum, maxSum);
		}
		
		return maxSum;
	}
}
