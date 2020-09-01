package dataStructures;

public class NFactorial {
	public int nFactorial(int number) {
		int result = 1;
		return getNFactorial(number, result);
	}

	private int getNFactorial(int number, int result) {
		if(number==0)
			return result;
		
		return getNFactorial(number-1, result*=number);
	}
}
