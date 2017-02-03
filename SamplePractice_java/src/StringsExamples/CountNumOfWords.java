package StringsExamples;

import java.util.Scanner;

public class CountNumOfWords {
	
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] sWords=s.split(" ");
		System.out.println("Number of words in string are: "+sWords.length);
		
	}

}
	