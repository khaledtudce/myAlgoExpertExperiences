package algoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
	
	// Time: O(N) || Space: O(N)
	public List<Integer> spiralTraverse1(int[][] array) {
		List<Integer> result = new ArrayList<Integer>();
		return getSpiralTraverse(array, result, 0, array[0].length-1, 0, array.length-1);
	}
	
	private List<Integer> getSpiralTraverse(int[][] array, List<Integer> result, int startCol, 
			int endCol, int startRow, int endRow) {
			
		if(startRow>endRow || startCol>endCol)
				return result;
			
		for(int col=startCol;col<=endCol;col++) result.add(array[startRow][col]);
		for(int row=startRow+1;row<=endRow;row++) result.add(array[row][endCol]);
		for(int col=endCol-1;col>=startCol;col--) {
			if(startRow==endRow) break;
			result.add(array[endRow][col]);
		}
		for(int row=endRow-1;row>startRow;row--) {
			if(startCol==endCol) break;
			result.add(array[row][startCol]);
		}
		
		// double pointer method for two dimensional array
		startRow++;
		startCol++;
		endRow--;
		endCol--;
		
		return getSpiralTraverse(array, result, startCol, endCol, startRow, endRow);
	}

	// Time: O(N) || Space: O(N)
	public List<Integer> spiralTraverse2(int[][] array) {
		List<Integer> result = new ArrayList<Integer>();
		int startCol=0, endCol=array[0].length-1;
		int startRow=0, endRow=array.length-1;
		while(startRow<=endRow && startCol<=endCol) {
			for(int col=startCol;col<=endCol;col++) result.add(array[startRow][col]);
			for(int row=startRow+1;row<=endRow;row++) result.add(array[row][endCol]);
			for(int col=endCol-1;col>=startCol;col--) {
				if(startRow==endRow) break;
				result.add(array[endRow][col]);
			}
			for(int row=endRow-1;row>startRow;row--) {
				if(startCol==endCol) break;
				result.add(array[row][startCol]);
			}
			
			// double pointer method for two dimensional array
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
		
		return result;
	}
	
	// Time: O(N) || Space: 2N where big N means whole element of the two dimensional array
	public List<Integer> spiralTraverse(int[][] array) {
		List<Integer> result = new ArrayList<Integer>();
		boolean[][] isVisited = new boolean[array.length][array[0].length];
		int row=0, col=0, count = 0, rowLength = array.length-1, colLength = array[0].length-1;
		char direction  = 'r';
		while(count<array[0].length*array.length){
			if(!(row<0 || col<0 || row>rowLength || col>colLength) && !isVisited[row][col]) {
				// go forward to any direction
				result.add(array[row][col]);
				isVisited[row][col]=true;	
				if(direction=='r' && col<=array[row].length-1) {
					col++;
				}else if(direction=='d' && row<=array.length-1) {
					row++;
				}else if(direction=='l' && col>=0) {
					col--;
				}else if(direction=='u' && row>=0) 
					row--;	
			}else { // turn
				if(direction=='u') {
					row++;
					col++;
					direction = 'r';
				}else if(direction=='r') {
					row++;
					col--;
					direction = 'd';
				}else if(direction=='d') {
					row--;
					col--;
					direction = 'l';
				}else if(direction=='l') {
					row--;
					col++;			
					direction = 'u';
				}	
				continue;
			}			
			count++;
		}
		
		return result;
	}
}
