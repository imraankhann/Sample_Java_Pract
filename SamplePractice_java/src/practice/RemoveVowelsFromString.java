package practice;

import java.util.Scanner;

public class RemoveVowelsFromString {
	
	public static void main(String[] args) {
		String str="";
		removeVowels(str);
	}
	public static void removeVowels(String str){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		System.out.println("Removing vowels from string [" +str+ "]\n ");
		String strNew=str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("String without vowels is : "+strNew);
	}

}
