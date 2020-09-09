package algoExpertProblems.BinaryTrees;

import static org.junit.Assert.*;

import org.junit.Test;

import algoExpertProblems.BinaryTrees.NodeDepth;

public class NodeDepthTest {

	  @Test
	  public void TestCase1() {
		NodeDepth.BinaryTree root = new NodeDepth.BinaryTree(1);
	    
		root.left = new NodeDepth.BinaryTree(2);
	    root.left.left = new NodeDepth.BinaryTree(4);
	    root.left.left.left = new NodeDepth.BinaryTree(8);
	    root.left.left.right = new NodeDepth.BinaryTree(9);
	    root.left.right = new NodeDepth.BinaryTree(5);
	    
	    root.right = new NodeDepth.BinaryTree(3);
	    root.right.left = new NodeDepth.BinaryTree(6);
	    root.right.right = new NodeDepth.BinaryTree(7);
	    
	    int actual = NodeDepth.nodeDepths(root);
	    assertEquals(16, actual);
	  }

}
