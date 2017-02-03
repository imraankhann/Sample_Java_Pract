package ExceptionHandling;

import java.util.Scanner;

public class UserDefinedExceptions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try{
			if(age<0){
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("Age cannot by less then zero-1");
		}
	}

}
