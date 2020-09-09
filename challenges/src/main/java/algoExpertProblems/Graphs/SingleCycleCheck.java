package algoExpertProblems.Graphs;

public class SingleCycleCheck {
	
	//Time: O(n) || Space: O(1)
	public  boolean hasSingleCycle2(int[] array) {
		int numberOfIteration = 0;
		int cursorLocation = 0;
		while (numberOfIteration<array.length) {
			if(numberOfIteration>0 && cursorLocation ==0) // pre-matured Loop found
				return false;
			numberOfIteration++;
			
			// make a silling when extreme bigger or smaller number found
			cursorLocation = (cursorLocation + array[cursorLocation]) % array.length;
			if(cursorLocation<0)
				cursorLocation = array.length + cursorLocation;
		}
		
		return cursorLocation==0;
	}
	
	//Time: O(n) || Space: O(n) because visited[] used
	public  boolean hasSingleCycle(int[] array) {
		boolean[] visited= new boolean[array.length];
		visited[0] = true;
		int cursorLocation = 0;
		int numberOfIteration = 0;
		while(numberOfIteration<array.length) {
			cursorLocation = (cursorLocation + array[cursorLocation]) % array.length;
			
			if(cursorLocation<0)
				cursorLocation = array.length + cursorLocation;
			
			visited[cursorLocation] = true;
			numberOfIteration++;
		}
	
	    if(array[0]!=0 && cursorLocation==0 && isAllNodeVisited(visited))
	    	return true;
	    else
	    	return false;
	}
	
	private boolean isAllNodeVisited(boolean[] visited) {
		for (boolean oneNode : visited) {
			if(oneNode==false)
				return false;
		}
		return true;
	}	
	
	//Time: O(n) || Space: O(n) because visited[] used
	public  boolean hasSingleCycle1(int[] array) {
		boolean[] visited= new boolean[array.length];
		visited[0] = true;
		int cursorLocation = 0;
		boolean firstTime = true;
		int numberOfIteration = 0;
		while(firstTime || cursorLocation!=0) { // this is shit that I did
			firstTime = false;
			cursorLocation = (cursorLocation + array[cursorLocation]) % array.length;
			
			if(cursorLocation<0)
				cursorLocation = array.length + cursorLocation;
			
			visited[cursorLocation] = true;
			
			if(numberOfIteration>=array.length)
				break;
			numberOfIteration++;
		}
	
	    if(array[0]!=0 && cursorLocation==0 && isAllNodeVisited(visited))
	    	return true;
	    else
	    	return false;
	}
		
}
