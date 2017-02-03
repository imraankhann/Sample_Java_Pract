package StringsExamples;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {
	public static void main(String[] args) {
		duplicateWords("Bread butter and bread");
	}
	
	public static void duplicateWords(String inputStr){
		String[] words=inputStr.split(" ");
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		for(String w: words){
			if(map.containsKey(w.toLowerCase())){
				map.put(w.toLowerCase(), map.get(w.toLowerCase())+1);
			}
			else{
				map.put(w.toLowerCase(), 1);
			}
		}
		
		Set<String>wordsInString=map.keySet();
		for(String w:wordsInString){
			if(map.get(w)>1){
				System.out.println(w+" :"+map.get(w));
			}
		}
		
		
	}
	

}
