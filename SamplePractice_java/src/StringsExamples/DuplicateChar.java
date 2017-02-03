package StringsExamples;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChar {
	public static void main(String[] args) {
	findDup("Java");
	findDup("Sana");
		
			
		
	}
	
	public static void findDup(String inputString){
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		char [] inpArr=inputString.toCharArray();
		for(char c: inpArr){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
		
		Set<Character> chaInStr=map.keySet();
		for(char ch:chaInStr){
			if(map.get(ch)>1){
				System.out.println(ch+" :"+map.get(ch));
			}
		}
	}
}
