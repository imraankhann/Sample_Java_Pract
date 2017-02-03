package Collectionss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		
		Collection<Integer> values= new ArrayList<Integer>();
		values.add(41);
		values.add(5);
		values.add(14);
		values.add(23);
		
		Iterator i= values.iterator();
		while(i.hasNext()){
		System.out.println(i.next());
		}
	}

}
