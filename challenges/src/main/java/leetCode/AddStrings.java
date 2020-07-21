package leetCode;

public class AddStrings {

	public String addStrings(String num1, String num2) {

		StringBuilder stringBuilder = new StringBuilder();
		int carry = 0;
		int locationNum1 = num1.length()-1;
		int locationNum2 = num2.length()-1;
		int forLoopLength = num1.length() > num2.length() ? num1.length() : num2.length();
		for (int i = 0; i < forLoopLength; i++) {
			int currenNum1Position = getNumberForTheCurrentPosition(num1, locationNum1);
			int currenNum2Position = getNumberForTheCurrentPosition(num2, locationNum2);;	
			int oneDigitSumResult = currenNum1Position + currenNum2Position;
			
			if(carry == 1) {
				oneDigitSumResult++;
				carry = 0;
			}
			
			if(oneDigitSumResult>9) {
				oneDigitSumResult = oneDigitSumResult-10;
				carry = 1;
			}
			stringBuilder.insert(0, oneDigitSumResult);
			
			locationNum1--;
			locationNum2--;
			
			if(isCarryLeft(carry, locationNum1, locationNum2))
				stringBuilder.insert(0, carry);
		}
			
		return stringBuilder.toString();
	}

	private boolean isCarryLeft(int carry, int locationNum1, int locationNum2) {
		return locationNum1<0 && locationNum2<0 && carry == 1;
	}

	private int getNumberForTheCurrentPosition(String num, int locationNum) {
		if(locationNum<0)
			return 0;
		else
			return Character.getNumericValue(num.charAt(locationNum));
	}

}
