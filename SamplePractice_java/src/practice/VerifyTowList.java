package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerifyTowList {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("CREDIT/DEBIT CARD","NET BANKING");
	    String str4="[[CREDIT/DEBIT CARD, NET BANKING]]";
//	   String str5= str4.replace("[", "").replace("]", "");
//	   String[] strArr= str5.split(",");
//	   
//	    
//		char strArr1[]=str5.toCharArray();
//		for (String c : strArr) {
//			System.out.println(c);
//			
//		}
//		System.out.println("List is : "+list);
//		List<String>lst2= new ArrayList<String>();
//		lst2.add(str5);
//		System.out.println("Lst2 is : "+lst2);
//		
//	    boolean isStringExists =list.equals(lst2);
//	    System.out.println(isStringExists);
	    
	    String act=str4.replace("[", "").replace("]", "");
	    System.out.println("===="+act);
	    String exc =list.toString().replace("[", "").replace("]", "");
	    System.out.println("===="+exc);
	    System.out.println(act.trim().equals(exc.trim())?true:false);
	    
//	    if(act.trim().equals(exc.trim())){
//	    	
//	    }else{
//	    	
//	    }

	}

}
