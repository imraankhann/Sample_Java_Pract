package practice;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num,s;
	System.out.println("Enter a num");
	num=sc.nextInt();
	s=num;
	System.out.println(isHappy(s));

}
public  static int getsum(int n){
	int sum=0;
	while(n>0){
		sum+=(n%10)*(n%10);
		n=n/10;
	}
	return sum;
}
	

public static boolean isHappy(int j){
	HashSet<Integer> set=new HashSet<Integer>();
	while(!set.contains(j)){
		set.add(j);
		j=getsum(j);
		if(j==1){
			return true;
			
		}
		
	}
	return false;
	
	
}
}

