package practice;

import java.util.HashMap;
import java.util.Set;

public class CharCountInString {
	
	public static void main(String[] args) {
		charCountStr("All Is Well");
	}
	
	public static void charCountStr(String str){
		char[] ch=str.toCharArray();
		
		HashMap<Character,Integer>charCountMap=new HashMap<Character,Integer>();
		for(char c: ch){
			if(charCountMap.containsKey(c)){
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else{
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);
		
		Set<Character>dupCh=charCountMap.keySet();
		for(char chs: dupCh){
			if(charCountMap.containsKey(chs)){
				System.out.println(chs +" : "+charCountMap.get(chs));
			}
			
		}
	}
	
	

}
