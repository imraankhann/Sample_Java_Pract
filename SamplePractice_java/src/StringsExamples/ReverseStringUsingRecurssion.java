package StringsExamples;

public class ReverseStringUsingRecurssion {
   static String reverse="";
	public static void main(String[] args) {
		
		System.out.println(reverseStringRecurssion("Java concept of the day"));
		
	}
	public static String reverseStringRecurssion(String inputString){
		if(inputString.length()==1){
			return inputString;
			
		}
		else{
				reverse=inputString.charAt(inputString.length()-1)+reverseStringRecurssion(inputString.substring(0,inputString.length()-1));
				return reverse;
		}
	}
}
