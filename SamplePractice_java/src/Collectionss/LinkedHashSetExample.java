package Collectionss;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
		
		for(int i=1;i<10;i++){
			lhs.add(i);
			System.out.println("Customer Token number in Queue: C"+i+" and his count is: "+i );
		}
		
	}
}
