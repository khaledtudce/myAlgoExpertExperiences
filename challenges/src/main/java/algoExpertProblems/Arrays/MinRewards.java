package algoExpertProblems.Arrays;

import java.util.Arrays;

public class MinRewards {

	// Time: O(n) || Space: O(n)
	public int minRewards(int[] scores) {
		int[] result = new int[scores.length];
		for (int i = 0; i < result.length; i++) 
			result[i]=1;
		for (int i = 1; i < scores.length; i++) {
			if(scores[i-1]<scores[i])
				result[i] = result[i-1]+1;
		}
		for (int i = scores.length-1; i > 0; i--) {
			if(scores[i-1]>scores[i])
				result[i-1] = Math.max(result[i-1], result[i]+1);
		}
		return Arrays.stream(result).sum();
	}
	
	// Time: O(n^2) || Space: O(n)
	public int minRewards2(int[] scores) {
		int[] result = new int[scores.length];
		for (int i = 0; i < result.length; i++) 
			result[i]=1;
		for (int i = 1; i < scores.length; i++) {
			int lastIdx = i-1;
			if(scores[lastIdx]<scores[lastIdx+1])
				result[lastIdx+1] = result[lastIdx]+1;
			while(lastIdx>=0 && scores[lastIdx]>scores[lastIdx+1]) {
				result[lastIdx] = Math.max(result[lastIdx], result[lastIdx+1]+1);
				lastIdx--;
			}
		}
		
		return Arrays.stream(result).sum();
	}
	
	// Time: O(n) because we visit each number once || Space: O(n)
	public int minRewards1(int[] scores) {
		if(scores.length==1)
			return 1;
		
		int[] result = new int[scores.length];
		int localMinIdx = Integer.MAX_VALUE; 
		for (int i = 0; i < scores.length; i++) {
			if((i==0 && scores[i]<scores[i+1]) || (i==scores.length-1 && scores[i-1]>scores[i])) { 
				localMinIdx = i;
			}else if(i!=0 && i!=scores.length-1 && scores[i-1]>scores[i] && scores[i]<scores[i+1]) {
				localMinIdx = i;
			}
			
			if(localMinIdx!=Integer.MAX_VALUE) {
				result[localMinIdx] = 1;
				setLeftSideRewards(scores, result, localMinIdx);
				i = setRightSideRewards(scores, result, localMinIdx, i);
				localMinIdx = Integer.MAX_VALUE;
			}		
		}
		
		return Arrays.stream(result).sum();
	}

	private void setLeftSideRewards(int[] scores, int[] result, int localMinIdx) {
		int counter=0, temp=0;
		for (int j = localMinIdx-1; j>=0; j--) {
			if(j>=0 && scores[j]>scores[j+1]) { 
				counter++;
				temp=result[j];
				result[j] = result[j+1] + 1;
			}else { 
				if(counter==1) 
					result[j+1] = temp;
				break;
			}
		}
	}
	
	private int setRightSideRewards(int[] scores, int[] result, int localMinIdx, int i) {
		int counter=0, temp=0;
		for(int j= localMinIdx+1; j<scores.length; j++) {
			if(scores[j-1]<scores[j]) {
				counter++;
				temp=result[j];
				result[j] = result[j-1] + 1;
			}else {
				if(counter==1 && temp!=0) 
					result[j-1] = temp;
				i=j-1;
				break;
			}
		}
		return i;
	}
}
