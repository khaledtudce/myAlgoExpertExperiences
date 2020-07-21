package algoExpertProblems.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RiverSizes {
	// Time: O(n), space: O(n)
	public List<Integer> riverSizes(int[][] matrix) {
		List<Integer> islands =  new ArrayList<Integer>();
		boolean[][] visitedNodes =  new boolean[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(visitedNodes[i][j]==true)
					continue;
				
				traverseNodesAndFindIslands(i, j, matrix, visitedNodes, islands);
			}
		}
		
		Collections.sort(islands);
		return islands;
	}

	private void traverseNodesAndFindIslands(int i, int j, int[][] matrix, boolean[][] visitedNodes, List<Integer> islands) {
		int oneIslandSize = 0;
		Stack<Integer[]> nodesStack = new Stack<Integer[]>();
		nodesStack.push(new Integer[] {i, j});
		while(!nodesStack.empty()) {
			Integer[] currentNode = nodesStack.pop();
			i=currentNode[0];
			j= currentNode[1];
			if(visitedNodes[i][j]==true)
				continue;
			
			visitedNodes[i][j]= true;
			
			if(matrix[i][j]==0)
				continue;
			
			oneIslandSize++;
			
			List<Integer[]> univitedNeighbours = getUnvisitedNeighbours(i, j, matrix, visitedNodes);
			for (Integer[] node : univitedNeighbours) {
				nodesStack.push(node);
			}
		}
		if(oneIslandSize>0)
			islands.add(oneIslandSize);
	}

	private List<Integer[]> getUnvisitedNeighbours(int i, int j, int[][] matrix, boolean[][] visitedNodes) {
		List<Integer[]> unvisitedNeighbours = new ArrayList<Integer[]>();
		//if ij=11
		if(j>0 && !visitedNodes[i][j-1]) // left 10 
			unvisitedNeighbours.add(new Integer[] {i, j-1});
		
		if(j<matrix[i].length-1 && !visitedNodes[i][j+1]) // right 12
			unvisitedNeighbours.add(new Integer[] {i, j+1});
		
		if(i>0 && !visitedNodes[i-1][j]) // up 01
			unvisitedNeighbours.add(new Integer[] {i-1, j});
		
		if(i<matrix.length-1 && !visitedNodes[i+1][j]) // down 21 
			unvisitedNeighbours.add(new Integer[] {i+1, j});
		
		return unvisitedNeighbours;
	}

}
