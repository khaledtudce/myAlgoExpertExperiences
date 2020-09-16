package algoExpertProblems.Searching;

public class SearchForRange {

	// Time: O(logn) || Space: O(1)
	public int[] searchForRange(int[] array, int target) {
		int[] result = new int[] {-1, -1};		
		int L=0, R=array.length-1;
		while(L<=R) { // detect left side
			int m=(L+R)/2;
			int middleNum = array[m];
			if ((middleNum==target && m==0) || (middleNum==target && array[m-1]!=target)) {
				result[0]=m;
				break;
			}if(target<=middleNum) // it will be left oriented
				R=m-1;
			else 
				L=m+1;
		}
		
		L=0; 
		R=array.length-1;
		while(L<=R) { // detect right side
			int m=(L+R)/2;
			int middleNum = array[m];
			if ((middleNum==target && m==array.length-1) || middleNum==target && array[m+1]!=target) {
				result[1]=m;
				break;
			}if(target>=middleNum) // it will be right oriented
				L=m+1;
			else 
				R=m-1;
		}
		
		return result;
	}

	
	// Time: O(logn) || Space: O(logn)
	public int[] searchForRange2(int[] array, int target) {
		return recursiveSearchForRange(array, target, 0, array.length-1);
	}
	
	private int[] recursiveSearchForRange(int[] array, int target, int L, int R) {
		if(L>R) return new int[]{-1,-1};
		int middle = (L+R)/2;
		int leftNum = array[L];
		int rightNum = array[R];
		int middleNumber = array[middle];
		
		if(target==middleNumber) {
			L=middle-1;
			R=middle+1;
			while(L>=0 && array[L]==target) L--;
			while(R<=array.length-1 && array[R]==target) R++;
			return new int[] {++L, --R};
		}else if(target>=leftNum && target<middleNumber)
			return recursiveSearchForRange(array, target, L, middle-1);
		else if(target>middleNumber && target<=rightNum)
			return recursiveSearchForRange(array, target, middle+1, R);
		else
			return new int[] {-1, -1};
	}

	// Time: O(logn) || Space: O(1)
	public int[] searchForRange1(int[] array, int target) {
		int L=0, R=array.length-1;
		while(L<=R) {
			int middle = (L+R)/2;
			int leftNum = array[L];
			int rightNum = array[R];
			int middleNumber = array[middle];
			if(target==middleNumber) {
				L=middle-1;
				R=middle+1;
				while(L>=0 && array[L]==target) L--;
				while(R<=array.length-1 && array[R]==target) R++;
				return new int[] {++L, --R};
			}else if(target>=leftNum && target<middleNumber)
				R = middle-1;
			else if(target>middleNumber && target<=rightNum)
				L = middle+1;
			else
				return new int[] {-1, -1};
		}
		
		return new int[] {-1, -1};
	}
}




