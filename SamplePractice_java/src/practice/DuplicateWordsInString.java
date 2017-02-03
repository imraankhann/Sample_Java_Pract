package practice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	
	public static void main(String[] args) {
		duplicateWrds("Bread butter and bread");
	}
	
	public static void duplicateWrds(String str){
		
		String[] wrd=str.split(" ");
		
		HashMap<String,Integer>wrdCount=new HashMap<String,Integer>();
				for(String wr: wrd){
					if(wrdCount.containsKey(wr)){
						wrdCount.put(wr.toLowerCase(), wrdCount.get(wr.toLowerCase())+1);
					}
					else{
						wrdCount.put(wr.toLowerCase(), 1);
					}
				}
		
				Set<String>wrdInStr=wrdCount.keySet();
				for(String w: wrdInStr){
					if(wrdCount.get(w)>1){
						System.out.println(w +" : "+wrdCount.get(w));
					}
				}
		
	}
}
