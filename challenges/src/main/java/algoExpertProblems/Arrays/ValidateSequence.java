package algoExpertProblems.Arrays;

import java.util.List;

public class ValidateSequence {
	
	// Time: O(n) || Space: O(1)
	public boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {
		int seqIndex = 0;
		for (int i = 0; i < array.size(); i++) {
			if(sequence.get(seqIndex)==array.get(i))
				seqIndex++;
			if(seqIndex == sequence.size())
				return true;
		}
		
		return false;
	}
	
	// Time: O(n) || Space: O(1)
	public boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
		int seqIndex = 0;
		for (int i = 0; i < array.size(); i++) {
			if(seqIndex == sequence.size())
				break;
			if(sequence.get(seqIndex)==array.get(i))
				seqIndex++;
		}
		
		return seqIndex == sequence.size();
	}
	
	// Time: O(n) || Space: O(1)
	public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int arrayIdx = 0, seqIdx = 0;
		while(arrayIdx<array.size() && seqIdx<sequence.size()) {
			if(array.get(arrayIdx)==sequence.get(seqIdx)) {
				arrayIdx++;
				seqIdx++;
			}else
				arrayIdx++;
		}
		
		return seqIdx==sequence.size();
	}
}




