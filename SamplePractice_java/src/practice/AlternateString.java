package practice;

import java.util.TreeMap;

public class AlternateString {

public static void main(String[] args) {
	String s="imraan";
	for(int i=0;i<s.length();i++){
		if((s.charAt(i)=='a') || 
		   (s.charAt(i)=='e') ||
		   (s.charAt(i)=='i') ||
		   (s.charAt(i)=='o') ||
		   (s.charAt(i)=='u') ){
			System.out.println("String contains vowels at "+s.charAt(i));
		}
		
	}
}
		
	
}
