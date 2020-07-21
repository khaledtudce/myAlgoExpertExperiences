package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class FindIslandSizes {

	public List<Integer> getIslandSizeFor(int[][] matrix) {
		// Time: O(logn), space: O(logn)
		List<Integer> isLands = new ArrayList<Integer>(); 
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(visited[i][j] == true || matrix[i][j] == 0)
					continue;
				
				visitConnectedNodes(i, j, matrix, visited, isLands);
			}
		}
		Collections.sort(isLands);
		
		return isLands;
	}

	private void visitConnectedNodes(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> isLands) {
		int oneIsLandCurrentSize = 0;
		Stack<Integer[]> nodeStack = new Stack<Integer[]>();
		nodeStack.push(new Integer[] {i,j});
		
		while(!nodeStack.empty()) {
			Integer[] topNode = nodeStack.pop();
			i = topNode[0];
			j = topNode[1];
			
			if(visited[i][j] == true)
				continue;
			
			visited[i][j] = true;
			
			oneIsLandCurrentSize++;
			
			for (Integer[] node : getNeighbourNodes(i, j, matrix, visited)) {
				nodeStack.push(node);
			}
		}
		if(oneIsLandCurrentSize>0)
			isLands.add(oneIsLandCurrentSize);
	}

	private List<Integer[]> getNeighbourNodes(int i, int j, int[][] matrix, boolean[][] visited) {
		List<Integer[]> neighbourNodes = new ArrayList<Integer[]>();
		
		// 11
		if(i>0 && getNotVisitedNonzeroValueFor(i-1,j, matrix, visited))//01 up
			neighbourNodes.add(new Integer[] {i-1, j});
		if(j<matrix[i].length-1 &&  getNotVisitedNonzeroValueFor(i,j+1, matrix, visited))//12 right
			neighbourNodes.add(new Integer[] {i, j+1});
		if(i<matrix.length-1 && getNotVisitedNonzeroValueFor(i+1,j, matrix, visited))//21 down
			neighbourNodes.add(new Integer[] {i+1, j});
		if(j>0 && getNotVisitedNonzeroValueFor(i,j-1, matrix, visited))//10 left
			neighbourNodes.add(new Integer[] {i, j-1});
		
		return neighbourNodes;
	}
	
	private boolean getNotVisitedNonzeroValueFor(int i, int j, int[][] matrix, boolean[][] visited) {
		return !visited[i][j] && matrix[i][j] != 0;
	}
}

















