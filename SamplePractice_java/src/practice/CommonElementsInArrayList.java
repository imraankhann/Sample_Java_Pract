package practice;

import java.util.ArrayList;

public class CommonElementsInArrayList {
	
	public static void main(String[] args) {
		ArrayList<String>al1=new ArrayList<String>();
		al1.add("e1");
		al1.add("e2");
		al1.add("e3");
		al1.add("e4");
		al1.add("e5");
		
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("e1");
		al2.add("e2");
		al2.add("e3");
		al2.add("e7");
		al2.add("e8");
		al2.add("e9");
		
		System.out.println(">>>>>>>>>>>>>> Before removal of common elements  <<<<<<<<<<<");
		System.out.println("List 1 is : "+al1);

		System.out.println("\n"+"List 2 is : "+al2);
		System.out.println(">>>>>>>>>>>>>> After removal of common elements <<<<<<<<<<<<");
		al1.removeAll(al2);
		System.out.println(al1);
	}

}
