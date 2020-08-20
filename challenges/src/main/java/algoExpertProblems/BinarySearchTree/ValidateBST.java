package algoExpertProblems.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidateBST {	

	// Time: O(n) || Space: O(d)
	public static boolean validateBstIterative(BST tree) {
		if(tree.left.value>tree.value || tree.right.value<tree.value)
			return false;
		
		if(!isValidSubtree(tree.left, tree.value, true))
			return false;
		
		if(!isValidSubtree(tree.right, tree.value, false))
			return false;
		
		return true;
	}

	private static boolean isValidSubtree(BST tree, int max, boolean isLeftSide) {
		Queue<BST> queue = new LinkedList<BST>();
		queue.add(tree);
		while(!queue.isEmpty()) {
			BST curNode = queue.poll();
			if(curNode.left != null) { 
				if(curNode.left.value>curNode.value || (isLeftSide? curNode.left.value>=max : curNode.left.value<=max))
					return false;
				else 
					queue.add(curNode.left);
			}
			
			if(curNode.right != null) {
				if(curNode.right.value<curNode.value || (isLeftSide? curNode.right.value>=max : curNode.right.value<=max))
					return false;
				else 
					queue.add(curNode.right);
			}
		}
		
		return true;
	}
	
	
	// Time: O(n) || Space: O(d)
	public static boolean validateBstRecursive(BST tree) {
		return validateBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean validateBST(BST tree, int minValue, int maxValue) {
		if(tree.value<minValue || tree.value>=maxValue)
			return false;
		
		if(tree.left != null && !validateBST(tree.left, minValue, tree.value))
			return false;
		
		if(tree.right != null && !validateBST(tree.right, tree.value, maxValue))
			return false;
		
		return true;
	}

	static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	}
}

















