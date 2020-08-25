package algoExpertProblems.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class MinHeightBST {

	// Time: O(n) || Space: O(n) because we don't use insert method which inserts from root
	public static BST minHeightBst(List<Integer> array) {
		return getMinHeightBST3(array, 0, array.size()-1);
	}
	
	// We did Pre-order traverse
	private static BST getMinHeightBST3(List<Integer> array, int startIdx, int endIdx) {
		if(endIdx<startIdx) // that means no element left in this sub array
			return null;    // when endIdx==startIdx, there is 1 element in this sub array
		
		int middle = (startIdx + endIdx)/2;
		BST bst = new BST(array.get(middle));
		bst.left = getMinHeightBST2(array, bst, startIdx, middle-1);
		bst.right = getMinHeightBST2(array, bst, middle+1, endIdx);
		
		return bst;
	}

	// Time: O(n) || Space: O(n) because we don't use insert method which inserts from root
	public static BST minHeightBst3(List<Integer> array) {
		return getMinHeightBST2(array, null, 0, array.size()-1);
	}
	
	private static BST getMinHeightBST2(List<Integer> array, BST bst, int startIdx, int endIdx) {
		if(endIdx<startIdx) // that means no element left in this sub array
			return null;    // when endIdx==startIdx, there is 1 element in this sub array
		
		int middle = (startIdx + endIdx)/2;
		BST newBstNode = new BST(array.get(middle));
		if(bst==null) 
			bst = newBstNode;
		else {
			if(array.get(middle)<bst.value) {
				bst.left = newBstNode;
				bst = bst.left;
			}else {
				bst.right = newBstNode;
				bst = bst.right;
			}
		}
		
		getMinHeightBST2(array, bst, startIdx, middle-1);
		getMinHeightBST2(array, bst, middle+1, endIdx);
		return bst;
	}



	// Time: O(nlogn) || Space: O(n) because inserting each node requires logn time from root
	public static BST minHeightBst2(List<Integer> array) {
		return getMinHeightBST(array, null, 0, array.size()-1);
	}
	
	// We did Pre-order traverse
	private static BST getMinHeightBST(List<Integer> array, BST bst, int startIdx, int endIdx) {
		if(endIdx<startIdx) // that means no element left in this sub array
			return null;    // when endIdx==startIdx, there is 1 element in this sub array
		
		int middle = (startIdx + endIdx)/2;
		Integer valueOfIndex = array.get(middle);
		if(bst==null)
			bst=new BST(valueOfIndex);
		else
			bst.insert(valueOfIndex);
		
		getMinHeightBST(array, bst, startIdx, middle-1);
		getMinHeightBST(array, bst, middle+1, endIdx);
		
		return bst;
	}

	// Exactly same theory like recursive but it does not work for all condition
	public static BST minHeightBst1(List<Integer> array1) {
		List<Integer> array = new ArrayList<Integer>();
		array.addAll(array1);
		BST bst = null;
		while(array.size()!=0) {
			if(array.size()<3) {
				for (Integer integer : array)
					bst.insert(integer);				
				break;
			}
			
			int endIdx = array.size()-1;
			int middle = endIdx/2;
			if(bst==null)
				bst = new BST(array.get(middle));
			else
				bst.insert(array.get(middle));
			
			int firstHalfMiddle = (0+(middle-1))/2;
			int secondHalfMiddle = ((middle+1) + endIdx)/2;			
			bst.insert(array.get(firstHalfMiddle));
			bst.insert(array.get(secondHalfMiddle));
			
			array.remove(secondHalfMiddle);
			array.remove(middle);
			array.remove(firstHalfMiddle);
		}
		
		return bst;
	}

	static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	      left = null;
	      right = null;
	    }

	    public void insert(int value) {
	      if (value < this.value) {
	        if (left == null) {
	          left = new BST(value);
	        } else {
	          left.insert(value);
	        }
	      } else {
	        if (right == null) {
	          right = new BST(value);
	        } else {
	          right.insert(value);
	        }
	      }
	    }
	 }
}
