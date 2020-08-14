package algoExpertProblems.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
	
	// Time: O(n) || Space: O(d) where d is highest depth of array
	public static int productSum(List<Object> complexList) {
		return getProductSum(complexList, 1);
	}
	
	private static int getProductSum(List<Object> complexList, int multiplier) {
		int sum = 0;
		for (Object item : complexList) {
			if(item instanceof ArrayList) {
				@SuppressWarnings("unchecked")
				ArrayList<Object> innerItem = (ArrayList<Object>) item;
				sum = sum + getProductSum(innerItem, multiplier+1);
			}else
				sum = sum + (int) item;
		}
		return sum * multiplier;
	}

}
