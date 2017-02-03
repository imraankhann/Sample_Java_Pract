package careercup;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CountDupCharAndPrintInSameOrder {
	public static void main(String[] args) {
		dupCharInSameOrder("Hello");
		
	}
	
	private static String dupCharInSameOrder(String s){
		char[] cArr=s.toCharArray();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(char c: cArr){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
				
			}
			else{
				hm.put(c, 1);
				
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(Entry<Character,Integer> entry: hm.entrySet()){
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb.toString());
		return s;
		
	}

}
