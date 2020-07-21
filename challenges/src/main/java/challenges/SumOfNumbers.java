package challenges;

public class SumOfNumbers {

	public Integer getSum(int i, int j) {
		if(i==j)
			return doWhenSame(i,j);
		else if(i<0)
			return firstNumberNegativeFound(i,j);
		else if(j<0)
			return firstNumberNegativeFound(j, i);
		else
			return doWhenNonNegativeAndNotSame(i,j);
	}
	
	private Integer firstNumberNegativeFound(int i, int j) {
		for(int p=0; p<=j; p++)
			i = i+=p;
		return i;
	}

	private Integer doWhenSame(int i, int j) {
		return i;
	}

	Integer doWhenNonNegativeAndNotSame(int i, int j) {
		
		return i+j;
	}
	
}
