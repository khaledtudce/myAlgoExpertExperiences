package leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class InvertBinaryTreeTest {
	
	@Test
	public void test() {
		InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
		TreeNode inputTree = createBinaryTree();
		TreeNode output = createInvertedTree();
		TreeNode resultedTree = invertBinaryTree.invertTree(inputTree);
		assertThat(resultedTree).isEqualTo(output);
	}
	
	private TreeNode createBinaryTree() {
		TreeNode root = new TreeNode(4);
		TreeNode first = new TreeNode(2);
		TreeNode second = new TreeNode(7);
		TreeNode third = new TreeNode(1);
		TreeNode fourth = new TreeNode(3);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(9);
		
		root.left = first;
		root.right = second;
		
		first.left = third;
		first.right = fourth;
		
		second.left = sixth;
		second.right = seventh;
		
		return root;
	}
	
	private TreeNode createInvertedTree() {
		TreeNode root = new TreeNode(4);
		TreeNode first = new TreeNode(7);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(9);
		TreeNode fourth = new TreeNode(6);
		TreeNode sixth = new TreeNode(3);
		TreeNode seventh = new TreeNode(1);
		
		root.left = first;
		root.right = second;
		
		first.left = third;
		first.right = fourth;
		
		second.left = sixth;
		second.right = seventh;
		
		return root;
	}

}
