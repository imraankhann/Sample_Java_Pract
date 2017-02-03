package careercup;

import java.util.HashMap;
import java.util.Set;

//Find first non-repeated char in string

public class FirstNonRepeatedChInStr {

	public static void main(String[] args) {
		System.out.println(nonRepeatedChar("stress"));
	}
	
	public static Character nonRepeatedChar(String str){
		char[] ch=str.toCharArray();
		int i,length;
		Character cht;
		length=str.length();
		
		HashMap<Character,Integer>hmp=new HashMap<Character,Integer>();
		for(i=0;i<length-1;i++){
			cht=str.charAt(i);
//		}
//		for (char c : ch) {
			if(hmp.containsKey(cht)){
				hmp.put(cht, hmp.get(cht)+1);
			}
			else
			{
				hmp.put(cht, 1);
			}
			
		}
		
		
//		for(char chr:st){
		for(i=0;i<length;i++){
			cht=str.charAt(i);
			if(hmp.get(cht)==1){
				return cht;
			}
			
		}
		return null; 
	}
}
