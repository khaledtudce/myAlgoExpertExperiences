package algoExpertProblems.BinarySearchTree;

import static org.junit.Assert.*;

import org.junit.Test;

import algoExpertProblems.BinarySearchTree.BSTConstruction.BST;

public class BSTConstructionTest {

	  @Test
	  public void TestCase1() {
		BST root = new BSTConstruction.BST(10);
	    root.left = new BSTConstruction.BST(5);
	    root.left.left = new BSTConstruction.BST(2);
	    root.left.left.left = new BSTConstruction.BST(1);
	    root.left.right = new BSTConstruction.BST(5);
	    root.right = new BSTConstruction.BST(15);
	    root.right.left = new BSTConstruction.BST(13);
	    root.right.left.right = new BSTConstruction.BST(14);
	    root.right.right = new BSTConstruction.BST(22);

	    root.insert(12);
	    assertTrue(root.right.left.left.value == 12);

	    assertTrue(root.contains(15));
	    assertTrue(root.contains(14));
	    assertTrue(root.contains(1));
	    assertFalse(root.contains(3));
	    
	    root.remove(10);
	    assertTrue(root.contains(10) == false);
	    assertTrue(root.value == 12);
	    
	    root.remove(15);
	    assertTrue(root.contains(15) == false);
	    assertTrue(root.right.value == 22);
	  }

}
