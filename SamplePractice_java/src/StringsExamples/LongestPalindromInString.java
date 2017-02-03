package StringsExamples;

public class LongestPalindromInString {
	
	public static void main(String[] args) {
		longstPalindrome("dad");
		longstPalindrome("mom");
		longstPalindrome("malyalam");
		longstPalindrome("Bus");
		
	}
	
	public static void longstPalindrome(String inputString){
		//String str="I love my dad and malyalam";
		String reverString="";
		String [] strArr=inputString.split(" ");
		//char [] word=
		int length=inputString.length();
		for(int i=length-1;i>=0;i--)
			reverString=reverString+inputString.charAt(i);
			if(inputString.equals(reverString))
				System.out.println(inputString+" is palindrome");
			
			else
				System.out.println(inputString+" is not palindrome");
			
		
	}

}
