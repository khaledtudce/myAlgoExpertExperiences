package algoExpertProblems.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KnacpsackProblem {
	
	public List<List<Integer>> knapsackProblem(int[][] items, int capacity) {
		int[][] valueTable = new int[items.length+1][capacity+1];
		for (int i = 1; i < valueTable.length; i++) {
			for (int j = 0; j < valueTable[i].length; j++) {
				int currentItemValue = items[i-1][0];
				int currentItemWeight = items[i-1][1];
				int lastUpperValue = valueTable[i-1][j];
				if(j<currentItemWeight)
					valueTable[i][j] = lastUpperValue;
				else { 
					int lastUpperDiffValue = valueTable[i-1][j-currentItemWeight];
					valueTable[i][j]=Math.max(lastUpperValue, 
							currentItemValue+lastUpperDiffValue);
				}
			}
		}
		return getKnapsackItems(valueTable, items, valueTable[items.length][capacity]);
	}

	private List<List<Integer>> getKnapsackItems(int[][] valueTable, int[][] items, int highestValue) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> itemIndexs = new ArrayList<Integer>();
		int i = valueTable.length-1;
		int j = valueTable[0].length-1;
		while(i>0) {
			if(valueTable[i][j]==valueTable[i-1][j])
				i--;
			else {
				itemIndexs.add(0, i-1);
				j=j-items[i-1][1];
				i--;
			}
		}
		result.add(Arrays.asList(highestValue));
		result.add(itemIndexs);
		return result;
	}

	
	
	// This did not worked
	public List<List<Integer>> knapsackProblem1(int[][] items, int capacity) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(capacity<=0) {
			result.add(Arrays.asList(0));
		    result.add(Arrays.asList());
			return result;
		}
		int highestValues = 0;
		List<Integer> highestIndexes = new ArrayList<Integer>();
		for (int i = 0; i < items.length; i++) {
			int sumsValue=items[i][0], sumWeight=items[i][1];
			List<Integer> itemIndexs = new ArrayList<Integer>();
			itemIndexs.add(i);
			if(highestValues<sumsValue && sumWeight<=capacity) {
				highestValues=sumsValue;
				highestIndexes=new ArrayList<>(itemIndexs);
			}
			int numberOfItemAddedInLevelJ = 0;
			for (int j = i+1; j < items.length; j++) {
				if(sumWeight+items[j][1]>capacity) {
					while(numberOfItemAddedInLevelJ>0) {
						itemIndexs.remove(itemIndexs.size()-1);
						numberOfItemAddedInLevelJ--;
					}
					continue;
				}
				sumsValue=sumsValue+items[j][0];
				sumWeight = sumWeight+items[j][1];
				itemIndexs.add(j);
				numberOfItemAddedInLevelJ++;
				if(highestValues<sumsValue && sumWeight<=capacity) {
					highestValues=sumsValue;
					highestIndexes=new ArrayList<>(itemIndexs);
				}
				if(j==items.length-1) {
					while(numberOfItemAddedInLevelJ>0) {
						itemIndexs.remove(itemIndexs.size()-1);
						numberOfItemAddedInLevelJ--;
					}
				}
				int numberOfItemAddedInLevelk = 0;
				for (int k = j+1; k < items.length; k++) {
					if(sumWeight+items[k][1]>capacity) { 
						if(k==items.length-1) {
							sumsValue=sumsValue-items[j][0];
							sumWeight=sumWeight-items[j][1];
							while(numberOfItemAddedInLevelk>0) {
								itemIndexs.remove(itemIndexs.size()-1);
								numberOfItemAddedInLevelk--;
							}
						}
						continue;
					}
					sumsValue=sumsValue+items[k][0];
					sumWeight=sumWeight+items[k][1];
					itemIndexs.add(k);
					numberOfItemAddedInLevelk++;
					if(highestValues<sumsValue && sumWeight<=capacity) {
						highestValues=sumsValue;
						highestIndexes=new ArrayList<>(itemIndexs);
					}
					if(k==items.length-1) {
						sumsValue=sumsValue-items[j][0];
						sumWeight=sumWeight-items[j][1];
						while(numberOfItemAddedInLevelk>0) {
							itemIndexs.remove(itemIndexs.size()-1);
							numberOfItemAddedInLevelk--;
						}
					}
					int numberOfItemAddedInLevelL = 0;
					for (int l = k+1; l < items.length; l++) {
						if(sumWeight+items[l][1]>capacity) {
							if(l==items.length-1) {
								sumsValue=sumsValue-items[k][0];
								sumWeight=sumWeight-items[k][1];
								while(numberOfItemAddedInLevelL>0) {
									itemIndexs.remove(itemIndexs.size()-1);
									numberOfItemAddedInLevelL--;
								}
							}
							continue;
						}
						sumsValue=sumsValue+items[l][0];
						sumWeight=sumWeight+items[l][1];
						itemIndexs.add(l);
						numberOfItemAddedInLevelL++;
						if(highestValues<sumsValue && sumWeight<=capacity) {
							highestValues=sumsValue;
							highestIndexes=new ArrayList<>(itemIndexs);
						}
						if(l==items.length-1) {
							sumsValue=sumsValue-items[k][0];
							sumWeight=sumWeight-items[k][1];
							while(numberOfItemAddedInLevelL>0) {
								itemIndexs.remove(itemIndexs.size()-1);
								numberOfItemAddedInLevelL--;
							}
						}
					}
				}
			}
		}
		
	    result.add(Arrays.asList(highestValues));
	    result.add(highestIndexes);
	    return result;
	}
}
