package StringsExamples;

import java.text.DecimalFormat;

public class UpperCaseLowerCaseDigitsPercent {
	public static void main(String[] args) {
		charPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
	}
	
	public static void charPercentage(String inputString){
		int totalChars=inputString.length();
		int UpperCaseChar=0;
		int LowerCaseChar=0;
		int digits=0;
		int others=0;
		
		for(int i=0;i<inputString.length();i++){
			char ch=inputString.charAt(i);
			if(Character.isUpperCase(ch)){
				UpperCaseChar++;
			}
			else if(Character.isLowerCase(ch)){
				LowerCaseChar++;
				
			}
			else if (Character.isDigit(ch)){
				digits++;
			}
			else{
				others++;
			}
		}
		
		//Calculate percentage of uppercase , lower case, digits and others in string
		double upperCasePercent=(UpperCaseChar*100)/totalChars;
		double lowerCasePercent=(LowerCaseChar*100)/totalChars;
		double digitsPercent=(digits*100)/totalChars;
		double othersPercent=(others*100)/totalChars;
		DecimalFormat formatter=new DecimalFormat("##.##");
		System.out.println("In '"+inputString+"' :");
		System.out.println("Upper case letters are: "+formatter.format(upperCasePercent)+"%");
		System.out.println("lower case letters are : "+formatter.format(lowerCasePercent)+"%");
		System.out.println("Digits are : "+formatter.format(digitsPercent)+"%");
		System.out.println("Others are : "+formatter.format(othersPercent)+"%");
		
	}

}
