package practice;

import java.util.Scanner;

public class UpsideDownPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num of rows: ");
		int noOfRows=sc.nextInt();
		int rowCount=noOfRows;
		
		printUpsidDown(noOfRows);
		System.out.println( "===================>>>>>>>>>> <<<<<<<<<<<<<===================");
		printEquilateral(noOfRows);
		
				
	}
	
	public static void printUpsidDown(int noOfRows){
		System.out.println("Pyramid is : ");
		for(int i=0;i<noOfRows;i++){
			for(int j=1;j<=i*2;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=noOfRows;j++){
				System.out.print(j+" ");
			}
			for(int j=noOfRows-1;j>=1;j--){
				System.out.println(j+" ");
			}
			System.out.println();
			noOfRows--;
		}
	}
	
	public static void printEquilateral(int noOfRows){
		int rowcount=1;
		for(int i=noOfRows;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=rowcount;j++){}
			System.out.print(rowcount+" ");
			
		}
		System.out.println();
		rowcount++;
		
	}
}
