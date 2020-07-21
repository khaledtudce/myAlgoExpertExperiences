package algoExpertProblems.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class WaterArea {
	
	//	Time: O(n) || Space: O(n)
	public int waterArea(int[] heights) {
		int[] leftMax = new int[heights.length];
		int[] rightMax = new int[heights.length];
		
		int leftMaxValue = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i]>leftMaxValue) {
				leftMax[i] = leftMaxValue;
				leftMaxValue = heights[i];
			}else
				leftMax[i] = leftMaxValue;
		}
		
		int rightMaxValue = 0;
		for (int i = heights.length-1; i >= 0; i--) {
			if(heights[i]>rightMaxValue) {
				rightMax[i] = rightMaxValue;
				rightMaxValue = heights[i];
			}else
				rightMax[i] = rightMaxValue;
		}
		
		int waterArea = 0;
		for (int i = 0; i < heights.length; i++) {
			int minHeight = Math.min(leftMax[i], rightMax[i]);
			if(heights[i]<minHeight)
				waterArea = waterArea + (minHeight - heights[i]);
		}
		
		return waterArea;
	}
	
	
	//	Time: O(nlogn) || Space: O(n) and very high logical complexity
	public int waterArea1(int[] heights) {
		Map<Integer, Integer> indexSillingsMap = new HashMap<Integer, Integer>();
		initializeSillings(indexSillingsMap, heights);
		int currentSilling = 0;
		int startPointSilling = 0;
		int endPointOfSilling = 0;
		int highestSillingFoundIndex = 0;
		boolean startIndexFound = false;
		for (int i = 0; i < heights.length; i++) {
			if(heights[i]>currentSilling && startIndexFound==false) {
				startPointSilling = i;
				highestSillingFoundIndex = i;
				startIndexFound=true;
				continue;
			}else if(startIndexFound==true && heights[i]>0 && heights[i]<currentSilling) {
				startPointSilling = endPointOfSilling;
				if(startPointSilling>heights[highestSillingFoundIndex])
					highestSillingFoundIndex = i;
				currentSilling = heights[i];
				endPointOfSilling = i;
				setIndexSillings(startPointSilling+1, endPointOfSilling-1, currentSilling, indexSillingsMap);
				
			}else if(startIndexFound==true && heights[i]>0 && heights[i]<=heights[startPointSilling]) {
				currentSilling = heights[i];
				endPointOfSilling = i;
				setIndexSillings(startPointSilling+1, endPointOfSilling-1, currentSilling, indexSillingsMap);
				
			}else if(startIndexFound==true && heights[i]>=heights[highestSillingFoundIndex]) {
				currentSilling = heights[highestSillingFoundIndex];
				endPointOfSilling = i;
				setIndexSillings(highestSillingFoundIndex+1, endPointOfSilling-1, currentSilling, indexSillingsMap);
				highestSillingFoundIndex = i;
			}
		}
		
		int waterArea = 0;
		for (int i = 0; i < heights.length; i++) {
			int currentSilling1 = indexSillingsMap.get(i);
			int currentHeight = heights[i];
			if(currentHeight<currentSilling1)
				waterArea = waterArea + (currentSilling1 - currentHeight);
		}
		
		return waterArea;
	}

	private void setIndexSillings(int startPointSilling, int endPointOfSilling, int currentSilling, Map<Integer, Integer> indexSillingsMap) {
		for (int i = startPointSilling; i <= endPointOfSilling; i++) {
			indexSillingsMap.put(i, currentSilling);
		}
	}
	
	private void initializeSillings(Map<Integer, Integer> indexSillingsMap, int[] heights) {
		for (int i = 0; i < heights.length; i++) {
			indexSillingsMap.put(i, 0);
		}
	}
}
