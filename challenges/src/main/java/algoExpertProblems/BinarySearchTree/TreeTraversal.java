package algoExpertProblems.BinarySearchTree;

import java.util.List;
import java.util.Stack;

public class TreeTraversal {
	
	// Time: O(n) || Space: O(n)
	public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
		if(tree.left != null)
			inOrderTraverse(tree.left, array);
		array.add(tree.value);
		if(tree.right != null)
			inOrderTraverse(tree.right, array);
		
		return array;
	}
	
	// Time: O(n) || Space: O(n)
	public static List<Integer> inOrderTraverse2(BST tree, List<Integer> array) {
		if(tree==null)
			return array;
		
		inOrderTraverse(tree.left, array);
		array.add(tree.value);
		inOrderTraverse(tree.right, array);
		
		return array;
	}


	  // Time: O(n) || Space: O(n)
	  public static List<Integer> inOrderTraverse1(BST tree, List<Integer> array) {
		  Stack<BST> stack = new Stack<BST>();
		  while(true) {
			  while(tree != null) {
				  stack.push(tree);
				  tree = tree.left;
			  }
			  if(stack.isEmpty())
				  break;
			  
			  tree = stack.pop();
			  array.add(tree.value);
			  tree = tree.right;
		  }
		  
		  return array;
	  }

	  // Time: O(n) || Space: O(n)
	  public static List<Integer> preOrderTraverse2(BST tree, List<Integer> array) {
		  array.add(tree.value);
		  if(tree.left!=null)
			  preOrderTraverse(tree.left, array);
		  if(tree.right!=null)
			  preOrderTraverse(tree.right, array);
		  
		  return array;
	  }
	  
	  // Time: O(n) || Space: O(n)
	  public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
		  if(tree == null)
			  return array;
		  array.add(tree.value);
		  preOrderTraverse(tree.left, array);
		  preOrderTraverse(tree.right, array);
		  
		  return array;
	  }
	  
	  // Time: O(n) || Space: O(n)
	  public static List<Integer> preOrderTraverse1(BST tree, List<Integer> array) {
		  Stack<BST> stack = new Stack<BST>();
		  stack.push(tree);
		  while(!stack.isEmpty()) {
			  BST curNode = stack.pop();
			  array.add(curNode.value);
			  
			  if(curNode.right != null)
				  stack.push(curNode.right);
			  if(curNode.left != null)
				  stack.push(curNode.left);
		  }
		  
		  return array;
	  }
	  
	  // Time: O(n) || Space: O(n)
	  public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
		  if(tree.left!=null)
			  postOrderTraverse(tree.left, array);
		  
		  if(tree.right!=null)
			  postOrderTraverse(tree.right, array);
		  
		  array.add(tree.value);
		  return array;
	  }
	  
	  // Time: O(n) || Space: O(n)
	  public static List<Integer> postOrderTraverse2(BST tree, List<Integer> array) {
		  if(tree==null)
			  return array;
		  
		  postOrderTraverse(tree.left, array);
		  postOrderTraverse(tree.right, array);
		  array.add(tree.value);
		  
		  return array;
	  }

	  // Time: O(n) || Space: O(n^2)
	  public static List<Integer> postOrderTraverse1(BST tree, List<Integer> array) {
		  Stack<BST> stack1 = new Stack<BST>();
		  Stack<Integer> stack2 = new Stack<Integer>();
		  stack1.push(tree);
		  while(!stack1.isEmpty()) {
			  BST curNode = stack1.pop();
			  stack2.push(curNode.value);
			  
			  if(curNode.left != null)
				  stack1.push(curNode.left);
			  if(curNode.right != null)
				  stack1.push(curNode.right);
		  }
		  
		  while(!stack2.isEmpty()) {
			  array.add(stack2.pop());
		  }
		  
		  return array;
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
