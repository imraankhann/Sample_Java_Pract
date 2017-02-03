package StringsExamples;

import java.util.Scanner;

public class NumberOrNo {
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		String n=sc.nextLine();
//		if(Integer.parseInt(n)==Integer.valueOf(n)){
//			System.out.println(n+" Is an integer");
//			
//		}
//		else{
//			System.out.println(n + "is not an intger");
//		}
		
		System.out.println("Enter yoru number: ");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(numberorNot(input)){
			System.out.println("You have entereed a number");
			
		}
		else{
		System.out.println("You have entered invalid input");}
	}
		public static boolean numberorNot(String str){
				try{
					Integer.parseInt(str);
					
				}
				catch(NumberFormatException e){
					return false;
				}
				return true;
		}
	

}
