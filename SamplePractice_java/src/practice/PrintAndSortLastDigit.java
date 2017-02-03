package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintAndSortLastDigit {
	public static void main(String[] args) {
		
		int i= 25323;
		int last=i%10;
		//System.out.println(last);
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(4235);
		lst.add(2223);
		lst.add(12147);
		lst.add(12132);
		Collections.sort(lst);
		Collections.reverse(lst);
		Iterator i1= lst.iterator();
		
		while(i1.hasNext())
			{ 
			Object ele=i1.next();
			System.out.println(ele);
			
		}
		ComprImpl com=new ComprImpl();
		System.out.println("After comparator");
		Collections.sort(lst,com);
		for (int i2 : lst) {
			System.out.println(i2);
			
		}
		
	}
	

}
