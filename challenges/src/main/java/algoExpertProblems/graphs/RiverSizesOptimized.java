package algoExpertProblems.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RiverSizesOptimized {
	// Time: O(logn), space: O(logn)
	public List<Integer> riverSizes(int[][] matrix) {
		List<Integer> riverList = new ArrayList<Integer>(); 
		
		boolean [][] visitedNodes = new boolean[matrix.length][matrix[0].length];
		
		for (Integer i=0; i<matrix.length; i++) {
			for (Integer j=0; j<matrix[i].length;j++) {
				if(visitedNodes[i][j]==true || matrix[i][j]==0) // time: O (logn), space: O(logn)
					continue;
				
				traverseNodes(i, j, matrix, visitedNodes, riverList);	
			}
		}	
		Collections.sort(riverList);
		
	    return riverList;
	}

	private void traverseNodes(Integer i, Integer j, int[][] matrix, boolean[][] visitedNodes, List<Integer> unsortedRivers) {
		int currentRiverSize = 0;
		Stack<Integer[]> nodesStack = new Stack<Integer[]>();
		
		//graph DFS
		nodesStack.push(new Integer[] {i, j}); // initial node
		while(!nodesStack.empty()) {
			Integer[] currentNode = nodesStack.pop(); // pick a node from stack to process
			i = currentNode[0];
			j= currentNode[1];
			if(visitedNodes[i][j] == true)
				continue;
			
			visitedNodes[i][j] = true;
			
			currentRiverSize++;
			
			for (Integer[] integers : getUnvisitedNeighbourNodes(i, j, matrix, visitedNodes)) {
				nodesStack.push(integers);
			}
		}
		if(currentRiverSize>0)
			unsortedRivers.add(currentRiverSize);
	}

	private List<Integer[]> getUnvisitedNeighbourNodes(Integer i, Integer j, int[][] matrix, boolean[][] visitedNodes) {
		List<Integer[]> unvisitedNeighbours = new ArrayList<Integer[]>();

		if(j<matrix[i].length-1 && isNotVisitedAndNonZeroValue(i,j+1,matrix,visitedNodes)) // right 
			unvisitedNeighbours.add(new Integer[] {i, j+1});
		if(i<matrix.length-1 && isNotVisitedAndNonZeroValue(i+1,j,matrix,visitedNodes)) // down
			unvisitedNeighbours.add(new Integer[] {i+1, j});
		if(j>0 && isNotVisitedAndNonZeroValue(i,j-1,matrix,visitedNodes)) // left
			unvisitedNeighbours.add(new Integer[] {i, j-1});
		if(i>0 && isNotVisitedAndNonZeroValue(i-1, j,matrix,visitedNodes)) // up
			unvisitedNeighbours.add(new Integer[] {i-1, j});
		
		return unvisitedNeighbours;
	}
	
	private boolean isNotVisitedAndNonZeroValue(int i, int j, int[][] matrix, boolean[][] visitedNodes) {
		return !visitedNodes[i][j] && matrix[i][j]!=0;
	}
}


























