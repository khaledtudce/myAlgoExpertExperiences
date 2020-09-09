package algoExpertProblems.BinaryTrees;

import java.util.ArrayDeque;

public class NodeDepth {
	
	// O(n) time | O(n) space
	public static int nodeDepths(BinaryTree root) {
		ArrayDeque<Level> queue = new ArrayDeque<Level>();
		queue.addLast(new Level(root, 0));
		int finalNodeDepth = 0;
		while(!queue.isEmpty()) {
			Level currentLevel = queue.poll();
			if(currentLevel.node==null)
				continue;
			
			finalNodeDepth = finalNodeDepth + currentLevel.depth;
			queue.addLast(new Level(currentLevel.node.left, currentLevel.depth+1));
			queue.addLast(new Level(currentLevel.node.right, currentLevel.depth+1));	
		}
		return finalNodeDepth;
	}
	
	static class Level {
	    BinaryTree node;
	    int depth;
		
		public Level(BinaryTree node, int depth) {
			super();
			this.node = node;
			this.depth = depth;
		}
	}	
	
	static class BinaryTree {
	    int value;
	    BinaryTree left;
	    BinaryTree right;
	
	    public BinaryTree(int value) {
	      this.value = value;
	      left = null;
	      right = null;
	    }
	}
	

	// O(n) time | O(n) space
	public static int nodeDepths1(BinaryTree root) {
		return getDepth(root, 0);
	}
	
	private static int getDepth(BinaryTree node, int nodeDepth) {
		if(node == null)
			return 0;
		
		// remember by child level, increase the depth level by 1 for each level 
		return nodeDepth + getDepth(node.left, nodeDepth+1)
		+ getDepth(node.right, nodeDepth+1);
	}
}
