package StringsExamples;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInGivenName {
	
	public static void main(String[] args) {
		findDup("Imraan");
		
	}
	
	public static void findDup(String s){
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		char[] inpArr=s.toCharArray();
		for(char c:inpArr ){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
			
		}
		
		Set<Character> charInStr=map.keySet();
		for(char ch: charInStr){
			if(map.get(ch)>1){
				System.out.println(ch +":"+ map.get(ch));
			}
		}
	}

}
