package algoExpertProblems.BinarySearchTree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TreeTraversalTest {

	  @Test
	  public void TestCase1() {
	    var root = new TreeTraversal.BST(10);
	    root.left = new TreeTraversal.BST(5);
	    root.left.left = new TreeTraversal.BST(2);
	    root.left.left.left = new TreeTraversal.BST(1);
	    root.left.right = new TreeTraversal.BST(5);
	    root.right = new TreeTraversal.BST(15);
	    root.right.right = new TreeTraversal.BST(22);

	    List<Integer> inOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 10, 15, 22});
	    List<Integer> preOrder = Arrays.asList(new Integer[] {10, 5, 2, 1, 5, 15, 22});
	    List<Integer> postOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 22, 15, 10});

	    assertTrue(TreeTraversal.inOrderTraverse(root, new ArrayList<Integer>()).equals(inOrder));
	    assertTrue(TreeTraversal.preOrderTraverse(root, new ArrayList<Integer>()).equals(preOrder));
	    assertTrue(TreeTraversal.postOrderTraverse(root, new ArrayList<Integer>()).equals(postOrder));
	  }

}
