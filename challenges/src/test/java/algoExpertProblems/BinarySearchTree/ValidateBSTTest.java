package algoExpertProblems.BinarySearchTree;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateBSTTest {

	@Test
	public void TestCase1() {
	    var root = new ValidateBST.BST(10);
	    root.left = new ValidateBST.BST(5);
	    root.left.left = new ValidateBST.BST(2);
	    root.left.left.left = new ValidateBST.BST(1);
	    root.left.right = new ValidateBST.BST(5);
	    root.right = new ValidateBST.BST(15);
	    root.right.left = new ValidateBST.BST(13);
	    root.right.left.right = new ValidateBST.BST(14);
	    root.right.right = new ValidateBST.BST(22);
	
	    assertTrue(ValidateBST.validateBstRecursive(root));
	}

	@Test
	public void TestCase2() {
	    var root = new ValidateBST.BST(10);
	    root.left = new ValidateBST.BST(5);
	    root.left.right = new ValidateBST.BST(10);
	    root.right = new ValidateBST.BST(15);
	
	    assertTrue(!ValidateBST.validateBstRecursive(root));
	}
}
