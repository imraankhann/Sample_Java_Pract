package practice;

import java.util.List;
import java.util.ArrayList;

public class RemoveDupFromArrayList {
	
	public static void main(String[] args) {
//		List<String> al =new ArrayList<String>();
//		al.add("java");
//		al.add("J2ee");
//		al.add("manga");
//		al.add("java");
//		al.add("Selenium");
//		al.add("Appium");
//		
////		
//			System.out.println("Before removing duplicates: "+ al);
//			for(int i=0;i<al.size();i++){
//				for(int j=i+1;j<al.size();j++){
//					if(al.get(i).equals(al.get(j))){
//						al.remove(j);
//					}
//				}
//		}
//			
//			System.out.println("After removal of duplicates: "+al);
//	}
//		String note="Successfully created child VF Ids:[439]";
//		String[] not=note.split(":");
//		for(int i=0;i<not.length-1;i++){
//		//System.out.println(not[i]);}
//			System.out.println(not[1].toString().replace("[", "").replace("]", "").trim());
//		}
//		String not1=not[1].toString().replace("[", "").replace("]", "").trim();
//		System.out.println("Not 1 : "+not1);
//		String[] not2=not1.split(",");
//		//for(int j=0;j<not2.length;j++){
//			System.out.println("not2 is : "+not2[0]);
		//}
		int count=0;
		String s="India is great is";
		String[] strArr=s.split(" ");
		for(int i=0;i<=strArr.length-1;i++){
			if(strArr[i].equals("is")){
				count++;
				
			}
			
		}
		
		
	}
}
