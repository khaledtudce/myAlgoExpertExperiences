package algoExpertProblems.searching;

public class SearchInSortedMatrix {
	// Time: O(n+m) (just one row and column) | Space: O(1)
	public int[] searchInSortedMatrix(int[][] matrix, int target) {
		int row=0;
		int col=matrix[0].length-1;
		while(row<matrix.length && col>=0) {
			if(target==matrix[row][col])
				return new int[] {row,col};
			
			if(target>matrix[row][col])
				row++;
			else
				col--;
		}
		
		return new int[] {-1, -1};
	}
	
	// Time: O(log m X n) || Space: O(1)
	public int[] searchInSortedMatrix1(int[][] matrix, int target) {
		int column = 0;
		int left = 0;
		int right = matrix[0].length-1;
		
		while(column<matrix.length) {
			int middleInCurrentRow = (left+right)/2;
			if(matrix[column][middleInCurrentRow]== target)
				return new int[] {column, middleInCurrentRow};
			
			if(target>matrix[column][middleInCurrentRow])
				left = middleInCurrentRow+1;
			else
				right = middleInCurrentRow-1;
			
			if(left>right) {
				column++;
				left = 0;
				right = matrix[0].length-1;
			}
		}
		
	    return new int[] {-1, -1};
	}
}
