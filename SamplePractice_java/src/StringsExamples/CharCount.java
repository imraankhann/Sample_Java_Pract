package StringsExamples;

import java.util.HashMap;

public class CharCount {
	
	public static void main(String[] args) {
		charCount("I love India, and hate politicians!");
		charCount("abbcdc");
	}
	
	private static void charCount(String inputString){
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		char[] strArray=inputString.toCharArray();
		for(char c: strArray){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
