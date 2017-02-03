package careercup;

import java.util.HashSet;
import java.util.Set;

public class MissingElementsFrom2Arrays 
	{
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int c[]={1,3,4,5,6};
		Set<Integer>set1=new HashSet<Integer>();
		Set<Integer>set2=new HashSet<Integer>();
		for(int num:a){
			set1.add(num);
		}
		for(int num: c){
			set2.add(num);
			
		}
		set1.removeAll(set2);
		System.out.println(set1);
		
	}
	

}
