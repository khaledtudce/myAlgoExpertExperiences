package algoExpertProblems.Strings;

import java.util.Arrays;

public class PatternMatcher {
	
	// Time: O(n^2+m) || Space: O(n+m)
	public String[] patternMatcher(String pattern, String str) {
		String[] patternArray = pattern.split("");
		int numberOfX=0, numberOfY=0;
		for (int i = 0; i < patternArray.length; i++) {
			if(patternArray[i].equals("x"))
				numberOfX++;
			else 
				numberOfY++;
		}
		if(changePatternIfStartedWithY(patternArray))
			return getXYFromStr(str, patternArray, numberOfY, numberOfX, true);
		else
			return getXYFromStr(str, patternArray, numberOfX, numberOfY, false);
	}

	private String[] getXYFromStr(String givenStr, String[] patternArray, int numberOfX, 
			int numberOfY, boolean isChangedPattern) {
		StringBuilder builder = new StringBuilder();
		int lengthX = 1;
		while(lengthX*numberOfX<=givenStr.length()) {
			String xString = givenStr.substring(0, lengthX);
			String yString = "";
			if(numberOfY>0) {
				int lengthY = (givenStr.length()-lengthX*numberOfX)/numberOfY;
				int yLocationInStr = lengthX*Arrays.asList(patternArray).indexOf("y");
				yString = givenStr.substring(yLocationInStr, yLocationInStr+lengthY);
			}
			for (int i = 0; i < patternArray.length; i++) {
				if(patternArray[i].equals("x")) 				
					builder.append(xString);
				else 
					builder.append(yString);
			}		
			if(builder.toString().equals(givenStr)) {
				if(!isChangedPattern)
					return new String[] {xString, yString};
				else 
					return new String[] {yString, xString};
			}else {
				lengthX++;
				builder.delete(0, builder.length());
			}
		}
		return new String[] {};
	}
	
	private boolean changePatternIfStartedWithY(String[] patternArray) {
		if(patternArray[0].equals("y")) {
			for (int i = 0; i < patternArray.length; i++) {
				if(patternArray[i].equals("x")) {
					patternArray[i] = "y";
				}else {
					patternArray[i]= "x";
				}
			}
			return true;
		}
		
		return false;
	}
}








