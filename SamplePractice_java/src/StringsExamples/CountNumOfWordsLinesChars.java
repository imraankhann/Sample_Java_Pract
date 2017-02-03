package StringsExamples;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountNumOfWordsLinesChars {

	
	public static void main(String[] args) {
		BufferedReader reader=null;
				int charcount=0;
				int wordcount=0;
				int linecount=0;
				
				try {
					reader=new BufferedReader(new FileReader("\\Users\\12045\\Documents\\SampleTxt.txt"));
					String currentLine=reader.readLine();
					while(currentLine!=null){
						linecount++;
						String[] words=currentLine.split(" ");
						for(String word: words){
							charcount=charcount+word.length();
						}
						currentLine=reader.readLine();
					}
					
					System.out.println("Numer of chars in a file : "+charcount);
					System.out.println("Number of words in a file : "+wordcount);
					System.out.println("Number of line in a file : "+linecount);
				} catch (Exception e) {
					e.printStackTrace();
				}
				finally{
					try {
						reader.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
	}
	
	
	
}
