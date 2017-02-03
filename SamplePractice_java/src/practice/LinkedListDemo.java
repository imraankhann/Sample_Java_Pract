package practice;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String>linkdLst=new LinkedList<String>();
		linkdLst.add("Item1");
		linkdLst.add("Item2");
		linkdLst.add("Item3");
		linkdLst.add("Item4");
		linkdLst.add("Item5");
		linkdLst.add("Item6");
		
		System.out.println("Linked list elements after addition are: "+linkdLst);
		linkdLst.addFirst("First Item");
		linkdLst.addLast("Last Item");
		
		System.out.println("Linked list after first and last element addition are : "+linkdLst);
		
		String firstVar=linkdLst.get(0);
		System.out.println("First element from get method is : "+firstVar);
		linkdLst.set(0, "Changed First Item");
		System.out.println("First element after update by set method : "+linkdLst);
		String firstVar2=linkdLst.get(0);
		System.out.println("First var after update by set method is : "+firstVar2);
		linkdLst.removeLast();
		linkdLst.removeFirst();
		System.out.println("Linked lst after removal of first and last is : "+linkdLst);
		linkdLst.add(0, "Newly added item");
		linkdLst.remove(3);
		System.out.println("Final content is : "+linkdLst);
		
	}

}
