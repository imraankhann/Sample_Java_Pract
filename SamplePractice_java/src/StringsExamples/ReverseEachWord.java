package StringsExamples;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		reverseEchWrd("Java is a tricky language");
		
	}
	public static void reverseEchWrd(String inputString){
		String[] word=inputString.split(" ");
		System.out.println("Word length is :"+word.length);
		String reverseString="";
		for (int i = 0; i < word.length; i++) {
			String words=word[i];
			String reverseWord="";
			for(int j=words.length()-1;j>=0;j--){
				reverseWord=reverseWord+words.charAt(j);
				
			}
			reverseString=reverseString+reverseWord+" ";
			
			
		}
		System.out.println(inputString);
		System.out.println(reverseString);
		
	}
}
