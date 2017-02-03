package practice;

import java.util.ArrayList;

public class FIndMultipleOf3And5 {
	
	public static void main(String[] args) {
		ArrayList<Integer>x=new ArrayList<Integer>();
		ArrayList<Integer>y=new ArrayList<Integer>();
		
		int totalforthree=0;
		int totalforfive=0;
		int total=0;
		
		for(int i=0;i<100;i++){
			if(i%3==0)
			{
				x.add(i);
				System.out.println(x);
				totalforthree+=i;
			}
		}
			
		for(int i=0;i<100;i++){
			if(i%5==0){
				y.add(i);
				System.out.println(y);
				totalforfive+=i;
			}
		}
		total=totalforthree;//+totalforfive;
		System.out.println("multiples of 3 and 5 upto 1000 are : "+total);
	}

}
