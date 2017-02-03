package practice;

import java.util.Scanner;

public class PyramidProg {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows to print pyramid: ");
		int rows=sc.nextInt();
		System.out.println("Printing pyramid with stars :");
		//printPyramid(rows, true);
		printEquiPyramid(rows);
		System.out.println("Printing pyramid without stars : ");
		//printPyramid(rows, false);
		
	}
	
	public static void printPyramid(int rows, boolean isStars){
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(isStars){
					System.out.print("*");
					
					}
				else{
					System.out.print(j);
				}
				}
			System.out.println();
			
		}
	}
	
	public static void printEquiPyramid(int rows){
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<rows-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}
