package algoExpertProblems.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
	// This is the class of the input root. Do not edit it.
	public static class BinaryTree {
	    int value;
	    BinaryTree left;
	    BinaryTree right;

	    BinaryTree(int value) {
	      this.value = value;
	      this.left = null;
	      this.right = null;
	    }
	}

	// O(n) time | O(n) space
	public static List<Integer> branchSums(BinaryTree root) {
		List<Integer> resultSums = new ArrayList<Integer>();  
		calculateBranchSums(root, 0, resultSums);
	    return resultSums;
	}

	private static void calculateBranchSums(BinaryTree node, int runningSum, List<Integer> sums) {
		if(node==null)
			  return;
		int newRunningSum = runningSum + node.value;
		// when there is no left right, that means its leaf
		if(node.left==null && node.right==null) { 
			sums.add(newRunningSum);
			return;
		}
		
		calculateBranchSums(node.left, newRunningSum, sums);
		calculateBranchSums(node.right, newRunningSum, sums);
	}
}
