package algoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ZigzagTraverse {
	
	// Time: O(n) || Space: O(n) where n is total elements of two dimensional array
	public List<Integer> zigzagTraverse(List<List<Integer>> array) {
		List<Integer> result = new ArrayList<Integer>();
		int row=0, col=0;
		int height=array.size()-1, width= array.get(0).size()-1;
		boolean isDirectionToDown = true;
		while(!(row<0 || col<0 || row>height || col> width)) {
			result.add(array.get(row).get(col));
			if(isDirectionToDown) {
				if(col==0 || row==height) {
					isDirectionToDown=false;
					if(row==height)
						col++;
					else 
						row++;
				}else {
					row++;
					col--;
				}
			}else {
				if(row==0 || col==width) {
					isDirectionToDown=true;
					if(col==width)
						row++;
					else
						col++;
				}else {
					row--;
					col++;
				}
			}
		}
		
		return result;
	}
	
	// Time: O(n) || Space: O(n) where n is total elements of two dimensional array
	public List<Integer> zigzagTraverse1(List<List<Integer>> array) {
		List<Integer> result = new ArrayList<Integer>();
		int height = array.size(), width = array.get(0).size();
		if(height==1) {
			for (int i = 0; i < width; i++) 
				result.add(array.get(0).get(i));
			return result;
		}
		result.add(array.get(0).get(0));
		int row=1, col=0;
		while(true) {
			while(row>=0 && col<width) {
				result.add(array.get(row).get(col));
				if(row==height-1 && col==width-1)
					return result;
				row--; col++;
			}
			if(row<0 && col==width) {
				row=row+2;
				col--;
			}else if(row<0)
				row++;
			else if(col>width-1) {
				row = row+2;
				col--;
			}
			while(col>=0 && row<height) {
				result.add(array.get(row).get(col));
				if(row==height-1 && col==width-1)
					return result;
				row++; col--;
			}
			if(row==height && col<0) {
				row--;
				col=col+2;
			}else if(col<0)
				col++;
			else if(row>height-1) {
				row--;
				col=col+2;
			}
		}
	}
}


