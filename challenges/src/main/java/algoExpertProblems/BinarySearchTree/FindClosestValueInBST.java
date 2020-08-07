package algoExpertProblems.BinarySearchTree;

public class FindClosestValueInBST {
	
	// Time: O(n) || Space: O(n)
	public static int findClosestValueInBst(BST tree, int target) {
		return getClosestValueInBsT(tree, target, tree.value);
	}
	
	private static int getClosestValueInBsT(BST tree, int target, int closest) {
		if(tree!=null && Math.abs(target-closest)>Math.abs(target-tree.value))
			closest = tree.value;	
		
		if(tree!=null && target>tree.value)
			return getClosestValueInBsT(tree.right, target, closest);
		else if(tree!=null)
			return getClosestValueInBsT(tree.left, target, closest); 
		
		return closest;
	}

	// Time: O(n) || Space: O(1)
	public static int findClosestValueInBst1(BST tree, int target) {
		BST curNode = tree;  
		int lowestDist = Integer.MAX_VALUE;
		int lowestDistNode = 0;
		while(curNode!=null) {	
			int curDist = Math.abs(target - curNode.value);
			if(curDist<lowestDist) {
				lowestDist = curDist;
				lowestDistNode = curNode.value;
			}	
			if(target>curNode.value) {
				curNode = curNode.right;
			}else { 
				curNode = curNode.left;
			}
		}
	    return lowestDistNode;
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
