package leetCode;

import java.util.Arrays;

public class RandomPickWithWeight {
	
	private double[] probabilities;
    
    public void Solution(int[] w) {
        double sum = 0;
        this.probabilities = new double[w.length];
        for(int weight : w)
            sum += weight;
        for(int i = 0; i < w.length; i++){
            int firstIndexZeroOrTakePreviousIndexOfW = (i == 0) ? 0 : w[i - 1];
			w[i] += firstIndexZeroOrTakePreviousIndexOfW;
            probabilities[i] = w[i]/sum; 
        }
    }
     
    public int pickIndex() {
        int randomProbableValue = Arrays.binarySearch(this.probabilities, Math.random());
		return Math.abs(randomProbableValue) - 1;
    }
}
