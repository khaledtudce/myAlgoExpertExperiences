package algoExpertProblems.BinaryTree;

import java.util.ArrayDeque;

public class InvertBinaryTree {
	
	// O(n) time | O(d/logn) space
	public static void invertBinaryTreeRecursive(BinaryTree tree) {
		if(tree == null)
			return;
		
		swapTwoChildNode(tree);
		invertBinaryTreeRecursive(tree.left);
		invertBinaryTreeRecursive(tree.right);
	}
	
	// O(n) time | O(n) space
	public static void invertBinaryTreeIterative(BinaryTree tree) {
		ArrayDeque<BinaryTree> queue = new ArrayDeque<BinaryTree>();
		queue.addLast(tree);
		while(!queue.isEmpty()) {
			BinaryTree currentNode = queue.poll();
			swapTwoChildNode(currentNode);
			if(currentNode.left != null)
				queue.addLast(currentNode.left);
			if(currentNode.right != null)
				queue.addLast(currentNode.right);
		}
	}
	
	static void swapTwoChildNode(BinaryTree currentNode) {
		BinaryTree tempTree = currentNode.left;
		currentNode.left = currentNode.right;
		currentNode.right = tempTree;
	}

	static class BinaryTree{
		public int value;
		public BinaryTree left;
		public BinaryTree right;
		
		public BinaryTree(int value) {
			this.value =  value;
		}
	}
}
