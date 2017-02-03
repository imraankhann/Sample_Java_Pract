package StringsExamples;

public class ReverseEachWordStr {
	
	public static void main(String[] args) {
		reverseEachWord("I am a human being");
	}
	
	private static void reverseEachWord(String str){
		
		String[] s=str.split(" ");
		String revStr="";
		for(int i=0;i<s.length;i++){
			String word=s[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--){
				revWord=revWord+word.charAt(j);
			}
			revStr=revStr+revWord+" ";
		}
		System.out.println(revStr);
	}

}
